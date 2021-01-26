package com.holyw.duoduoke.response;

import com.pdd.pop.sdk.http.api.pop.response.PddDdkGoodsDetailResponse;

import java.util.List;

public class GoodsDetailResponse {
    private List<PddDdkGoodsDetailResponse.GoodsDetailResponseGoodsDetailsItem> goodsDetails;

    public GoodsDetailResponse(List<PddDdkGoodsDetailResponse.GoodsDetailResponseGoodsDetailsItem> goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public List<PddDdkGoodsDetailResponse.GoodsDetailResponseGoodsDetailsItem> getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(List<PddDdkGoodsDetailResponse.GoodsDetailResponseGoodsDetailsItem> goodsDetails) {
        this.goodsDetails = goodsDetails;
    }
}

