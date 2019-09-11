package com.zoe.test;

/**
 * @author Zoe
 **/
public class ValueCallTest {

    public static void main(String[] args) {
        double b = 10;
        addValue(b);
        //输出为10
        System.out.println(b);
    }

    /**
     *
     * @param a 接收参数  a接收到b的副本 对副本进行操作
     * @return 结果
     */
    public static double addValue(double a ){
        return a *2;
    }
}
