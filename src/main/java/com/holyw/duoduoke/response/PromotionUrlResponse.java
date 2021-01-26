package com.holyw.duoduoke.response;

import com.pdd.pop.sdk.http.api.pop.response.PddDdkGoodsPromotionUrlGenerateResponse;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkResourceUrlGenResponse;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkRpPromUrlGenerateResponse;

public class PromotionUrlResponse {

    private PddDdkGoodsPromotionUrlGenerateResponse.GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItem goodsItem;

    private PddDdkRpPromUrlGenerateResponse.RpPromotionUrlGenerateResponseUrlListItem rpItem;

    private PddDdkResourceUrlGenResponse.ResourceUrlResponse resourceUrlResponse;

    private String pagePath;
    private String appId;
    private String shortUrl;
    private String mobileUrl;
    private String schemaUrl;

    public PromotionUrlResponse(PddDdkGoodsPromotionUrlGenerateResponse.GoodsPromotionUrlGenerateResponseGoodsPromotionUrlListItem goodsItem) {
        this.goodsItem = goodsItem;
        this.pagePath = null == this.goodsItem.getWeAppInfo() ? null : this.goodsItem.getWeAppInfo().getPagePath();
        this.appId = null == this.goodsItem.getWeAppInfo() ? null : this.goodsItem.getWeAppInfo().getAppId();
        this.shortUrl = goodsItem.getShortUrl();
        this.mobileUrl = goodsItem.getMobileUrl();
        this.schemaUrl = goodsItem.getSchemaUrl();
    }

    public PromotionUrlResponse(PddDdkRpPromUrlGenerateResponse.RpPromotionUrlGenerateResponseUrlListItem rpPromotionUrlGenerateResponse) {
        this.rpItem = rpPromotionUrlGenerateResponse;
        this.pagePath = null == this.rpItem.getWeAppInfo() ? null : this.rpItem.getWeAppInfo().getPagePath();
        this.appId = null == this.rpItem.getWeAppInfo() ? null : this.rpItem.getWeAppInfo().getAppId();
        this.shortUrl = this.rpItem.getShortUrl();
        this.mobileUrl = this.rpItem.getMobileUrl();
        this.schemaUrl = this.rpItem.getSchemaUrl();
    }

    public PromotionUrlResponse(PddDdkResourceUrlGenResponse.ResourceUrlResponse resourceUrlResponse) {
        this.resourceUrlResponse = resourceUrlResponse;
        this.appId = null == this.resourceUrlResponse.getWeAppInfo() ? null : this.resourceUrlResponse.getWeAppInfo().getAppId();
        this.pagePath = null == this.resourceUrlResponse.getWeAppInfo() ? null : this.resourceUrlResponse.getWeAppInfo().getPagePath();
        this.shortUrl = null == this.resourceUrlResponse.getSingleUrlList() ? null : this.resourceUrlResponse.getSingleUrlList().getShortUrl();
        this.schemaUrl = null == this.resourceUrlResponse.getSingleUrlList() ? null : this.resourceUrlResponse.getSingleUrlList().getSchemaUrl();
    }

    public String getPagePath() {
        return pagePath;
    }

    public void setPagePath(String pagePath) {
        this.pagePath = pagePath;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getSchemaUrl() {
        return schemaUrl;
    }

    public void setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
    }
}

