package com.zoe.base;

/**
 * @author zoe
 * 执行顺序
 * 1.main方法
 * 2.静态代码块
 * 3.非静态代码块
 * 4.构造函数执行
 * 5.一般方法执行
 **/
public class Test {
    static int cnt = 6;
    static{
        System.out.println("静态代码块执行......");
        cnt += 9;
    }

    /**
     * 执行此main方法,
     * @param args 参数
     */
    public static void main(String[] args){
        System.out.println("main方法执行......");
        Test test = new Test();
        test.run();
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    };

    public Test() {
        System.out.println("构造函数执行......");
    }

    {
        System.out.println("非静态代码块执行......");
    }
    void run(){
        System.out.println("一般方法执行......");
    }

}

class TestDemo{
    public static void main(String[] args) {
        System.out.println("main方法执行......");
        Test test = new Test();
        test.run();
        TestDemo demo = new TestDemo();
        demo.min();
        demo.demo();
    }
     void demo(){
        int l =10;
         System.out.println(l);
     }
     void min(){
       int l = 9;
         System.out.println(l);
     }
}