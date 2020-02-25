package com.zoe.java8;

/**
 * @author zoe
 **/
public class ListenerImpl<T> implements Listener<T> {
    @Override
    public void listener(T t) {

    }

    @Override
    public Listener<T> dListener(Listener<? super T> after) {
       return Listener.super.dListener(System.out::println);
    }
}
