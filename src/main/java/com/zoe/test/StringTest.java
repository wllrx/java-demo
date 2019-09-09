package com.zoe.test;

/**
 * @author Zoe
 **/
public class StringTest {
    public static void main(String[] args) {

        String s = "hello";
        //返回指定索引处的值
        char a = s.charAt(0);
        System.out.println("c的值为: "+a);
        //返回指定索引处的字符(Unicode代码点)
        int b = s.codePointAt(1);
        System.out.println("a的值为 : "+b);
        //返回指定文本范围内Unicode代码点的数量。
        int c = s.codePointCount(0,4);
        System.out.println("b的值为 : "+c);
        //按照字典顺序,字符串位于anotherString之前,返回负数,之后返回正数,相等返回0
        int d = s.compareTo("a");
        System.out.println("d的值为: "+d);


    }
}
