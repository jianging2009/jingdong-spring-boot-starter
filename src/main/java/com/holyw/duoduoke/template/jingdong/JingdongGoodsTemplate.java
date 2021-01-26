package com.holyw.duoduoke.template.jingdong;

import com.holyw.duoduoke.support.jingdong.JingdongSupportRepository;
import com.holyw.duoduoke.utils.jingdong.JingdongGoodsTransUtils;
import com.holyw.duoduoke.vo.GoodsVO;
import jd.union.open.goods.query.request.UnionOpenGoodsQueryRequest;
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
    public GoodsVO getGoodsDetail(UnionOpenGoodsQueryRequest request) {
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
