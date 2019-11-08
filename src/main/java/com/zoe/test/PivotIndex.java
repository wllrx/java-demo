package com.zoe.test;

import java.util.Arrays;

/**
 * 数组中心索引
 *
 * @author zoe
 **/
public class PivotIndex {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int index = pivotIndex(nums);
        System.out.println(index);
    }

    private static int pivotIndex(int[] nums) {
        int leftNum = 0;
        int sum = Arrays.stream(nums).sum();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (i != 0) {
                leftNum += nums[i - 1];
            }
            if (sum - leftNum - nums[i] == leftNum) {
                return i;
            }
        }
        return -1;
    }
}
