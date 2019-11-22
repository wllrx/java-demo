package com.zoe.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zoe
 **/
public class FrequencySort {

    public static void main(String[] args) {
        String s = "Aabb";
        String frequencySort = frequencySort(s);
        System.out.println(frequencySort);
    }

    private static String frequencySort(String s) {
        StringBuilder builder = new StringBuilder();
        TreeMap<String, Long> result = Arrays.stream(s.split(""))
                .sorted()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        List<Map.Entry<String, Long>> list = new ArrayList<Map.Entry<String, Long>>(result.entrySet());
        list.sort((o1, o2) -> {
            return o2.getValue().compareTo(o1.getValue());
        });
        System.out.println("............."+list);
        list.forEach(builder::append);
        result.forEach((k, v) -> {
            if (v > 1) {
                for (int i = 0; i < v; i++) {
                    builder.append(k);
                }
            } else {
                builder.append(k);
            }
        });
        System.out.println(result);
        return builder.toString();
    }
}
