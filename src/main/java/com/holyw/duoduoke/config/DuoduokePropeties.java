package com.holyw.duoduoke.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className: DuoduokePropeties
 * @description: TODO
 * @author: Denchy Chiang
 * @date: 2021/1/11
 **/
@ConfigurationProperties(
        prefix = "duoduoke.api"
)
public class DuoduokePropeties {
    private String clientId;
    private String clientSecret;
    private Integer connectionTimeoutMillis = 300;
    private Integer connectionRequestTimeout = 300;
    private String clientClassName;/**配置获取client的自定义实现类*/

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Integer getConnectionTimeoutMillis() {
        return connectionTimeoutMillis;
    }

    public void setConnectionTimeoutMillis(Integer connectionTimeoutMillis) {
        this.connectionTimeoutMillis = connectionTimeoutMillis;
    }

    public Integer getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }

    public void setConnectionRequestTimeout(Integer connectionRequestTimeout) {
        this.connectionRequestTimeout = connectionRequestTimeout;
    }

    public String getClientClassName() {
        return clientClassName;
    }

    public void setClientClassName(String clientClassName) {
        this.clientClassName = clientClassName;
    }
}
