package com.zoe.course;

/**
 * @author zoe
 **/
public class SystemTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0;i<300;i++){
            System.out.println(111111);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时: " + (end-start));
        //实际调用的是Runtime类的gc  public static void gc() {
        //        Runtime.getRuntime().gc();
        //    }
        System.gc();
    }
}
