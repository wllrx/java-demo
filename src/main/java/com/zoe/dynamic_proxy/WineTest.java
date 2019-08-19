package com.zoe.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author zoe
 **/
public class WineTest {
    public static void main(String[] args) {

        MaoTaiWine maoTaiWine = new MaoTaiWine();
        WuWine wuWine = new WuWine();
        SellSmoke sellSmoke = new SellSmoke();

        InvocationHandler invocationHandler = new WineCounter(maoTaiWine);
        InvocationHandler handler = new WineCounter(wuWine);
        InvocationHandler smoke = new WineCounter(sellSmoke);

        SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(MaoTaiWine.class.getClassLoader(),MaoTaiWine.class.getInterfaces(),invocationHandler);
        SellWine proxyInstance = (SellWine) Proxy.newProxyInstance(WuWine.class.getClassLoader(),WuWine.class.getInterfaces(),handler);
        SellWine sellWine = (SellWine) Proxy.newProxyInstance(SellSmoke.class.getClassLoader(),SellSmoke.class.getInterfaces(),smoke);

        dynamicProxy.wine();
        proxyInstance.wine();
        sellWine.wine();
    }
}
