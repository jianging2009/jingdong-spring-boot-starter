package com.holyw.jingdong.request.builder.jingdong;

import jd.union.open.order.query.request.OrderReq;
import jd.union.open.order.query.request.UnionOpenOrderQueryRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @className: UnionOpenOrderQueryRequestBuilder
 * @description: TODO
 * @date: 2021/1/27
 **/
public class UnionOpenOrderQueryRequestBuilder {
    SimpleDateFormat HOURS_FORMAT = new SimpleDateFormat("yyyyMMddHH");
    SimpleDateFormat MINUTES_FORMAT = new SimpleDateFormat("yyyyMMddHHmm");
    SimpleDateFormat SECOND_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");

    private UnionOpenOrderQueryRequest request = new UnionOpenOrderQueryRequest();
    private OrderReq orderReq = new OrderReq();

    public UnionOpenOrderQueryRequest build() {
        request.setOrderReq(orderReq);
        return request;
    }

    public UnionOpenOrderQueryRequestBuilder addTime(String time) {
        orderReq.setTime(time);
        return this;
    }
    public UnionOpenOrderQueryRequestBuilder addTime(Date time) {
        orderReq.setTime(MINUTES_FORMAT.format(time));
        return this;
    }
    public UnionOpenOrderQueryRequestBuilder addTime(Date time,String format) {
        orderReq.setTime(new SimpleDateFormat(format).format(time));
        return this;
    }

    public UnionOpenOrderQueryRequestBuilder addPageNo(Integer pageNo) {
        orderReq.setPageNo(pageNo);
        return this;
    }

    public UnionOpenOrderQueryRequestBuilder addPageSize(Integer pageSize) {
        orderReq.setPageSize(pageSize);
        return this;
    }

    public UnionOpenOrderQueryRequestBuilder addType(Integer type) {
        orderReq.setType(type);
        return this;
    }
}
