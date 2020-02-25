package com.zoe.design;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zoe
 **/
public class CglibDbQueryInterceptor implements MethodInterceptor {
    IDBQuery real = null;
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //代理类内部逻辑和jdk代理的逻辑一样
        if (real == null){
            real = new DBQuery();
        }
        return real.request();
    }
    public static IDBQuery createCglibProxy(){
        Enhancer enhancer = new Enhancer();
        //指定切入器.定义代理类逻辑
        enhancer.setCallback(new CglibDbQueryInterceptor());
        //指定实现接口
        enhancer.setInterfaces(new Class[] {IDBQuery.class});
        //生成代理类实例
        IDBQuery cglibProxy = (IDBQuery) enhancer.create();
        return cglibProxy;
    }
}
