package com.zoe.test;

import java.util.Arrays;

/**
 * 加一
 * [2,3,4] ==> [2,4,5]  [9] ==> [1,0]
 *
 * @author zoe
 **/
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9};
        int[] plusOne = plusOne(digits);
        System.out.println(Arrays.toString(plusOne));
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int plusOne = digits[i] += 1;
            if (plusOne < 10) {
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
