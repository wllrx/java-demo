package com.zoe.test;

import java.util.Arrays;

/**
 * 旋转数组
 * [1,2,3,4,5,6,7]  k = 3   ==>  [5,6,7,1,2,3,4]
 * @author zoe
 **/
public class Rotate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }

    private static void rotate(int[] nums, int k) {
        int num = 0, conversion = 0;
        for (int i = 0; i < k; i++) {
            num = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                conversion = nums[j];
                nums[j] = num;
                num = conversion;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
