package com.zoe.java8.answer;

/**
 * @author zoe
 **/
public interface Child extends Parent {

    /**
     * 重写默认方法
     */
    @Override
    default void welcome(){
        System.out.println("hello child");
    }
}
