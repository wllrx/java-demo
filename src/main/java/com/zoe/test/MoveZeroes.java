package com.zoe.test;

import java.util.Arrays;

/**
 * 移动零
 *
 * @author zoe
 **/
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {1,0,1};

        local(nums);
    }

    private static void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                j++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void local(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != 0) {
                continue;
            }
            if (nums[i] != 0) {
                nums[j++] = nums[i];
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
