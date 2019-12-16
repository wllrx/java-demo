package com.zoe.java8.answer;

import cn.gjing.util.TimeUtil;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author zoe
 **/
public class Answer1 {
    public static void main(String[] args) {
        String s = "AAABk";
        System.out.println( charStr(s));
        System.out.println(mostLowercaseString(Arrays.asList("aaa","As","Bb")));
        String s1 = TimeUtil.localDateTimeToString(LocalDateTime.now());
        System.out.println(s1);
    }
    private static int sum(List<Artist> artists){
        long sum = artists.stream().mapToLong(e -> e.getMembers().count()).sum();
        return (int) sum;
        //return artists.stream().map(e -> e.getMembers().count()).reduce(0L, Long::sum).intValue();
    }
    private static int charStr(String s){
        long count = s.chars().filter(Character::isLowerCase).count();
        return (int) count;
    }

    private static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparing(Answer1::charStr));
    }

}
