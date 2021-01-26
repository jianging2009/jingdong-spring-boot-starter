package com.holyw.duoduoke.response;

import com.pdd.pop.sdk.http.api.pop.response.PddDdkGoodsRecommendGetResponse;
import java.util.List;

public class GoodsBasicDetailResponse {
    private List<PddDdkGoodsRecommendGetResponse.GoodsBasicDetailResponseListItem> list;
    private PddDdkGoodsRecommendGetResponse.GoodsBasicDetailResponseListItem item;

    private String listId;

    public GoodsBasicDetailResponse(List<PddDdkGoodsRecommendGetResponse.GoodsBasicDetailResponseListItem> list,String listId) {
        this.list = list;
        this.listId=listId;
    }

    public List<PddDdkGoodsRecommendGetResponse.GoodsBasicDetailResponseListItem> getList() {
        return list;
    }

    public void setList(List<PddDdkGoodsRecommendGetResponse.GoodsBasicDetailResponseListItem> list) {
        this.list = list;
    }
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public GoodsBasicDetailResponse(PddDdkGoodsRecommendGetResponse.GoodsBasicDetailResponseListItem item) {
        this.item = item;
    }

    public PddDdkGoodsRecommendGetResponse.GoodsBasicDetailResponseListItem getItem() {
        return item;
    }

    public void setItem(PddDdkGoodsRecommendGetResponse.GoodsBasicDetailResponseListItem item) {
        this.item = item;
    }
}

