package com.holyw.duoduoke.response;

import com.pdd.pop.sdk.http.api.pop.response.PddDdkMallUrlGenResponse;

public class MallCouponGenerateUrlResponse {
    private PddDdkMallUrlGenResponse.MallCouponGenerateUrlResponseListItem item;
    private String shortUrl;
    private String mobileUrl;
    private String schemaUrl;

    public MallCouponGenerateUrlResponse(PddDdkMallUrlGenResponse.MallCouponGenerateUrlResponseListItem item) {
        this.item = item;
        this.shortUrl = null == this.item.getShortUrl() ? null : this.item.getShortUrl();
        this.schemaUrl = null == this.item.getSchemaUrl() ? null : this.item.getSchemaUrl();
    }

    public PddDdkMallUrlGenResponse.MallCouponGenerateUrlResponseListItem getItem() {
        return item;
    }

    public void setItem(PddDdkMallUrlGenResponse.MallCouponGenerateUrlResponseListItem item) {
        this.item = item;
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

