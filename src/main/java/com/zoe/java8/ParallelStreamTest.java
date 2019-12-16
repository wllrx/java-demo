package com.zoe.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author zoe
 **/
public class ParallelStreamTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        integers.parallelStream().forEach(System.out::println);
        BigDecimal b = BigDecimal.valueOf(0);
        int i = b.compareTo(new BigDecimal(0));
        System.out.println(i);


    }
}
