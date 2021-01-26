package com.holyw.duoduoke.support.jingdong;

import com.holyw.duoduoke.response.jingdong.UnionOpenGoodsMaterialQueryResponse;
import com.holyw.duoduoke.response.jingdong.UnionOpenOrderRowQueryResponse;
import com.holyw.duoduoke.response.jingdong.UnionOpenStatisticsRedpacketQueryResponse;
import com.jd.open.api.sdk.request.AbstractRequest;
import jd.union.open.coupon.query.response.UnionOpenCouponQueryResponse;
import jd.union.open.goods.query.response.UnionOpenGoodsQueryResponse;
import jd.union.open.order.query.response.UnionOpenOrderQueryResponse;

/**
 * @className: JingdongSupportRepository
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/1/26
 **/
public interface JingdongSupportRepository {
    /**
     * 关键词商品查询接口【申请】
     * jd.union.open.goods.query
     * JdClient client=new DefaultJdClient(SERVER_URL,accessToken,appKey,appSecret);
     * UnionOpenGoodsQueryRequest request=new UnionOpenGoodsQueryRequest();
     * GoodsReq goodsReqDTO=new GoodsReq();
     * request.setGoodsReqDTO(goodsReqDTO);
     * UnionOpenGoodsQueryResponse response=client.execute(request);
     */
    UnionOpenGoodsQueryResponse unionOpenGoodsQuery(AbstractRequest request);

    /**
     * jd.union.open.coupon.query
     * 优惠券领取情况查询接口【申请】
     * JdClient client=new DefaultJdClient(SERVER_URL,accessToken,appKey,appSecret);
     * UnionOpenCouponQueryRequest request=new UnionOpenCouponQueryRequest();
     * List couponUrls = new ArrayList();
     * couponUrls.add("abc");
     * request.setCouponUrls(couponUrls);
     * UnionOpenCouponQueryResponse response=client.execute(request);
     */
    UnionOpenCouponQueryResponse unionOpenCouponQuery(AbstractRequest request);
    /**
     * 京享红包效果数据
     * jd.union.open.statistics.redpacket.query
     * JdClient client=new DefaultJdClient(SERVER_URL,accessToken,appKey,appSecret);
     * UnionOpenStatisticsRedpacketQueryRequest request=new UnionOpenStatisticsRedpacketQueryRequest();
     * RedPacketEffectDataReq effectDataReq=new RedPacketEffectDataReq();
     * request.setEffectDataReq(effectDataReq);
     * UnionOpenStatisticsRedpacketQueryResponse response=client.execute(request);
     */
    UnionOpenStatisticsRedpacketQueryResponse unionOpenStatisticsRedpacketQuery(AbstractRequest request);
    /**
     * 猜你喜欢商品推荐
     * jd.union.open.goods.material.query
     * JdClient client=new DefaultJdClient(SERVER_URL,accessToken,appKey,appSecret);
     * UnionOpenGoodsMaterialQueryRequest request=new UnionOpenGoodsMaterialQueryRequest();
     * MaterialGoodsReq goodsReq=new MaterialGoodsReq();
     * request.setGoodsReq(goodsReq);
     * UnionOpenGoodsMaterialQueryResponse response=client.execute(request);
     */
    UnionOpenGoodsMaterialQueryResponse unionOpenGoodsMaterialQuery(AbstractRequest request);
    /**
     * 订单查询接口
     * jd.union.open.order.query
     * JdClient client=new DefaultJdClient(SERVER_URL,accessToken,appKey,appSecret);
     * UnionOpenOrderQueryRequest request=new UnionOpenOrderQueryRequest();
     * OrderReq orderReq=new OrderReq();
     * request.setOrderReq(orderReq);
     * UnionOpenOrderQueryResponse response=client.execute(request);
     */
    UnionOpenOrderQueryResponse unionOpenOrderQuery(AbstractRequest request);
    /**
     * 订单行查询接口
     * jd.union.open.order.row.query
     * JdClient client=new DefaultJdClient(SERVER_URL,accessToken,appKey,appSecret);
     * UnionOpenOrderRowQueryRequest request=new UnionOpenOrderRowQueryRequest();
     * OrderRowReq orderReq=new OrderRowReq();
     * request.setOrderReq(orderReq);
     * UnionOpenOrderRowQueryResponse response=client.execute(request);
     */
    UnionOpenOrderRowQueryResponse unionOpenOrderRowQuery(AbstractRequest request);

}
