package com.zoe.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zoe
 **/
public class FrequencySort {

    public static void main(String[] args) {
        String s = "aAbb";
        String frequencySort = frequencySort(s);
        System.out.println(frequencySort);
    }

    private static String frequencySort(String s) {
        StringBuilder builder = new StringBuilder();
        Map<String, Long> result = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> finalMap = new LinkedHashMap<>(16);
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        finalMap.forEach((k, v) -> {
            if (v > 1) {
                for (int i = 0; i < v; i++) {
                    builder.append(k);
                }
            } else {
                builder.append(k);
            }
        });
        return builder.toString();
    }
}
