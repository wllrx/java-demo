package com.zoe.test;

/**
 * 实现strStr()函数
 *
 * @author zoe
 **/
public class StrStr {
    public static void main(String[] args) {
        int strStr = strStr("hello", "ll");
        System.out.println(strStr);
    }

    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;
        }
        int i = haystack.indexOf(needle);
        return i;
    }
}
