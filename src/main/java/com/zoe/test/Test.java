package com.zoe.test;

/**
 * @author Zoe
 **/
public class Test {
    public static void main(String[] args) {
        //++m 形式会先完成加1  n++会使用变量原来的值
        int m = 7;
        int n = 7;
        int a = 2 * ++m;
        for (int i = 0; i<3;i++){
            int b = 2 * n++;
            System.out.println("b的值为 :"+b);
        }
        System.out.println("a的值为 :"+a);
        int s = Math.min(m, n);
        System.out.println("s的值为: "+ s);
        
    }
}
