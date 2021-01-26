package com.holyw.duoduoke.request;

import org.springframework.util.StringUtils;

import java.util.List;

public class PddDdkLotteryUrlGenRequest extends com.pdd.pop.sdk.http.api.pop.request.PddDdkLotteryUrlGenRequest {
    /***
     custom_parameters	STRING	非必填	自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     generate_qq_app	BOOLEAN	非必填	是否生成qq小程序
     generate_schema_url	BOOLEAN	非必填	是否返回 schema URL
     generate_short_url	BOOLEAN	非必填	是否生成短链接，true-是，false-否
     generate_weapp_webview	BOOLEAN	非必填	是否生成唤起微信客户端链接，true-是，false-否，默认false
     generate_we_app	BOOLEAN	非必填	是否生成大转盘和主题的小程序推广链接
     multi_group	BOOLEAN	非必填	true--生成多人团推广链接 false--生成单人团推广链接（默认false）1、单人团推广链接：用户访问单人团推广链接，可直接购买商品无需拼团。2、多人团推广链接：用户访问双人团推广链接开团，若用户分享给他人参团，则开团者和参团者的佣金均结算给推手
     pid_list	STRING[]	必填	推广位
     */
    public PddDdkLotteryUrlGenRequest(String customParameters, Boolean generateQqApp, Boolean generateSchemaUrl, Boolean generateShortUrl, Boolean generateWeappWebview, Boolean generateWeApp, Boolean multiGroup, List<String> pidList) {
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        this.setGenerateQqApp(generateQqApp);
        this.setGenerateSchemaUrl(generateSchemaUrl);
        this.setGenerateShortUrl(generateShortUrl);
        this.setGenerateWeappWebview(generateWeappWebview);
        this.setGenerateWeApp(generateWeApp);
        this.setMultiGroup(multiGroup);
        this.setPidList(pidList);
    }
}
