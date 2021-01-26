package com.holyw.duoduoke.response;

import com.pdd.pop.sdk.http.api.pop.response.PddDdkGoodsZsUnitUrlGenResponse;

public class GoodsZsUnitGenerateResponse extends PddDdkGoodsZsUnitUrlGenResponse.GoodsZsUnitGenerateResponse {
    private PddDdkGoodsZsUnitUrlGenResponse.GoodsZsUnitGenerateResponse item;

    private String mobileShortUrl;
    private String mobileUrl;
    private String multiGroupMobileShortUrl;
    private String multiGroupMobileUrl;
    private String multiGroupShortUrl;
    private String multiGroupUrl;
    private String shortUrl;
    private String url;

    public GoodsZsUnitGenerateResponse(PddDdkGoodsZsUnitUrlGenResponse.GoodsZsUnitGenerateResponse item) {
        this.item = item;
        this.mobileShortUrl = item.getMobileShortUrl();
        this.mobileUrl = item.getMobileUrl();
        this.multiGroupMobileShortUrl = item.getMultiGroupMobileShortUrl();
        this.multiGroupMobileUrl = item.getMultiGroupMobileUrl();
        this.multiGroupShortUrl = item.getMultiGroupShortUrl();
        this.multiGroupUrl = item.getMultiGroupUrl();
        this.shortUrl = item.getShortUrl();
        this.url = item.getUrl();
    }

    public PddDdkGoodsZsUnitUrlGenResponse.GoodsZsUnitGenerateResponse getItem() {
        return item;
    }

    public void setItem(PddDdkGoodsZsUnitUrlGenResponse.GoodsZsUnitGenerateResponse item) {
        this.item = item;
    }

    @Override
    public String getMobileShortUrl() {
        return mobileShortUrl;
    }

    public void setMobileShortUrl(String mobileShortUrl) {
        this.mobileShortUrl = mobileShortUrl;
    }

    @Override
    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    @Override
    public String getMultiGroupMobileShortUrl() {
        return multiGroupMobileShortUrl;
    }

    public void setMultiGroupMobileShortUrl(String multiGroupMobileShortUrl) {
        this.multiGroupMobileShortUrl = multiGroupMobileShortUrl;
    }

    @Override
    public String getMultiGroupMobileUrl() {
        return multiGroupMobileUrl;
    }

    public void setMultiGroupMobileUrl(String multiGroupMobileUrl) {
        this.multiGroupMobileUrl = multiGroupMobileUrl;
    }

    @Override
    public String getMultiGroupShortUrl() {
        return multiGroupShortUrl;
    }

    public void setMultiGroupShortUrl(String multiGroupShortUrl) {
        this.multiGroupShortUrl = multiGroupShortUrl;
    }

    @Override
    public String getMultiGroupUrl() {
        return multiGroupUrl;
    }

    public void setMultiGroupUrl(String multiGroupUrl) {
        this.multiGroupUrl = multiGroupUrl;
    }

    @Override
    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @Override
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

