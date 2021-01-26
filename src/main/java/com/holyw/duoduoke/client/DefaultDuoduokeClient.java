package com.holyw.duoduoke.client;

import com.holyw.duoduoke.config.DuoduokePropeties;
import com.pdd.pop.sdk.http.HttpClientConfig;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;

/**
 * DenchyChiang
 */
public class DefaultDuoduokeClient implements IClient {

    private DuoduokePropeties duoduokePropeties;

    public DefaultDuoduokeClient(DuoduokePropeties duoduokePropeties) {
        this.duoduokePropeties = duoduokePropeties;
    }

    @Override
    public PopClient getDefaultClient() {
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        httpClientConfig.setConnectionTimeoutMillis(duoduokePropeties.getConnectionTimeoutMillis());
        httpClientConfig.setConnectionRequestTimeout(duoduokePropeties.getConnectionRequestTimeout());
        return new PopHttpClient(duoduokePropeties.getClientId().replaceAll("\"", ""), duoduokePropeties.getClientSecret().replaceAll("\"", ""), httpClientConfig);
    }
}
