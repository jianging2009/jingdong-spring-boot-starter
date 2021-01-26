package com.holyw.duoduoke.request;

import org.springframework.util.StringUtils;

import java.util.Arrays;

public class PddDdkGoodsPromotionUrlGenerateRequest extends com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsPromotionUrlGenerateRequest implements PddBaseRequest {

    /**
     * 适用于小程序
     */
    public PddDdkGoodsPromotionUrlGenerateRequest(String customParameters, String goodsId, String searchId, Long zsDuoId) {
        this.setPId(setDefaultPId());
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        this.setGoodsIdList(Arrays.asList(Long.valueOf(goodsId)));
        if (!StringUtils.isEmpty(searchId)) {
            this.setSearchId(searchId);
        }
        if (!StringUtils.isEmpty(zsDuoId)) {
            this.setZsDuoId(zsDuoId);
        }
        this.setGenerateSchemaUrl(true);
        this.setGenerateQqApp(true);
        this.setGenerateWeApp(true);
    }
    /**
     * 转链
     */
    public PddDdkGoodsPromotionUrlGenerateRequest(String customParameters, String goodsId) {
        this.setPId(setDefaultPId());
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        this.setGoodsIdList(Arrays.asList(Long.valueOf(goodsId)));
        this.setGenerateSchemaUrl(true);
        this.setGenerateQqApp(true);
        this.setGenerateWeApp(true);
    }
}
