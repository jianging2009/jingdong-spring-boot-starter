package com.holyw.jingdong.request.jingdong;

import com.holyw.jingdong.response.jingdong.UnionOpenOrderRowQueryResponse;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.io.Serializable;
import java.util.TreeMap;

public class UnionOpenOrderRowQueryRequest extends AbstractRequest implements Serializable, JdRequest<UnionOpenOrderRowQueryResponse> {
    private OrderRowReq orderReq;

    public UnionOpenOrderRowQueryRequest() {
    }

    public void setOrderReq(OrderRowReq var1) {
        this.orderReq = var1;
    }

    public OrderRowReq getOrderReq() {
        return this.orderReq;
    }

    public String getApiMethod() {
        return "jd.union.open.order.row.query";
    }

    public Class<UnionOpenOrderRowQueryResponse> getResponseClass() {
        return UnionOpenOrderRowQueryResponse.class;
    }

    public String getApiVersion() {
        return "1.0";
    }

    public String getAppJsonParams() throws IOException {
        TreeMap var1 = new TreeMap();
        var1.put("orderReq", this.orderReq);
        return JsonUtil.toJson(var1);
    }
}