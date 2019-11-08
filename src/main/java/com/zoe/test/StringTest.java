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
        reverseString1(chars);
    }
    private static void reverseString(char[] s) {
        int startIndex =0;
        char[] chars = new char[s.length];
        int endIndex = s.length-1;
        for (int i = endIndex; i >= 0; i--) {
            char c = s[i];
            chars[startIndex] = c;
            startIndex++;
        }
        System.out.println(Arrays.toString(chars));
    }
    private static void reverseString1(char[] s) {
        int start = 0;
        int end = s.length-1;
        int num = s.length/2;
        for (int i = end; i >= num; i--) {
            char c = s[i];
            s[i] = s[start];
            s[start] = c;
            start++;
        }
        System.out.println(s);
    }

}
