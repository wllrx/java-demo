package com.zoe.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zoe
 **/
public class ThreeSum {

    public static void main(String[] args) {
       int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>(16);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                break;
            }

        }
        System.out.println(Arrays.toString(nums));
        return lists;
    }
}

