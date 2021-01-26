package com.holyw.duoduoke.client.jingdong;

import com.holyw.duoduoke.client.IClient;
import com.jd.open.api.sdk.JdClient;

public interface IJingdongClient extends IClient {
    JdClient getDefaultClient();
}
