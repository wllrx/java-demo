package com.zoe.test;

/**
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * @author zoe
 **/
public class ConsecutiveNumbersCount {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1,1};
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            count = num == 0 ? 0 : count + 1;
            max = Math.max(count, max);
        }
        System.out.println(max);
    }
}
