package com.zoe.test;

/**
 * @author zoe
 **/
public class IsHappy1 {
    public static void main(String[] args) {
        int n = 19;
        boolean happy = isHappy(n);
        System.out.println(happy);
    }
    private static boolean isHappy(int n){
        while (n != 1 && n != 4){
            int temp = 0;
            while (n != 0){
                temp += (n % 10)*(n % 10);
                n /= 10;
            }
            n = temp;
        }
        return n==1;
    }
}
