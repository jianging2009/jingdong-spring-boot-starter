package com.holyw.duoduoke.request;

import org.springframework.util.StringUtils;

public class PddDdkRpPromUrlGenerateRequest extends com.pdd.pop.sdk.http.api.pop.request.PddDdkRpPromUrlGenerateRequest implements PddBaseRequest {
    /**
     * channel_type	INTEGER	非必填	-1-活动列表，0-默认红包，2–新人红包，3-刮刮卡，5-员工内购，6-购物车，7-大促会场，8-直播间列表集合页，10-生成绑定备案链接
     * custom_parameters	STRING	非必填	自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     * diy_lottery_param	OBJECT	非必填	转盘自定义参数
     * opt_id	INTEGER	非必填	优先展示类目
     * range_items	OBJECT[]	非必填	自定义价格和商品佣金区间
     * range_from	LONG	非必填	区间的开始值
     * range_id	INTEGER	非必填	range_id为1表示价格（单位分）， range_id为2表示商品佣金（单位千分之几)
     * range_to	LONG	非必填	区间的结束值
     * diy_red_packet_param	OBJECT	非必填	红包自定义参数
     * amount_probability	LONG[]	非必填	红包金额列表，200、300、500、1000、2000，单位分。红包金额和红包抵后价设置只能二选一，默认设置了红包金额会忽略红包抵后价设置
     * dis_text	BOOLEAN	非必填	设置玩法，false-现金红包, true-现金券
     * not_show_background	BOOLEAN	非必填	推广页设置，false-红包开启页, true-红包领取页
     * opt_id	INTEGER	非必填	优先展示类目
     * range_items	OBJECT[]	非必填	自定义红包抵后价和商品佣金区间对象数组
     * range_from	LONG	非必填	区间的开始值
     * range_id	INTEGER	非必填	range_id为1表示红包抵后价（单位分）， range_id为2表示佣金比例（单位千分之几)
     * range_to	LONG	非必填	区间的结束值
     * generate_qq_app	BOOLEAN	非必填	是否生成qq小程序
     * generate_schema_url	BOOLEAN	非必填	是否返回 schema URL
     * generate_short_url	BOOLEAN	非必填	是否生成短链接。true-是，false-否，默认false
     * generate_we_app	BOOLEAN	非必填	是否生成小程序推广
     * p_id_list	STRING[]	必填	推广位列表，例如：["60005_612"]
     */

    public PddDdkRpPromUrlGenerateRequest(String customParameters) {
        this.setPIdList(setDefaultPIdList());
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
    }

    public PddDdkRpPromUrlGenerateRequest(String customParameters, Integer channelType) {
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        this.setChannelType(channelType);
        this.setPIdList(setDefaultPIdList());
    }
}
