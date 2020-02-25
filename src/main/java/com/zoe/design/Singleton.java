package com.zoe.design;

/**
 * @author zoe
 **/
public class Singleton {
    private Singleton() {
        System.out.println("创建单例.........");
    }
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }

    public static void createString(){
        System.out.println("createString in Singleton");
    }

}

/**
 * 懒加载创建单例保证线程安全会消耗性能
 */
class LazySingleton{
    private LazySingleton() {
        System.out.println("懒加载.....");
    }

    private static  LazySingleton lazySingleton = null;
    public static synchronized LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

/**
 * 静态内部类
 */
class StaticSingleton{
    private StaticSingleton() {
        System.out.println("静态内部类....");
    }
    private static class SingletonHolder{
        private static StaticSingleton singleton = new StaticSingleton();
    }
    public static StaticSingleton getInstance(){
        return SingletonHolder.singleton;
    }
}


