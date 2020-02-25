package com.zoe.test;

/**
 * 二进制转数字  数字转二进制
 * @author zoe
 **/
public class SystemUtil {
    public static void main(String[] args) {
        long val = 5L;
        String str = "110";
        System.out.println(binaryToDecimal(str));
        System.out.println(decimalToBinary(val));
    }

    /**
     * 二进制转数字
     * @param var 二进制字符
     * @return 数字
     */
    private static int binaryToDecimal(String var) {
        int i = var.length() - 1;
        int j = 0;
        int sum = 0;
        while (i >= 0) {
            int binary = var.charAt(i--) - '0';
            double value = binary * Math.pow(2, j++);
            sum += value;
        }
        return sum;
    }

    /**
     * 数字转二进制字符
     * @param val 数字
     * @return 二进制字符
     */
    private static String decimalToBinary(Long val) {
        StringBuilder builder = new StringBuilder();
        while (val > 0) {
            int i = Math.toIntExact(val % 2);
            val = val / 2;
            builder.append(i);
        }
        return builder.reverse().toString();
    }
}
