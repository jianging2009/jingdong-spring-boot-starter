package com.holyw.duoduoke.request.builder;

import com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsBasicInfoGetRequest;

import java.util.List;

/**
 * Denchy Chiang
 */
public class PddDdkGoodsBasicInfoGetRequestBuilder {
    private PddDdkGoodsBasicInfoGetRequest pddDdkGoodsBasicInfoGetRequest = new PddDdkGoodsBasicInfoGetRequest();

    public PddDdkGoodsBasicInfoGetRequest build() {
        return pddDdkGoodsBasicInfoGetRequest;
    }

    public PddDdkGoodsBasicInfoGetRequestBuilder addGoodsIdList(List<Long> goodsIdList) {
        pddDdkGoodsBasicInfoGetRequest.setGoodsIdList(goodsIdList);
        return this;
    }
}
