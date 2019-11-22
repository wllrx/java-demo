package com.zoe.test;

import java.util.Arrays;

/**
 * 有效的字母异位词
 * 字符串根据字典序排序 后 比较是否相等
 * @author zoe
 **/
public class IsAnagram {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars, chars1);
    }
}
