package com.holyw.jingdong.client.jingdong;

import com.holyw.jingdong.config.jingdong.JingdongPropeties;
import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;

/**
 * DenchyChiang
 */
public class DefaultJingdongClient implements IJingdongClient {

    private JingdongPropeties jingdongPropeties;

    public DefaultJingdongClient(JingdongPropeties jingdongPropeties) {
        this.jingdongPropeties = jingdongPropeties;
    }

    @Override
    public JdClient getDefaultClient() {

        return new DefaultJdClient("https://router.jd.com/api", "",
                jingdongPropeties.getClientId().replaceAll("\"", ""),
                jingdongPropeties.getClientSecret().replaceAll("\"", ""),
               300,300);
    }
}
