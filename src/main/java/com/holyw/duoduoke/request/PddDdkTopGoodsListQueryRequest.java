package com.holyw.duoduoke.request;

import org.springframework.util.StringUtils;

public class PddDdkTopGoodsListQueryRequest extends com.pdd.pop.sdk.http.api.pop.request.PddDdkTopGoodsListQueryRequest implements PddBaseRequest {
    /***
     limit	INTEGER	非必填	请求数量；默认值 ： 400
     list_id	STRING	非必填	翻页时建议填写前页返回的list_id值
     offset	INTEGER	非必填	从多少位置开始请求；默认值 ： 0
     p_id	STRING	非必填	推广位id
     sort_type	INTEGER	非必填	1-实时热销榜；2-实时收益榜
     custom_parameters	STRING	非必填	自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     */

    public PddDdkTopGoodsListQueryRequest(String customParameters,Integer sortType, Integer limit, Integer offset, String listId) {
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        this.setLimit(setDefaultPageSize(limit));
        this.setOffset(offset);
        if (!StringUtils.isEmpty(sortType)) {
            this.setSortType(sortType);
        }
        if (!StringUtils.isEmpty(listId)) {
            this.setListId(listId);
        }
        this.setPId(setDefaultPId());
    }

}
