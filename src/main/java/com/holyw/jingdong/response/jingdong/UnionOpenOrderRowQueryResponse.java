package com.holyw.jingdong.response.jingdong;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.io.Serializable;

public class UnionOpenOrderRowQueryResponse extends AbstractResponse implements Serializable {
    private Integer code;
    private String message;
    private OrderRowResp[] data;
    private Boolean hasMore;

    public UnionOpenOrderRowQueryResponse() {
    }

    public void setCode(Integer var1) {
        this.code = var1;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setMessage(String var1) {
        this.message = var1;
    }

    public String getMessage() {
        return this.message;
    }

    public void setData(OrderRowResp[] var1) {
        this.data = var1;
    }

    public OrderRowResp[] getData() {
        return this.data;
    }

    public void setHasMore(Boolean var1) {
        this.hasMore = var1;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }
}