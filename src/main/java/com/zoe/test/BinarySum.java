package com.zoe.test;

/**
 * 二进制求和
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 * @author zoe
 **/
public class BinarySum {
    public static void main(String[] args) {
        System.out.println(BinarySum.addBinary("11111", "10001"));
    }

    private static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                //ASC码48就是'0'，也就是说'0'的值是48，而后依次是'1'到'9'。 这样正好是char型减去48就是它对应的int值
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            builder.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            builder.append(carry);
        }
        return builder.reverse().toString();
    }

}
