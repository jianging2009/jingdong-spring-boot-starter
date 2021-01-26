package com.holyw.duoduoke.request.builder;

import com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsUnitQueryRequest;

public class PddDdkGoodsUnitQueryRequestBuilder implements PddBaseRequestBuilder {
    private PddDdkGoodsUnitQueryRequest pddDdkGoodsUnitQueryRequest = new PddDdkGoodsUnitQueryRequest();

    public PddDdkGoodsUnitQueryRequest build() {
        return pddDdkGoodsUnitQueryRequest;
    }

    public PddDdkGoodsUnitQueryRequestBuilder addGoodsId(Long goodsId) {
        pddDdkGoodsUnitQueryRequest.setGoodsId(goodsId);
        return this;
    }
}
