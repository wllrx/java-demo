package com.zoe.test;

import java.util.HashSet;
import java.util.Set;

/**
 * 移除数组中的重复项返回新数组的长度
 * 在原地修改
 * @author zoe
 **/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 6, 6, 6, 6, 6, 9};
        int removeDuplicates = removeDuplicates(nums);
        System.out.println(removeDuplicates);
        int remove = remove(nums);
        System.out.println(remove);
    }

    private static int removeDuplicates(int[] nums) {
        Set<String> set = new HashSet<>(16);
        for (int num : nums) {
            set.add(String.valueOf(num));
        }
        return set.size();
    }

    private static int remove(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[count]) {
                count++;
                nums[count] = nums[j];
            }
        }
        return count + 1;
    }
}
