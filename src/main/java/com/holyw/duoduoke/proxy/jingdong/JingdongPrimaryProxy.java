package com.holyw.duoduoke.proxy.jingdong;

import com.holyw.duoduoke.client.IClient;
import com.holyw.duoduoke.support.jingdong.JingdongSupportRepository;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.AbstractResponse;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class JingdongPrimaryProxy implements InvocationHandler {


    IClient client;

    public JingdongPrimaryProxy(IClient client) {
        this.client = client;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("hashCode")) {
            return 0;
        }
        if (method.getName().equals("toString")) {
            return JingdongSupportRepository.class.getName();
        }
        try {
            return ((JdClient) client.getDefaultClient()).execute((JdRequest<? extends AbstractResponse>) args[0]);
        } catch (NullPointerException e) {
        }
        return null;
    }

    public <T> T getProxy(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, this);
    }
}
