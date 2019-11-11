package com.zoe.test;

/**
 * @author zoe
 **/
public class MinSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int s = 11;
        int len = minSubArrayLen(s, nums);
        System.out.println(len);
    }

    private static int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
        while (i < nums.length) {
            sum += nums[i++];
            while (sum >= s) {
                min = Math.min(min, i - j);
                sum -= nums[j++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}




