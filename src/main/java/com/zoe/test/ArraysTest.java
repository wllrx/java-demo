package com.zoe.test;

import java.util.Arrays;

/**
 * @author Zoe
 **/
public class ArraysTest {
    public static void main(String[] args) {
        Object[] objects = {"aa","bb","cc","dd","ee"};
        System.out.println(Arrays.toString(objects));
        //快速排序
        int[] ints = {22,44,55,1,6,77,99,4,3};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
