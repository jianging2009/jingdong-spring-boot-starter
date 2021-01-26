package com.holyw.duoduoke.request.builder.jingdong;

import jd.union.open.goods.query.request.GoodsReq;
import jd.union.open.goods.query.request.UnionOpenGoodsQueryRequest;

/**
 * Denchy Chiang
 */
public class UnionOpenGoodsQueryRequestBuilder {
    private UnionOpenGoodsQueryRequest request = new UnionOpenGoodsQueryRequest();
    private GoodsReq goodsReq = new GoodsReq();

    public UnionOpenGoodsQueryRequest build() {
        request.setGoodsReqDTO(goodsReq);
        return request;
    }

    public UnionOpenGoodsQueryRequestBuilder addGoodsIdList(Long[] skuIds) {
        goodsReq.setSkuIds(skuIds);
        return this;
    }
}