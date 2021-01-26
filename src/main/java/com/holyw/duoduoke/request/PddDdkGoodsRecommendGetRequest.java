package com.holyw.duoduoke.request;

import org.springframework.util.StringUtils;

public class PddDdkGoodsRecommendGetRequest extends com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsRecommendGetRequest implements PddBaseRequest {
    /***
     channel_type	INTEGER	非必填	0-1.9包邮, 1-今日爆款, 2-品牌清仓,3-相似商品推荐,4-猜你喜欢,5-实时热销,6-实时收益,7-今日畅销,8-高佣榜单，默认1
     custom_parameters	STRING	非必填	自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     limit	INTEGER	非必填	请求数量；默认值 ： 400
     list_id	STRING	非必填	翻页时建议填写前页返回的list_id值
     offset	INTEGER	非必填	从多少位置开始请求；默认值 ： 0，offset需是limit的整数倍，仅支持整页翻页
     pid	STRING	非必填	推广位id
     cat_id	LONG	非必填	猜你喜欢场景的商品类目，20100-百货，20200-母婴，20300-食品，20400-女装，20500-电器，20600-鞋包，20700-内衣，20800-美妆，20900-男装，21000-水果，21100-家纺，21200-文具,21300-运动,21400-虚拟,21500-汽车,21600-家装,21700-家具,21800-医药;
     goods_ids	LONG[]	非必填	相似商品推荐场景时必传。商品Id，请求相似商品时，仅取数组的第一位
     */
    public PddDdkGoodsRecommendGetRequest(Integer channelType, String customParameters, Integer limit, String listId, Integer offset) {
        this.setPid(setDefaultPId());
        if (!StringUtils.isEmpty(channelType)) {
            this.setChannelType(channelType);
        }
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        this.setLimit(setDefaultPageSize(limit));
        this.setListId(listId);
        this.setOffset(offset);

    }
}
