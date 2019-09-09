package com.zoe.test;

/**
 * @author Zoe
 **/
public class Test {
    public static void main(StringTest[] args) {
        int m = 7;
        int n = 7;
        int a = 2 * ++m;
        for (int i = 0; i<3;i++){
            int b = 2 * n++;
            System.out.println("b的值为 :"+b);
        }
        System.out.println("a的值为 :"+a);
    }
}
