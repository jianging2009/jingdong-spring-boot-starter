package com.holyw.jingdong.client.jingdong;

import com.holyw.jingdong.client.IClient;
import com.jd.open.api.sdk.JdClient;

public interface IJingdongClient extends IClient {
    @Override
    JdClient getDefaultClient();
}
