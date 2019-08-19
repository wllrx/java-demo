package com.zoe.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author zoe
 **/
public class WineCounter implements InvocationHandler {
    private Object test;

    public WineCounter(Object test) {
        this.test = test;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始销售 柜台是: "+this.getClass().getSimpleName());
        method.invoke(test,args);
        System.out.println("销售结束");
        return null;
    }
}
