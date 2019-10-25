package com.zoe.java8;

/**
 * @author zoe
 *
 **/
public class Sample2 {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello World 1");
        r1.run();

        Thread thread = new Thread(()-> System.out.println("Hello World 2"));
        thread.run();
    }
}
