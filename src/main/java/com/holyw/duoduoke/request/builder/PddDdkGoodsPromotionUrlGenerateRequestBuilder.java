package com.holyw.duoduoke.request.builder;

import com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsPromotionUrlGenerateRequest;
import org.springframework.util.StringUtils;

import java.util.Arrays;

public class PddDdkGoodsPromotionUrlGenerateRequestBuilder implements PddBaseRequestBuilder {
    private PddDdkGoodsPromotionUrlGenerateRequest pddDdkGoodsPromotionUrlGenerateRequest = new PddDdkGoodsPromotionUrlGenerateRequest();

    public PddDdkGoodsPromotionUrlGenerateRequest build() {
        return pddDdkGoodsPromotionUrlGenerateRequest;
    }

    public PddDdkGoodsPromotionUrlGenerateRequestBuilder addCustomParameters(String customParameters) {
        pddDdkGoodsPromotionUrlGenerateRequest.setPId(setDefaultPId());
        pddDdkGoodsPromotionUrlGenerateRequest.setCustomParameters(customParameters);
        return this;
    }

    public PddDdkGoodsPromotionUrlGenerateRequestBuilder addGoodsId(String goodsId) {
        pddDdkGoodsPromotionUrlGenerateRequest.setPId(setDefaultPId());
        pddDdkGoodsPromotionUrlGenerateRequest.setGoodsIdList(Arrays.asList(Long.valueOf(goodsId)));
        return this;
    }

    public PddDdkGoodsPromotionUrlGenerateRequestBuilder addSearchId(String searchId) {
        pddDdkGoodsPromotionUrlGenerateRequest.setPId(setDefaultPId());
        if(!StringUtils.isEmpty(searchId)){
        pddDdkGoodsPromotionUrlGenerateRequest.setSearchId(searchId);
        }
        return this;
    }

    public PddDdkGoodsPromotionUrlGenerateRequestBuilder addZsDuoId(Long zsDuoId) {
        pddDdkGoodsPromotionUrlGenerateRequest.setPId(setDefaultPId());
        if(null!=zsDuoId){
        pddDdkGoodsPromotionUrlGenerateRequest.setZsDuoId(zsDuoId);
        }
        return this;
    }

    public PddDdkGoodsPromotionUrlGenerateRequestBuilder addPId(String pid) {
        pddDdkGoodsPromotionUrlGenerateRequest.setPId(pid);
        return this;
    }
}
