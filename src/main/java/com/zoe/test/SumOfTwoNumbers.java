package com.zoe.test;

import java.util.Arrays;

/**
 * 两数之和(给定有序数组)
 * 根据双指针计算,所有数循环一次
 * @author zoe
 **/
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = numbersIndex(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] numbersIndex(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int[] resultIndex = new int[2];
        while (startIndex < endIndex) {
            int sum = nums[startIndex] + nums[endIndex];
            //和小于目标数的时候,前指针加一,大于目标数的时候,后指针减一
            if (sum < target) {
                startIndex++;
            } else if (sum > target) {
                endIndex--;
            } else {
                resultIndex[0] = startIndex + 1;
                resultIndex[1] = endIndex + 1;
                return resultIndex;
            }
        }
        return resultIndex;
    }
}
