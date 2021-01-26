package com.holyw.duoduoke.response;

import com.pdd.pop.sdk.http.PopBaseHttpResponse;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkGoodsSearchResponse;

import java.util.List;

public class GoodsSearchResponse {
    private List<PddDdkGoodsSearchResponse.GoodsSearchResponseGoodsListItem> list;
    private PddDdkGoodsSearchResponse.GoodsSearchResponseGoodsListItem item;

    private String listId;
    private Integer total;

    public GoodsSearchResponse(List<PddDdkGoodsSearchResponse.GoodsSearchResponseGoodsListItem> list, String listId) {
        this.list = list;
        this.listId = listId;
    }

    public GoodsSearchResponse(PopBaseHttpResponse.ErrorResponse errorResponse) {

    }

    public List<PddDdkGoodsSearchResponse.GoodsSearchResponseGoodsListItem> getList() {
        return list;
    }

    public void setList(List<PddDdkGoodsSearchResponse.GoodsSearchResponseGoodsListItem> list) {
        this.list = list;
    }

    public PddDdkGoodsSearchResponse.GoodsSearchResponseGoodsListItem getItem() {
        return item;
    }

    public void setItem(PddDdkGoodsSearchResponse.GoodsSearchResponseGoodsListItem item) {
        this.item = item;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}

