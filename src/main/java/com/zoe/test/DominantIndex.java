package com.zoe.test;

import java.text.DecimalFormat;
import java.util.stream.IntStream;

/**
 * 最少是其他数两倍大的最大数
 *
 * @author zoe
 **/
public class DominantIndex {

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1};
        int dominantIndex = dominantIndex(nums);
        System.out.println(dominantIndex);
    }

    private static int dominantIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        int max = IntStream.of(nums).max().getAsInt();
        String format = df.format((float)max / 2);
        int maxIndex = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == max) {
                maxIndex = i;
            }
            if (nums[i] != max && nums[i] < Double.parseDouble(format) && i <= nums.length - 1) {
                return maxIndex;
            }
        }
        return -1;
    }
}
