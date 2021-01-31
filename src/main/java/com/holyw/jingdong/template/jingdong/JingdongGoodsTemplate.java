package com.holyw.jingdong.template.jingdong;

import com.holyw.jingdong.support.jingdong.JingdongSupportRepository;
import com.holyw.jingdong.utils.jingdong.JingdongGoodsTransUtils;
import com.holyw.jingdong.vo.GoodsVO;
import com.jd.open.api.sdk.request.AbstractRequest;
import jd.union.open.goods.query.response.UnionOpenGoodsQueryResponse;


public class JingdongGoodsTemplate {


    private JingdongSupportRepository jingdongSupportRepository;

    public JingdongGoodsTemplate(JingdongSupportRepository jingdongSupportRepository) {
        this.jingdongSupportRepository = jingdongSupportRepository;
    }
    //private static final Logger LOGGER = LoggerFactory.getLogger(JingdongGoodsTemplate.class);

    /**
     * 详情
     */
    public GoodsVO getGoodsDetail(AbstractRequest request) {
        GoodsVO goodsVO = null;
        try {
            UnionOpenGoodsQueryResponse unionOpenGoodsQueryResponse = jingdongSupportRepository.unionOpenGoodsQuery(request);

            goodsVO = JingdongGoodsTransUtils.transform2GoodsVO(unionOpenGoodsQueryResponse);

        } catch (Exception e) {
            //LOGGER.error("getGoodsDetail:" + e.getMessage() + "," + Arrays.toString(e.getStackTrace()));
        }
        return goodsVO;
    }

}
