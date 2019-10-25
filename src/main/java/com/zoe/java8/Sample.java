package com.zoe.java8;

/**
 * @author zoe
 * 常量是用final修饰的成员变量,常量在类编译时期载入类的常量池中
 **/
public class Sample {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.doIt(); //输出5
        System.out.println(sample.value);  //输出4
    }
    //常量,在编译时载入类的常量池
    final int value = 4;
    public void doIt(){
        int value = 6;
        System.out.println(value); //输出6
        Runnable r = new Runnable() {
            //不可变变量  存储在栈中
            final int value = 5;
            @Override
            public void run() {
                int value =10;
                System.out.println(this.value);//输出5
                System.out.println(value);//输出10
            }
        };
        r.run();
    }
}
