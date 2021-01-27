package com.holyw.duoduoke.template.jingdong;

import com.holyw.duoduoke.support.jingdong.JingdongSupportRepository;
import com.holyw.duoduoke.utils.jingdong.JingdongGoodsTransUtils;
import com.holyw.duoduoke.vo.GoodsVO;
import com.jd.open.api.sdk.request.AbstractRequest;
import jd.union.open.goods.query.response.UnionOpenGoodsQueryResponse;
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
}
