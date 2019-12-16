package com.zoe.java8.answer;

/**
 * @author zoe
 **/
public interface Parent {

    /**
     * message
     *
     * @param msg 消息
     */
    void message(String msg);

    /**
     * 默认方法
     */
    default void welcome() {
        message("hello parent");
    }

    /**
     * ...
     *
     * @return str
     */
    String getLastMessage();
}
