package com.zoe.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 数组拆分  给定2n的数组,分成n对.例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大
 * 输入: [1,4,3,2]
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 *
 * @author zoe
 **/
public class ArrayOfSplit {
    public static void main(String[] args) {
        List<Integer> collect = Stream
                .of(1, 3, 2, 4, 7, 5, 10, 8)
                .sorted()
                .collect(Collectors.toList());
        int min = 0;
        int sum = 0;
        for (int i = 0; i < collect.size() - 1; i += 2) {
            min = Math.min(collect.get(i), collect.get(i + 1));
            sum += min;
        }
        System.out.println(sum);
        int[] nums = {1, 3, 2, 4, 7, 5, 10, 8};
        int test = test(nums);
        System.out.println(test);
    }

    public static int test(int[] nums){
        Arrays.sort(nums);
        int min = 0;
        int sum = 0;
        for (int i = 0; i < nums.length-1; i+=2) {
            min = Math.min(nums[i], nums[i+1]);
            sum += min;
        }
        return sum;
    }
}
