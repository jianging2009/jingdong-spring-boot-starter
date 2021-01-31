package com.holyw.jingdong.utils.jingdong;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.holyw.jingdong.vo.GoodsVO;
import jd.union.open.goods.query.response.GoodsResp;
import jd.union.open.goods.query.response.UnionOpenGoodsQueryResponse;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.util.ArrayList;

public class JingdongGoodsTransUtils {
    public static GoodsVO transform2GoodsVO(UnionOpenGoodsQueryResponse unionOpenGoodsQueryResponse) {

        GoodsVO goodsVO = null;

        if (null != unionOpenGoodsQueryResponse && unionOpenGoodsQueryResponse.getCode() == 200 && null != unionOpenGoodsQueryResponse.getData() && unionOpenGoodsQueryResponse.getData().length > 0) {
            GoodsResp goodsResp = unionOpenGoodsQueryResponse.getData()[0];
            //Map<String,Object> result = JsonUtils.jsonToPojo(JsonUtils.objectToJson(goodsResp), Map.class);
            JSONObject result = JSONObject.parseObject(JSONObject.toJSONString(goodsResp));
            goodsVO = getJdGoodsVo(result);
        }
        return goodsVO;
    }

    private static GoodsVO getJdGoodsVo(JSONObject goodsResp) {
        GoodsVO goodsVO = new GoodsVO();
        goodsVO.setGoodsId(goodsResp.getString("skuId"));
        goodsVO.setTitle(goodsResp.getString("skuName"));//sku标题
        goodsVO.setAliasTitle(goodsVO.getTitle());
        goodsVO.setOwner("g".equals(goodsResp.getString("owner")) ? 1 : 0);//是否自营
        goodsVO.setMaterialUrl(goodsResp.getString("materialUrl"));//品落地页
        goodsVO.setGoodsEvalScore(goodsResp.getBigDecimal("goodCommentsShare").setScale(2, BigDecimal.ROUND_UP));//商品好评率
        goodsVO.setSales(goodsResp.getLong("inOrderCount30Days"));//30天引单数量


        /**
         * 分类信息
         */
        JSONObject categoryInfo = goodsResp.getJSONObject("categoryInfo");
        if (null != categoryInfo) {
            if (null != categoryInfo) {
                Integer cid1 = categoryInfo.getInteger("cid1");
                Integer cid2 = categoryInfo.getInteger("cid2");
                Integer cid3 = categoryInfo.getInteger("cid3");
                goodsVO.setCidOne(Long.valueOf(null == cid1 ? 0 : cid1));
                goodsVO.setCidTwo(Long.valueOf(null == cid1 ? 0 : cid2));
                goodsVO.setCidThree(Long.valueOf(null == cid1 ? 0 : cid3));
            }
        }
        /**
         * 店铺信息
         */
        JSONObject shopInfoObj = goodsResp.getJSONObject("shopInfo");
        if (null != shopInfoObj) {
            if (null != shopInfoObj) {
                String shopName = shopInfoObj.getString("shopName");
                String shopLevel = shopInfoObj.getString("shopLevel");
                goodsVO.setShopName(shopName);
                goodsVO.setStoreScore(shopLevel);
            }
        }
        /**
         * 视频
         */
        String playUrl = null;
        //String playImageUrl = null;
        JSONObject videoInfo = goodsResp.getJSONObject("videoInfo");
        if (null != videoInfo) {
            JSONArray videoList = videoInfo.getJSONArray("videoList");
            if (null != videoList && videoList.size() > 0) {
                for (Object o : videoList) {
                    JSONObject playVedio = JSONObject.parseObject(o.toString());
                    String playType = playVedio.getString("playType");
                    if (playType.equals("high")) {
                        playUrl = playVedio.getString("playUrl");
                        //playImageUrl = playVedio.getString("imageUrl");
                    }
                    break;
                }
                if (StringUtils.isEmpty(playUrl)) {
                    JSONObject playVedio = JSONObject.parseObject(videoList.getJSONObject(0).toString());
                    playUrl = playVedio.getString("playUrl");
                    //playImageUrl = playVedio.getString("imageUrl");
                }
                goodsVO.setPlayUrl(playUrl);
            }
        }
        /**
         * 图片
         */
        JSONObject imageInfo = goodsResp.getJSONObject("imageInfo");
        if (null != imageInfo) {
            JSONArray imageList = imageInfo.getJSONArray("imageList");
            ArrayList<String> imageListResult = new ArrayList<>();
            for (Object urlInfo : imageList) {
                imageListResult.add(JSONObject.parseObject(JSONObject.toJSONString(urlInfo)).getString("url"));
            }
            goodsVO.setPicList(imageListResult);
            if (null == goodsVO.getPic() && null != imageListResult && imageListResult.size() > 0) {
                goodsVO.setPic(imageListResult.get(0));
                if (null != goodsVO.getPicList() && goodsVO.getPicList().size() > 5) {
                    goodsVO.setHeadPicList(JSONObject.toJSONString(goodsVO.getPicList().subList(0, 5)));
                } else {
                    goodsVO.setHeadPicList(JSONObject.toJSONString(goodsVO.getPicList()));
                }
            }
        }


        /**
         * 获取价格
         */
        goodsVO.setNewUserEnjoy(false);
        Double price = 0.0;
        Double pingouPrice = 0.0;
        JSONObject priceInfo = goodsResp.getJSONObject("priceInfo");
        goodsVO.setOrgPrice(new BigDecimal(priceInfo.getDouble("price").toString()).setScale(2, RoundingMode.HALF_UP));//new Bigdecimal必须用字符串 否则丢失精度
        JSONObject pinGouInfo = goodsResp.getJSONObject("pinGouInfo");
        if (null != pinGouInfo && null != pinGouInfo.getDouble("pingouPrice")) {
            price = pinGouInfo.getDouble("pingouPrice");//设置为拼购价格
            pingouPrice = price;
            if (pingouPrice < 2.0) {
                goodsVO.setNewUserEnjoy(true);
            }
        } else {

            if (null != priceInfo) {
                price = priceInfo.getDouble("price");//设置为无线价格
            }
        }
        goodsVO.setPinGouPrice(new BigDecimal(pingouPrice).setScale(2, RoundingMode.HALF_UP));
        goodsVO.setPrice(new BigDecimal(price.toString()).setScale(2, RoundingMode.HALF_UP));//new Bigdecimal必须用字符串 否则丢失精度

        /**
         * 获取优惠券
         */
        JSONObject couponInfo = goodsResp.getJSONObject("couponInfo");
        Double discount = 0.0;//默认0.0
        if (null != couponInfo) {
//                        System.out.println(couponInfo);
            JSONArray couponList = couponInfo.getJSONArray("couponList");
            if (null != couponList && couponList.size() > 0) {
                JSONObject coupon = null;
                for (Object o : couponList) {//找到最优券，京东联盟建议如此！
                    JSONObject couponTemp = JSONObject.parseObject(JSONObject.toJSONString(o));
                    if (null != couponTemp && null != couponTemp.getInteger("isBest") && 1 == couponTemp.getInteger("isBest")) {
                        coupon = couponTemp;
                        break;
                    }
                }
                //coupon = couponList.getJSONObject(0);
                if (null != coupon) {
                    discount = coupon.getDouble("discount");
                    Double quota = coupon.getDouble("quota");
                    goodsVO.setCouponQuota(new BigDecimal(null == quota ? 0 : quota).setScale(2, RoundingMode.HALF_UP));
                    discount = (quota > price || discount > price) ? 0.0 : discount;//券面额，如果使用条件quota>price 设置为0.0
                    goodsVO.setPrice(goodsVO.getPrice().subtract(new BigDecimal(discount.toString())).setScale(2, RoundingMode.HALF_UP));//new Bigdecimal必须用字符串 否则丢失精度
                    String link = coupon.getString("link");
                    goodsVO.setCouponLink(link);//券链接
                    Long useEndTime = coupon.getLong("useEndTime");
                    Long useStartTime = coupon.getLong("useStartTime");
                    goodsVO.setCouponUseStime(null == useStartTime ? null : new Timestamp(useStartTime));
                    goodsVO.setCouponUseEtime(null == useEndTime ? null : new Timestamp(useEndTime));
                    goodsVO.setHasCoupon(true);
                }
            }
        }
        goodsVO.setCouponPrice(new BigDecimal(discount).setScale(2, RoundingMode.HALF_UP));

        Double commissionShare = 0D;
        JSONObject commissionInfo = goodsResp.getJSONObject("commissionInfo");
        if (null != commissionInfo && commissionInfo.size() > 0) {
            commissionShare = commissionInfo.getDouble("commissionShare");
        }
        goodsVO.setCommissionRatio(new BigDecimal(commissionShare).setScale(2, RoundingMode.HALF_UP));
        return goodsVO;
    }
}
