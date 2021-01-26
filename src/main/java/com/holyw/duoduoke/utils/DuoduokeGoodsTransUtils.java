package com.holyw.duoduoke.utils;

import com.alibaba.fastjson.JSONObject;
import com.holyw.duoduoke.vo.GoodsVO;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.util.List;

public class DuoduokeGoodsTransUtils {
    public static GoodsVO transform2GoodsVO(JSONObject item) {

        GoodsVO goodsVO = null;

        goodsVO = getPddGoodsVo(item);
        return goodsVO;
    }

    private static GoodsVO getPddGoodsVo(JSONObject item) {
        GoodsVO pddGoodsVO = new GoodsVO();
        pddGoodsVO.setGoodsId(item.getString("goodsId"));
        pddGoodsVO.setZsDuoId(item.getLong("zsDuoId"));
        pddGoodsVO.setSearchId(item.getString("searchId"));
        pddGoodsVO.setShopId(item.getLong("mallId"));
        Boolean hasMallCoupon = null == item.get("hasMallCoupon") ? false : (Boolean) item.get("hasMallCoupon");
        pddGoodsVO.setHasMallCoupon(hasMallCoupon);
        if (hasMallCoupon) {
            pddGoodsVO.setMallCouponId(null == item.get("mallCouponId") ? null : ((Number) item.get("mallCouponId")).longValue());
            pddGoodsVO.setMallCouponDiscountPct(null == item.get("mallCouponDiscountPct") ? null : (Integer) item.get("mallCouponDiscountPct"));
            pddGoodsVO.setMallCouponMaxDiscountAmount(null == item.get("mallCouponMaxDiscountAmount") ? null : new BigDecimal((Integer) item.get("mallCouponMaxDiscountAmount")));
            pddGoodsVO.setMallCouponTotalQuantity(null == item.get("mallCouponTotalQuantity") ? null : ((Number) item.get("mallCouponTotalQuantity")).longValue());
            pddGoodsVO.setMallCouponRemainQuantity(null == item.get("mallCouponRemainQuantity") ? null : ((Number) item.get("mallCouponRemainQuantity")).longValue());
            pddGoodsVO.setMallCouponStartTime(null == item.get("mallCouponStartTime") ? null : new Timestamp(((Number) item.get("mallCouponStartTime")).longValue() * 1000));
            pddGoodsVO.setMallCouponEndTime(null == item.get("mallCouponEndTime") ? null : new Timestamp(((Number) item.get("mallCouponEndTime")).longValue() * 1000));
        }
        pddGoodsVO.setTitle((String) item.get("goodsName"));
        pddGoodsVO.setAliasTitle((String) item.get("goodsName"));
        pddGoodsVO.setGoodsDesc((String) item.get("goodsDesc"));
        pddGoodsVO.setGoodsThumbnailUrl((String) item.get("goodsImageUrl"));//实际取的主图，长方形图片
        pddGoodsVO.setPic((String) item.get("goodsThumbnailUrl"));//实际取缩略图，主图是长方形的图片，而且不一定返回
        pddGoodsVO.setOrgPrice(new BigDecimal(((Number) item.get("minGroupPrice")).longValue()).divide(new BigDecimal(100)));
        pddGoodsVO.setMinNormalPrice(new BigDecimal(((Number) item.get("minNormalPrice")).longValue()).divide(new BigDecimal(100)));
        pddGoodsVO.setShopName((String) item.get("mallName"));
        if (item.get("merchantType") instanceof String) {
            pddGoodsVO.setMerchantType(Integer.valueOf((String) item.get("merchantType")));
        } else {
            pddGoodsVO.setMerchantType((Integer) item.get("merchantType"));

        }
        if (item.get("categoryId") instanceof String) {
            pddGoodsVO.setCidOne(Long.valueOf((String) item.get("categoryId")));
        } else {
            pddGoodsVO.setCidOne(null == item.get("categoryId") ? null : ((Number) item.get("categoryId")).longValue());
        }

        pddGoodsVO.setCidNameOne((String) item.get("categoryName"));
        pddGoodsVO.setMallCps((Integer) item.get("mallCps"));

        pddGoodsVO.setHasCoupon(false);
        if (null != item.get("couponDiscount")/* && (Boolean)item.get("hasCoupon")*/) {
            pddGoodsVO.setHasCoupon(true);
            pddGoodsVO.setCouponQuota(null == item.get("couponMinOrderAmount") ? new BigDecimal(0) : new BigDecimal(((Number) item.get("couponMinOrderAmount")).longValue()).divide(new BigDecimal(100)));
            pddGoodsVO.setCouponPrice(null == item.get("couponDiscount") ? new BigDecimal(0) : new BigDecimal(((Number) item.get("couponDiscount")).longValue()).divide(new BigDecimal(100)));
            pddGoodsVO.setCouponUseStime(null == item.get("couponStartTime") ? null : new Timestamp(((Number) item.get("couponStartTime")).longValue() * 1000));
            pddGoodsVO.setCouponUseEtime(null == item.get("couponEndTime") ? null : new Timestamp(((Number) item.get("couponEndTime")).longValue() * 1000));
        }
        pddGoodsVO.setCommissionRatio(null == item.get("promotionRate") ? null : new BigDecimal(((Number) item.get("promotionRate")).longValue()).divide(new BigDecimal(10)));
        //pddGoodsVO.setGoodsEvalScore(null == item.get("goodsEvalScore")?null:new BigDecimal(((Number) item.get("goodsEvalScore")).longValue()).setScale(2, RoundingMode.HALF_UP));
        pddGoodsVO.setComments(null == item.get("goodsEvalCount") ? null : ((Number) item.get("goodsEvalCount")).longValue());

        pddGoodsVO.setSales(getSalsTip(item.get("salesTip")));
        pddGoodsVO.setCouponType(pddGoodsVO.getCouponType());

        pddGoodsVO.setCreateDate(new Timestamp(System.currentTimeMillis()));
        pddGoodsVO.setModifyDate(pddGoodsVO.getCreateDate());
        List<String> goodsGalleryUrls = (List<String>) item.get("goodsGalleryUrls");//商品轮播图
        pddGoodsVO.setPicList(goodsGalleryUrls);
        if (null != goodsGalleryUrls && goodsGalleryUrls.size() > 5) {
            pddGoodsVO.setHeadPicList(JSONObject.toJSONString(goodsGalleryUrls.subList(0, 5)));
        } else {
            pddGoodsVO.setHeadPicList(JSONObject.toJSONString(goodsGalleryUrls));
        }
        if (null == pddGoodsVO.getPic() && null != goodsGalleryUrls && goodsGalleryUrls.size() > 0) {
            pddGoodsVO.setPic(goodsGalleryUrls.get(0));
        }

        //价格计算
        pddGoodsVO.setPrice(pddGoodsVO.getOrgPrice());
        if (pddGoodsVO.isHasCoupon() && pddGoodsVO.getPrice().compareTo(pddGoodsVO.getCouponQuota()) > -1 && pddGoodsVO.getPrice().compareTo(pddGoodsVO.getCouponPrice()) > -1) {
            pddGoodsVO.setPrice(pddGoodsVO.getPrice().subtract(pddGoodsVO.getCouponPrice()).setScale(2, RoundingMode.HALF_UP));
        }

        //店铺描述
        String descTxt = item.getString("descTxt");
        String servTxt = item.getString("servTxt");
        String lgstTxt = item.getString("lgstTxt");
        pddGoodsVO.setDescTxt(descTxt);
        pddGoodsVO.setServTxt(servTxt);
        pddGoodsVO.setLgstTxt(lgstTxt);
        if (item.containsKey("unifiedTags")) {
            pddGoodsVO.setUnifiedTags(item.getString("unifiedTags"));
        }
        //比价行为预判定佣金，需要用户备案
        if (item.containsKey("predictPromotionRate")) {
            pddGoodsVO.setIsComparison(item.getInteger("predictPromotionRate") == 0 ? 1 : 0);
        }
        return pddGoodsVO;
    }

    /**
     * 销量String转Long
     */
    private static Long getSalsTip(Object salesTip) {
        Long salesTipLong = 0L;
        String salesTipStr = (String) salesTip;
        salesTipStr = salesTipStr.replaceAll("已拼", "").replaceAll("件", "");
        if (salesTipStr.indexOf("万") != -1) {
            Double value = Double.valueOf(salesTipStr.replace("万", "").replace("+", "")) * 10000;
            salesTipLong = value.longValue();
        } else if (salesTipStr.indexOf("+") != -1) {
            Double value = Double.valueOf(salesTipStr.replace("+", ""));
            salesTipLong = value.longValue();
        } else {
            Double value = 0D;
            if (!StringUtils.isEmpty(salesTipStr)) {
                value = Double.valueOf(salesTipStr);
            }
            salesTipLong = value.longValue();
        }
        return salesTipLong;
    }
}
