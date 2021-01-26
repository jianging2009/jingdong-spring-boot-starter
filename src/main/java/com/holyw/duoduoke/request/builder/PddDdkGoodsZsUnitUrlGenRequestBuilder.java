package com.holyw.duoduoke.request.builder;


import com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsZsUnitUrlGenRequest;

/**
 * Denchy Chiang
 */
public class PddDdkGoodsZsUnitUrlGenRequestBuilder implements PddBaseRequestBuilder {

    private PddDdkGoodsZsUnitUrlGenRequest pddDdkGoodsZsUnitUrlGenRequest = new PddDdkGoodsZsUnitUrlGenRequest();

    public PddDdkGoodsZsUnitUrlGenRequest build() {
        return pddDdkGoodsZsUnitUrlGenRequest;
    }

    public PddDdkGoodsZsUnitUrlGenRequestBuilder addSourceUrl(String sourceUrl) {
        pddDdkGoodsZsUnitUrlGenRequest.setSourceUrl(sourceUrl);
        pddDdkGoodsZsUnitUrlGenRequest.setPid(setDefaultPId());
        return this;
    }

    public PddDdkGoodsZsUnitUrlGenRequestBuilder addCustomParameters(String customParameters) {
        pddDdkGoodsZsUnitUrlGenRequest.setCustomParameters(customParameters);
        pddDdkGoodsZsUnitUrlGenRequest.setPid(setDefaultPId());
        return this;
    }
}
