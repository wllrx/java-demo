package com.zoe.test;

/**
 * @author zoe
 **/
public class Reverse {
    public static void main(String[] args) {
        int x = 123;
        int reverse = reverse(x);
        System.out.println(reverse);
    }
    private static int reverse(int x) {
        String s = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse();
        return Integer.parseInt(s);
    }
}
