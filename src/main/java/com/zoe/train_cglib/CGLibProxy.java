package com.zoe.train_cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zoe
 **/
public class CGLibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class<?> clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * 参数：
     * o  目标实例对象
     * method 目标方法的反射对象
     * objects 方法的参数
     * methodProxy 代理类的实例
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用开始....");
        methodProxy.invokeSuper(o,objects);
        System.out.println("调用结束....");
        return null;
    }
}
class TrainTest{
    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        Train train = (Train) cgLibProxy.getProxy(Train.class);
        train.move();
    }
}