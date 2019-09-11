package com.zoe.test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author zoe
 **/
public class BigTest {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger(String.valueOf(10));
        //加
        BigInteger bigInteger1 =  bigInteger.add(BigInteger.valueOf(10));
        System.out.println("bigInteger1的值为 : "+bigInteger1);
        //减
        BigInteger bigInteger2 = bigInteger.subtract(BigInteger.valueOf(5));
        System.out.println("bigInteger2的值为 : "+bigInteger2);
        //乘
        BigInteger bigInteger3 = bigInteger.multiply(BigInteger.valueOf(10));
        System.out.println("bigInteger3的值为 : "+bigInteger3);
        //除
        BigInteger bigInteger4 = bigInteger.divide(BigInteger.valueOf(10));
        System.out.println("bigInteger4的值为 : "+bigInteger4);
        //比较大小  当前值大于新值返回1 小于新值返回-1  等于新值返回0
        int big = bigInteger.compareTo(new BigInteger(String.valueOf(10)));
        System.out.println("big的值为 : "+big);
        BigDecimal bigDecimal = new BigDecimal(20);
        //加
        BigDecimal bigDecimal1 = bigDecimal.add(BigDecimal.valueOf(30));
        System.out.println("bigDecimal1的值为 : "+bigDecimal1);
        //减
        BigDecimal bigDecimal2 = bigDecimal.subtract(BigDecimal.valueOf(5));
        System.out.println("bigDecimal2的值为 : "+bigDecimal2);
        //乘
        BigDecimal bigDecimal3 = bigDecimal.multiply(BigDecimal.valueOf(20));
        System.out.println("bigDecimal3的值为 : "+bigDecimal3);
        //除
        BigDecimal bigDecimal4 = bigDecimal.divide(BigDecimal.valueOf(2));
        System.out.println("bigDecimal4的值为 : "+bigDecimal4);
        //比较大小 当前值大于新值返回1 小于新值返回-1  等于新值返回0
        int bigd = bigDecimal.compareTo(new BigDecimal(21));
        System.out.println("bigd的值为: "+bigd);
    }
}
