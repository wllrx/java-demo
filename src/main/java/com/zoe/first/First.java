package com.zoe.first;

/**
 * @author zoe
 **/
public class First {
    public static void main(String[] args) {
//        int a = 1;
//        a = a+1;
//        System.out.println(a);



        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString) );
        //忽略大小写
        System.out.println( str.compareToIgnoreCase(anotherString) );
        System.out.println( str.compareTo(objStr.toString()));
    }
}
