package com.holyw.duoduoke.response;

import com.pdd.pop.sdk.http.api.pop.response.PddDdkTopGoodsListQueryResponse;

import java.util.List;

public class TopGoodsListGetResponse {
    private List<PddDdkTopGoodsListQueryResponse.TopGoodsListGetResponseListItem> list;
    private PddDdkTopGoodsListQueryResponse.TopGoodsListGetResponseListItem item;
    private String listId;
    private Long total;

    public TopGoodsListGetResponse(List<PddDdkTopGoodsListQueryResponse.TopGoodsListGetResponseListItem> list, String listId) {
        this.list = list;
        this.listId = listId;
    }

    public TopGoodsListGetResponse(List<PddDdkTopGoodsListQueryResponse.TopGoodsListGetResponseListItem> list, String listId, Long total) {
        this.list = list;
        this.listId = listId;
        this.total = total;
    }

    public TopGoodsListGetResponse(PddDdkTopGoodsListQueryResponse.TopGoodsListGetResponseListItem item) {
        this.item = item;
    }

    public List<PddDdkTopGoodsListQueryResponse.TopGoodsListGetResponseListItem> getList() {
        return list;
    }

    public void setList(List<PddDdkTopGoodsListQueryResponse.TopGoodsListGetResponseListItem> list) {
        this.list = list;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public PddDdkTopGoodsListQueryResponse.TopGoodsListGetResponseListItem getItem() {
        return item;
    }

    public void setItem(PddDdkTopGoodsListQueryResponse.TopGoodsListGetResponseListItem item) {
        this.item = item;
    }

}

