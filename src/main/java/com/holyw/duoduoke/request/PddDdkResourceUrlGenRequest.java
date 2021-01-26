package com.holyw.duoduoke.request;

import org.springframework.util.StringUtils;

public class PddDdkResourceUrlGenRequest extends com.pdd.pop.sdk.http.api.pop.request.PddDdkResourceUrlGenRequest implements PddBaseRequest{
    /**
     custom_parameters	STRING	非必填	自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     generate_qq_app	BOOLEAN	非必填	是否生成qq小程序
     generate_schema_url	BOOLEAN	非必填	是否返回 schema URL
     generate_we_app	BOOLEAN	非必填	是否生成小程序
     pid	STRING	必填	推广位
     resource_type	INTEGER	非必填	4-限时秒杀,39997-充值中心, 39998-转链type，39996-百亿补贴
     url	STRING	非必填	原链接
     */
    public PddDdkResourceUrlGenRequest(String customParameters,Integer resourceType) {
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        this.setGenerateQqApp(true);
        this.setGenerateSchemaUrl(true);
        this.setGenerateWeApp(true);
        this.setResourceType(resourceType);
        this.setPid(setDefaultPId());
    }
    public PddDdkResourceUrlGenRequest(String customParameters,Integer resourceType,String url) {
        this.setGenerateQqApp(true);
        this.setGenerateSchemaUrl(true);
        this.setGenerateWeApp(true);
        this.setPid(setDefaultPId());
        if (!StringUtils.isEmpty(customParameters)) {
            this.setCustomParameters(customParameters);
        }
        this.setResourceType(resourceType);
        this.setUrl(url);
    }

}
