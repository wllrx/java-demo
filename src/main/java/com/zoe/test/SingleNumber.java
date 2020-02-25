package com.zoe.test;

/**
 * 找出只出现一次的数
 * @author zoe
 **/
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int i = singleNumber(nums);
        System.out.println(i);
    }
    private static int singleNumber(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int z = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                z = z ^ nums[i];
                System.out.println("循环次数: "+i+"值" +(z ^ nums[i]));
            }
        }
        return z;
    }
}
