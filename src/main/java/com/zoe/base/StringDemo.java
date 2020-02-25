package com.zoe.base;



/**
 * @author zoe
 **/
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str3.intern());
        int a = '2';
        System.out.println(a);
        final Integer i ;


        Thread t=new Thread(){
            @Override
            public void  run(){
                dianping();

            }
        };
        t.run();
        System.out.print("dazhong");
    }
    static void dianping(){
        System.out.print("dianping");
    }

}
