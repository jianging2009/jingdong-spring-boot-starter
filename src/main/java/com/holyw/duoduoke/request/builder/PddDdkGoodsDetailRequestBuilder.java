package com.holyw.duoduoke.request.builder;


import com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsDetailRequest;

import java.util.Arrays;

/**
 * Denchy Chiang
 */
public class PddDdkGoodsDetailRequestBuilder implements PddBaseRequestBuilder {

    private PddDdkGoodsDetailRequest pddDdkGoodsDetailRequest = new PddDdkGoodsDetailRequest();


    public PddDdkGoodsDetailRequest build() {
        return pddDdkGoodsDetailRequest;
    }

    public PddDdkGoodsDetailRequestBuilder addGoodsId(String goodsId) {
        pddDdkGoodsDetailRequest.setGoodsIdList(Arrays.asList(Long.valueOf(goodsId)));
        pddDdkGoodsDetailRequest.setPid(setDefaultPId());
        return this;
    }

    public PddDdkGoodsDetailRequestBuilder addSearchId(String searchId) {
        pddDdkGoodsDetailRequest.setSearchId(searchId);
        pddDdkGoodsDetailRequest.setPid(setDefaultPId());
        return this;
    }

    public PddDdkGoodsDetailRequestBuilder addCustomParameters(String customParameters) {
        pddDdkGoodsDetailRequest.setCustomParameters(customParameters);
        pddDdkGoodsDetailRequest.setPid(setDefaultPId());
        return this;
    }

    public PddDdkGoodsDetailRequestBuilder addPid(String pId) {
        pddDdkGoodsDetailRequest.setPid(pId);
        return this;
    }
}
