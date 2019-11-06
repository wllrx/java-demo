package com.zoe.test;

/**
 * @author zoe
 **/
public class SystemUtil {
    public static void main(String[] args) {
        long val = 50L;
        String str = "110010";
        System.out.println(binaryToDecimal(str));
        System.out.println(decimalToBinary(val));
    }

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
