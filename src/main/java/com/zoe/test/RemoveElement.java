package com.zoe.test;

/**
 * 移除元素
 * @author zoe
 **/
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2};
        int i = removeElement(nums, 3);
        System.out.println(i);
    }
    private static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i <= nums.length-1 ; i++) {
            boolean b = nums[i] != val;
            if (b){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
