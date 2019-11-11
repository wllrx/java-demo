package com.zoe.test;

import java.util.stream.IntStream;

/**
 * 最少是其他数两倍大的最大数
 *
 * @author zoe
 **/
public class DominantIndex {

    public static void main(String[] args) {
        int[] nums = {0,0,1,2};
        int dominantIndex = dominantIndex(nums);
        System.out.println(dominantIndex);
    }

    private static int dominantIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int max = IntStream.of(nums).max().getAsInt();
        int maxIndex = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == max) {
                maxIndex = i;
            }
        }
        for (int i = 0; i <= nums.length-1 ; i++) {
            if (i != maxIndex && max < nums[i]*2) {
                return -1;
            }
        }
        return maxIndex;
    }
}
