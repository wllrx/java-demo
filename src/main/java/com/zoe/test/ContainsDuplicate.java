package com.zoe.test;

import java.util.HashSet;

/**
 * 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * @author zoe
 **/
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums ={1,1,2,3,4,5,6};
        boolean containsDuplicate = containsDuplicate(nums);
        System.out.println(containsDuplicate);
    }
    private static boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
