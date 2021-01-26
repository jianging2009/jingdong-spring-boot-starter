package com.holyw.duoduoke.support;

import com.holyw.duoduoke.request.PddDdkGoodsPromotionUrlGenerateRequest;
import com.holyw.duoduoke.request.PddDdkGoodsRecommendGetRequest;
import com.holyw.duoduoke.request.PddDdkGoodsSearchRequest;
import com.holyw.duoduoke.request.PddDdkLotteryUrlGenRequest;
import com.holyw.duoduoke.request.PddDdkMallUrlGenRequest;
import com.holyw.duoduoke.request.PddDdkResourceUrlGenRequest;
import com.holyw.duoduoke.request.PddDdkRpPromUrlGenerateRequest;
import com.holyw.duoduoke.request.PddDdkTopGoodsListQueryRequest;
import com.pdd.pop.sdk.http.api.pop.request.*;
import com.pdd.pop.sdk.http.api.pop.response.*;

public interface DuoduokeSupportRepository {

    //pdd.ddk.cms.prom.url.generate生成商城-频道推广链接
    PddDdkCmsPromUrlGenerateResponse pddUdkCmsPromUrlGenerate(PddDdkCmsPromUrlGenerateRequest request) throws Exception;

    //pdd.ddk.coupon.info.query查询优惠券信息
    PddDdkCouponInfoQueryResponse pddDdkCouponInfoQuery(PddDdkCouponInfoQueryRequest request) throws Exception;

    //pdd.ddk.finance.cpa.query查询CPA数据
    PddDdkFinanceCpaQueryResponse pddDdkFinanceCpaQuery(PddDdkFinanceCpaQueryRequest request) throws Exception;

    //pdd.ddk.goods.basic.info.get获取商品基本信息接口
    PddDdkGoodsBasicInfoGetResponse pddDdkGoodsBasicInfoGet(PddDdkGoodsBasicInfoGetRequest request) throws Exception;

    //pdd.ddk.goods.detail多多进宝商品详情查询
    PddDdkGoodsDetailResponse pddDdkGoodsDetail(PddDdkGoodsDetailRequest request) throws Exception;

    //pdd.ddk.goods.unit.query查询商品的推广计划
    PddDdkGoodsUnitQueryResponse pddDdkGoodsUnitQuery(PddDdkGoodsUnitQueryRequest request) throws Exception;

    //pdd.ddk.goods.pid.generate创建多多进宝推广位
    PddDdkGoodsPidGenerateResponse pddDdkGoodsPidGenerate(PddDdkGoodsPidGenerateRequest request) throws Exception;

    //pdd.ddk.goods.pid.query查询已经生成的推广位信息
    PddDdkGoodsPidQueryResponse pddDdkGoodsPidQuery(PddDdkGoodsPidQueryRequest request) throws Exception;

    //pdd.ddk.goods.promotion.url.generate多多进宝推广链接生成
    PddDdkGoodsPromotionUrlGenerateResponse pddDdkGoodsPromotionUrlGenerate(PddDdkGoodsPromotionUrlGenerateRequest request) throws Exception;

    //pdd.ddk.goods.recommend.get多多进宝商品推荐API
    PddDdkGoodsRecommendGetResponse pddDdkGoodsRecommendGet(PddDdkGoodsRecommendGetRequest request) throws Exception;

    //pdd.ddk.goods.search多多进宝商品查询
    PddDdkGoodsSearchResponse pddDdkGoodsSearch(PddDdkGoodsSearchRequest request) throws Exception;

    //pdd.ddk.goods.zs.unit.url.gen多多进宝转链接口
    PddDdkGoodsZsUnitUrlGenResponse pddDdkGoodsZsUnitUrlGen(PddDdkGoodsZsUnitUrlGenRequest request) throws Exception;

    //pdd.ddk.live.detail查询直播间详情
    //PddDdkLiveDetailResponse pddDdkLiveDetail(pddDdkLiveDetailRequest request)  throws Exception;

    //pdd.ddk.live.list查询直播间列表
    //PddDdkLiveListResponse pddDdkLiveList(PddDdkLiveListRequest request)  throws Exception;

    //pdd.ddk.live.url.gen生成直播间推广链接
    //PddDdkLiveUrlGenResponse pddDdkLiveUrlGen(PddDdkLiveUrlGenRequest request)  throws Exception;

    //pdd.ddk.lottery.url.gen多多客生成转盘抽免单url
    PddDdkLotteryUrlGenResponse pddDdkLotteryUrlGen(PddDdkLotteryUrlGenRequest request) throws Exception;

    //pdd.ddk.mall.goods.list.get查询店铺商品
    PddDdkMallGoodsListGetResponse pddDdkMallGoodsListGet(PddDdkMallGoodsListGetRequest request) throws Exception;

    //pdd.ddk.mall.url.gen多多客生成店铺推广链接API
    PddDdkMallUrlGenResponse pddDdkMallUrlGen(PddDdkMallUrlGenRequest request) throws Exception;

    //pdd.ddk.member.authority.query查询是否绑定备案
    //PddDdkMemberAuthorityQueryResponse pddDdkMemberAuthorityQuery(PddDdkMemberAuthorityRequest request)  throws Exception;

    //pdd.ddk.merchant.list.get多多客查店铺列表接口
    PddDdkMerchantListGetResponse pddDdkMerchantListGet(PddDdkMerchantListGetRequest request) throws Exception;

    //pdd.ddk.order.detail.get查询订单详情
    PddDdkOrderDetailGetResponse pddDdkOrderDetailGet(PddDdkOrderDetailGetRequest request) throws Exception;

    //pdd.ddk.order.list.increment.get最后更新时间段增量同步推广订单信息
    PddDdkOrderListIncrementGetResponse pddDdkOrderListIncrementGet(PddDdkOrderListIncrementGetRequest request) throws Exception;

    //pdd.ddk.order.list.range.get用时间段查询推广订单接口
    //PddDdkOrderListrangeGetResponse pddDdkOrderListrangeGet(PddDdkOrderListrangeGetRequest request)  throws Exception;

    //pdd.ddk.resource.url.gen生成多多进宝频道推广
    PddDdkResourceUrlGenResponse pddDdkResourceUrlGen(PddDdkResourceUrlGenRequest request) throws Exception;

    //pdd.ddk.rp.prom.url.generate生成营销工具推广链接
    PddDdkRpPromUrlGenerateResponse pddDdkRpPromUrlGenerate(PddDdkRpPromUrlGenerateRequest request) throws Exception;

    //pdd.ddk.theme.goods.search多多进宝主题商品查询
    PddDdkThemeGoodsSearchResponse pddDdkThemeGoodsSearch(PddDdkThemeGoodsSearchRequest request) throws Exception;

    //pdd.ddk.theme.list.get多多进宝主题列表查询
    PddDdkThemeListGetResponse pddDdkThemeListGet(PddDdkThemeListGetRequest request) throws Exception;

    //pdd.ddk.theme.prom.url.generate多多进宝主题推广链接生成
    PddDdkThemePromUrlGenerateResponse pddDdkThemePromUrlGenerate(PddDdkThemePromUrlGenerateRequest request) throws Exception;

    //pdd.ddk.top.goods.list.query多多客获取爆款排行商品接口
    PddDdkTopGoodsListQueryResponse pddDdkTopGoodsListQuery(PddDdkTopGoodsListQueryRequest request) throws Exception;

    //pdd.ddk.weapp.qrcode.url.gen多多客生成单品推广小程序二维码url
    PddDdkWeappQrcodeUrlGenResponse pddDdkWeappQrcodeUrlGen(PddDdkWeappQrcodeUrlGenRequest request) throws Exception;


}
