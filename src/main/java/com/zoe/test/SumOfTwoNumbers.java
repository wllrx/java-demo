package com.zoe.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和(给定有序数组)
 * 根据双指针计算,所有数循环一次
 *
 * @author zoe
 **/
public class SumOfTwoNumbers {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 4};
//        int target = 6;
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        int[] nums = {-10,-1,-18,-19};
//        int target =-19;
//        int[] nums = {-1, -2, -3, -4, -5};
//        int target = -8;
//        int[] nums = {2, 1, 9, 4, 4, 56, 90, 3};
//        int target = 8;
        int[] ints = numbersIndex(nums, target);
        System.out.println(Arrays.toString(ints));
//        int[] twoSum = twoSum(nums, target);
//        System.out.println(Arrays.toString(twoSum));
    }

    private static int[] numbersIndex(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        int[] resultIndex = new int[2];
        while (startIndex < endIndex) {
            int sum = nums[startIndex] + nums[endIndex];
            //和小于目标数的时候,前指针加一,大于目标数的时候,后指针减一
            if (sum < target) {
                startIndex++;

            } else if (sum > target) {
                endIndex--;
            } else {
                resultIndex[0] = startIndex+1;
                resultIndex[1] = endIndex+1;
                return resultIndex;
            }
        }
        return resultIndex;
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum3(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
