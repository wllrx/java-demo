package com.zoe.test;

/**
 * 同构字符串
 * @author zoe
 **/
public class IsIsomorphic {
    public static void main(String[] args) {
        String s = "egg", t = "abd";
        boolean isomorphic = isIsomorphic(s, t);
        System.out.println(isomorphic);
    }

    private static boolean isIsomorphic(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            //利用String类方法 indexOf(char c),返回指定字符在字符串中第一次出现的位置
            if(s.indexOf(chars[i]) != t.indexOf(chars1[i])){
                return false;
            }
        }
        return true;
    }
}
