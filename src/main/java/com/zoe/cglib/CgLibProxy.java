package com.zoe.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zoe
 **/
public class CgLibProxy implements MethodInterceptor {
    private CgLibCanteen cgLibCanteen;

    public CgLibProxy(CgLibCanteen cgLibCanteen) {
        this.cgLibCanteen = cgLibCanteen;
    }

    CgLibCanteen proxy(){
        //创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        //设置目标代理类
        enhancer.setSuperclass(CgLibCanteen.class);
        //设置回调方法
        enhancer.setCallback(this);
        return (CgLibCanteen) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("小卖部卖货前......");
        Object invoke = method.invoke(cgLibCanteen,objects);
        System.out.println("小卖部卖货后......");
        return invoke;
    }
}

