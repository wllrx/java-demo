package com.zoe.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zoe
 **/
@FunctionalInterface
public interface Listener<T> {
    /**
     * 监听
     *
     * @param t 参数
     */
    void listener(T t);


    /**
     * 默认方法
     *
     * @param after 参数
     * @return T
     */
    default Listener<T> dListener(Listener<? super T> after) {
        return t -> System.out.println("默认方法执行.......");
    }

    /**
     * 静态方法
     *
     * @param a 传入参数
     * @return 传入参数
     */
    static String sListener(String a) {
        System.out.println(a);
        return a;
    }

}

class TestListener {
    public static void main(String[] args) {
        Listener<String> stringListener = System.out::println;
        Listener<String> listener = e -> {
            List<String> strings = new ArrayList<>(16);
            strings.add("aaa");
            strings.add("bbb");
            strings.add("ccc");
            System.out.println(strings);
        };

        stringListener.dListener(listener);
        stringListener.listener("4444444444444444444444");
    }
}