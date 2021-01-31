package com.holyw.jingdong.template.jingdong;

import com.holyw.jingdong.response.jingdong.UnionOpenOrderRowQueryResponse;
import com.holyw.jingdong.support.jingdong.JingdongSupportRepository;
import com.jd.open.api.sdk.request.AbstractRequest;
import jd.union.open.order.query.response.UnionOpenOrderQueryResponse;


public class JingdongOrderTemplate {


    private JingdongSupportRepository jingdongSupportRepository;

    public JingdongOrderTemplate(JingdongSupportRepository jingdongSupportRepository) {
        this.jingdongSupportRepository = jingdongSupportRepository;
    }
    //private static final Logger LOGGER = LoggerFactory.getLogger(JingdongGoodsTemplate.class);


    public UnionOpenOrderQueryResponse orderQuery(AbstractRequest request) {
        UnionOpenOrderQueryResponse unionOpenOrderQueryResponse = jingdongSupportRepository.unionOpenOrderQuery(request);
        return unionOpenOrderQueryResponse;
    }
    public UnionOpenOrderRowQueryResponse orderRowQuery(AbstractRequest request) {
        UnionOpenOrderRowQueryResponse unionOpenOrderRowQueryResponse = jingdongSupportRepository.unionOpenOrderRowQuery(request);
        return unionOpenOrderRowQueryResponse;
    }
}
