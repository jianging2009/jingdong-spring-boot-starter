package com.holyw.duoduoke.request;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

public class PddDdkGoodsSearchRequest extends com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsSearchRequest implements PddBaseRequest {
    /***
     activity_tags	INTEGER[]	非必填	商品活动标记数组，例：[4,7]，4-秒杀 7-百亿补贴等
     cat_id	LONG	非必填	商品类目ID，使用pdd.goods.cats.get接口获取
     custom_parameters	STRING	非必填	自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     goods_id_list	LONG[]	非必填	已经废弃，不再支持该功能
     is_brand_goods	BOOLEAN	非必填	是否为品牌商品
     keyword	STRING	非必填	商品关键词，与opt_id字段选填一个或全部填写，不支持纯数字(goods_id)搜索
     list_id	STRING	非必填	翻页时建议填写前页返回的list_id值
     merchant_type	INTEGER	非必填	店铺类型，1-个人，2-企业，3-旗舰店，4-专卖店，5-专营店，6-普通店（未传为全部）
     merchant_type_list	INTEGER[]	非必填	店铺类型数组
     opt_id	LONG	非必填	商品标签类目ID，使用pdd.goods.opt.get获取
     page	INTEGER	非必填	默认值1，商品分页数
     page_size	INTEGER	非必填	默认100，每页商品数量
     pid	STRING	非必填	推广位id
     range_list	OBJECT[]	非必填	筛选范围列表 样例：[{"range_id":0,"range_from":1,"range_to":1500},{"range_id":1,"range_from":1,"range_to":1500}]
     range_from	LONG	非必填	区间的开始值
     range_id	INTEGER	非必填	0，最小成团价 1，券后价 2，佣金比例 3，优惠券价格 4，广告创建时间 5，销量 6，佣金金额 7，店铺描述分 8，店铺物流分 9，店铺服务分 10， 店铺描述分击败同行业百分比 11， 店铺物流分击败同行业百分比 12，店铺服务分击败同行业百分比 13，商品分 17 ，优惠券/最小团购价 18，过去两小时pv 19，过去两小时销量
     range_to	LONG	非必填	区间的结束值
     sort_type	INTEGER	非必填	排序方式:0-综合排序;1-按佣金比率升序;2-按佣金比例降序;3-按价格升序;4-按价格降序;5-按销量升序;6-按销量降序;7-优惠券金额排序升序;8-优惠券金额排序降序;9-券后价升序排序;10-券后价降序排序;11-按照加入多多进宝时间升序;12-按照加入多多进宝时间降序;13-按佣金金额升序排序;14-按佣金金额降序排序;15-店铺描述评分升序;16-店铺描述评分降序;17-店铺物流评分升序;18-店铺物流评分降序;19-店铺服务评分升序;20-店铺服务评分降序;27-描述评分击败同类店铺百分比升序，28-描述评分击败同类店铺百分比降序，29-物流评分击败同类店铺百分比升序，30-物流评分击败同类店铺百分比降序，31-服务评分击败同类店铺百分比升序，32-服务评分击败同类店铺百分比降序
     with_coupon	BOOLEAN	非必填	是否只返回优惠券的商品，false返回所有商品，true只返回有优惠券的商品
     */
    public PddDdkGoodsSearchRequest(String keyword, Long optId, Integer page,
                                    Integer pageSize, Integer sortType, Boolean withCoupon, String customParameters, String listId, Integer merchantType, Integer activityTags, Integer commissionRateFrom, Integer commissionRateTo) {
        this.setPid(setDefaultPId());
        if (!StringUtils.isEmpty(keyword)) {
            this.setKeyword(keyword);
        }
        if (!StringUtils.isEmpty(optId)) {
            this.setOptId(optId);
        }
        this.setPage(page);
        this.setPageSize(setDefaultPageSize(pageSize));
        if (!StringUtils.isEmpty(sortType)) {
            this.setSortType(sortType);
        }
        if (!StringUtils.isEmpty(withCoupon)) {
            this.setWithCoupon(withCoupon);
        }
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        if (!StringUtils.isEmpty(merchantType)) {
            this.setMerchantType(merchantType);
        }
        if (!StringUtils.isEmpty(listId)) {
            this.setListId(listId);
        }
        if (!StringUtils.isEmpty(activityTags)) {
            this.setActivityTags(Arrays.asList(activityTags));
        }
        List rangeList = new ArrayList();
        if (!StringUtils.isEmpty(commissionRateFrom) || !StringUtils.isEmpty(commissionRateTo)) {
            Map commission = new HashMap();
            commission.put("range_id", "2");
            if (!StringUtils.isEmpty(commissionRateFrom)) {
                commission.put("range_from", commissionRateFrom * 10);
            }
            if (!StringUtils.isEmpty(commissionRateTo)) {
                commission.put("range_to", commissionRateTo * 10);
            }
            rangeList.add(commission);
        }
        if (!CollectionUtils.isEmpty(rangeList)) {
            this.setRangeList(rangeList);
        }
        List<Integer> blockCatPackages = new ArrayList();
        blockCatPackages.add(2);
        this.setBlockCatPackages(blockCatPackages);
    }

    public PddDdkGoodsSearchRequest(Long optId, Integer page,
                                    Integer pageSize, String listId, Boolean withCoupon, Integer merchantType, Integer activityTags) {
        this.setPid(setDefaultPId());
        if (!StringUtils.isEmpty(optId)) {
            this.setOptId(optId);
        }
        this.setPid(setDefaultPId());
        this.setPage(page);
        this.setPageSize(setDefaultPageSize(pageSize));
        this.setWithCoupon(withCoupon);

        if (!StringUtils.isEmpty(merchantType)) {
            this.setMerchantType(merchantType);
        }
        if (!StringUtils.isEmpty(listId)) {
            this.setListId(listId);
        }
        if (!StringUtils.isEmpty(activityTags)) {
            this.setActivityTags(Arrays.asList(activityTags));
        }
        List<Integer> blockCatPackages = new ArrayList();
        blockCatPackages.add(2);
        this.setBlockCatPackages(blockCatPackages);
    }

    public PddDdkGoodsSearchRequest(String keyword, Long optId, Integer page, Integer pageSize, Integer sortType, Boolean withCoupon, String customParameters, Integer merchantType, String listId, String priceFrom, String priceTo, String commissionRateFrom, String commissionRateTo, Integer activityTags) {
        if (!StringUtils.isEmpty(keyword)) {
            this.setKeyword(keyword);
        }
        if (!StringUtils.isEmpty(optId)) {
            this.setOptId(optId);
        }
        this.setPage(page);
        this.setPageSize(setDefaultPageSize(pageSize));
        if (!StringUtils.isEmpty(sortType)) {
            this.setSortType(sortType);
        }
        if (!StringUtils.isEmpty(withCoupon)) {
            this.setWithCoupon(withCoupon);
        }
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        if (!StringUtils.isEmpty(merchantType)) {
            this.setMerchantType(merchantType);
        }
        if (!StringUtils.isEmpty(listId)) {
            this.setListId(listId);
        }
        if (!StringUtils.isEmpty(listId)) {
            this.setActivityTags(Arrays.asList());
        }
        List rangeList = new ArrayList();
        if (!StringUtils.isEmpty(priceFrom) || !StringUtils.isEmpty(priceTo)) {
            Map price = new HashMap();
            price.put("range_id", "1");
            if (!StringUtils.isEmpty(priceFrom)) {
                price.put("range_from", priceFrom);//分
            }
            if (!StringUtils.isEmpty(priceTo)) {
                price.put("range_to", priceTo);//分
            }
            rangeList.add(price);
        }
        if (!StringUtils.isEmpty(commissionRateFrom) || !StringUtils.isEmpty(commissionRateTo)) {
            Map commission = new HashMap();
            commission.put("range_id", "2");
            if (!StringUtils.isEmpty(commissionRateFrom)) {
                commission.put("range_from", commissionRateFrom);//千分比
            }
            if (!StringUtils.isEmpty(commissionRateTo)) {
                commission.put("range_to", commissionRateTo);//千分比
            }
            rangeList.add(commission);
        }
        if (!CollectionUtils.isEmpty(rangeList)) {
            this.setRangeList(rangeList);
        }
        if (null != activityTags) {
            this.setActivityTags(Arrays.asList(activityTags));
        }
        List<Integer> blockCatPackages = new ArrayList();
        blockCatPackages.add(1);
        blockCatPackages.add(2);
        this.setBlockCatPackages(blockCatPackages);
    }
}
