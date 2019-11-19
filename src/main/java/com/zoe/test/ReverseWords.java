package com.zoe.test;

/**
 * 翻转字符串里的单词
 * hello world  ==>   world hello
 *
 * @author zoe
 **/
public class ReverseWords {

    public static void main(String[] args) {
        String s = "      hello                      world";
        String reverseWords = reverseWords(s);
        System.out.println(reverseWords);
    }

    private static String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] strings = s.trim().split(" +");
        for (int i = strings.length-1; i >=0; i--) {
            if (i>0){
                builder.append(strings[i]).append(" ");
            }else {
                builder.append(strings[i]);
            }
        }
        s = builder.toString();
        return s;
    }
}
