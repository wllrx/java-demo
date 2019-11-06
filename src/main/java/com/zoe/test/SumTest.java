package com.zoe.test;

/**
 * @author zoe
 **/
public class SumTest {
    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        for (int i = 0; i <end ; i++) {
            start += i;
            System.out.println(start);
        }
        start = (1+end)*end/2;
        System.out.println(start);
    }


}
