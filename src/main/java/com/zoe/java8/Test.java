package com.zoe.java8;

/**
 * @author zoe
 **/
public class Test {

//    public static void main(String[] args) {
//            double a = 2.0;
//            double b = 1.5;
//            System.out.println(a-b);
//            float c = 2.0f;
//            int d = 1;
//            System.out.println(c-d);
//    }

    public static void main(String[] args) {
        // 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }


}
