package com.zoe.course;

/**
 * @author zoe
 **/
public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int availableProcessors = runtime.availableProcessors();
        System.out.println("Java虚拟机可用的处理器数量: "+availableProcessors);
        long maxMemory = runtime.maxMemory();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println("Java虚拟机将占用的最大内存量: "+maxMemory);
        System.out.println("Java虚拟机中的内存总量: "+totalMemory);
        System.out.println("Java虚拟机中可用的内存量: "+freeMemory);
    }
}
