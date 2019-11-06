package com.zoe.test;

import java.util.Arrays;

/**
 * 字符串反转
 * @author zoe
 *
 **/
public class StringTest {
    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','o'};
        reverseString(chars);
    }
    private static void reverseString(char[] s) {
        int startIndex =0;
        String [] str = new String[s.length];
        //char[] chars = new char[s.length];
        int endIndex = s.length-1;
        for (int i = endIndex; i >= 0; i--) {
            char c = s[i];
            str[startIndex] = String.valueOf(c);
            startIndex++;
        }
        System.out.println(Arrays.toString(str));
    }
}
