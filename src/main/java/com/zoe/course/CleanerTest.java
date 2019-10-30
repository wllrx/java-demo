package com.zoe.course;

/**
 * @author zoe
 **/
public class CleanerTest implements Runnable {

    public CleanerTest() {
        System.out.println("[构造]一个对象诞生..........");
    }

    @Override
    public void run() {//执行清除时执行的操作
        System.out.println("[回收]对象回收............");
    }

    static class CleanerTesting implements AutoCloseable {
        private CleanerTest cleanerTest;

        @Override
        public void close() throws Exception {

        }
    }

}