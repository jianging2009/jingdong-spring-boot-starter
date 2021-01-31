package com.holyw.jingdong.request.builder.jingdong;

import com.holyw.jingdong.request.jingdong.OrderRowReq;
import com.holyw.jingdong.request.jingdong.UnionOpenOrderRowQueryRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @className: UnionOpenOrderRowQueryRequestBuilder
 * @description: TODO
 * @date: 2021/1/28
 **/
public class UnionOpenOrderRowQueryRequestBuilder {
    SimpleDateFormat MINUTES_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private UnionOpenOrderRowQueryRequest request = new UnionOpenOrderRowQueryRequest();
    private OrderRowReq orderReq = new OrderRowReq();

    public UnionOpenOrderRowQueryRequest build() {
        request.setOrderReq(orderReq);
        return request;
    }

    public UnionOpenOrderRowQueryRequestBuilder addStartTime(String startTime) {
        orderReq.setStartTime(startTime);
        return this;
    }

    public UnionOpenOrderRowQueryRequestBuilder addEndTime(String endTime) {
        orderReq.setEndTime(endTime);
        return this;
    }


    public UnionOpenOrderRowQueryRequestBuilder addStartTime(Date startTime) {
        orderReq.setStartTime(MINUTES_FORMAT.format(startTime));
        return this;
    }
    public UnionOpenOrderRowQueryRequestBuilder addStartTime(Date startTime,String format) {
        orderReq.setStartTime(new SimpleDateFormat(format).format(startTime));
        return this;
    }


    public UnionOpenOrderRowQueryRequestBuilder addEndTime(Date endTime) {
        orderReq.setEndTime(MINUTES_FORMAT.format(endTime));
        return this;
    }
    public UnionOpenOrderRowQueryRequestBuilder addEndTime(Date endTime,String format) {
        orderReq.setEndTime(new SimpleDateFormat(format).format(endTime));
        return this;
    }


    public UnionOpenOrderRowQueryRequestBuilder addPageIndex(Integer pageIndex) {
        orderReq.setPageIndex(pageIndex);
        return this;
    }

    public UnionOpenOrderRowQueryRequestBuilder addPageSize(Integer pageSize) {
        orderReq.setPageSize(pageSize);
        return this;
    }

    public UnionOpenOrderRowQueryRequestBuilder addType(Integer type) {
        orderReq.setType(type);
        return this;
    }
}
