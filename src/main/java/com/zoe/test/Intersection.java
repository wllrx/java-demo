package com.zoe.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 * @author zoe
 **/
public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ints = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet(16);
        for (int num1 : nums1) {
            for (int num2 : nums2){
                if (num1 == num2) {
                    set.add(num1);
                }
            }
        }
        int[] ints = set.stream().mapToInt(Number::intValue).toArray();
        return ints;
    }
}
