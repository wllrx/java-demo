package com.zoe.java8;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author zoe
 **/
public class Sample2 {
    public static void main(String[] args) {

        // 创建线程池
        ThreadPoolExecutor service = new ThreadPoolExecutor(5, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1024),
                new ThreadFactoryBuilder().setNameFormat("test-thread-pool-%d").build(),
                new ThreadPoolExecutor.AbortPolicy());
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("线程1执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("线程2执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.setPriority(1);
        thread1.setPriority(10);
        thread.start();
        thread1.start();

//        int num = 10;
//        for (int i = 0; i < num; i++) {
//
//            service.execute(runnable);
//            service.execute(runnable1);
//        }
        System.out.println("当前活动线程数: "+service.getActiveCount());
        System.out.println("已完成线程数: "+service.getCompletedTaskCount());
        System.out.println("总线程数: "+service.getTaskCount());
    }
}
