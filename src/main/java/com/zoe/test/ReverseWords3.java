package com.zoe.test;

/**
 * @author zoe
 **/
public class ReverseWords3 {

    public static void main(String[] args) {
        String s = "hello  world";
        String words = reverseWords(s);
        System.out.println(words);
    }

    private static String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] strings = s.trim().split(" +");
        for (int i = 0; i <= strings.length - 1; i++) {
            builder.append(new StringBuilder(strings[i]).reverse().append(" "));
        }
        s = builder.toString().trim();
        return s;
    }
}
