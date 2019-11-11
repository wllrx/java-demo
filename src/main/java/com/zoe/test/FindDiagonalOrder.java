package com.zoe.test;

import java.util.Arrays;

/**
 * @author zoe
 **/
public class FindDiagonalOrder {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ints = findDiagonalOrder1(matrix);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int iNum  = matrix.length;
        int jNum = matrix[0].length;
        int[] result = new int[iNum*jNum];
        boolean isUp = true;
        int resultIndex = 0;
        int iIndex = 0, jIndex = 0;
        //边界控制
        while(iIndex < iNum && jIndex < jNum){
            if(isUp){
                //遍历上升的所有数
                while(iIndex >=0 && jIndex >=0 && iIndex < iNum && jIndex <jNum){
                    result[resultIndex++] = matrix[iIndex--][jIndex++];
                }
                //上面退出循环后多改变了一次，要先还原到up的最后一个元素的index状态
                iIndex++;jIndex--;
                //先j+1；
                if(jIndex+1 < jNum){
                    jIndex++;
                }else{
                    //j会超过边界，此时i+1;
                    iIndex++;
                }
                isUp = false;
            }else{
                //遍历下降的所有数
                while(iIndex >=0 && jIndex >=0 && iIndex < iNum && jIndex <jNum){
                    result[resultIndex++] = matrix[iIndex++][jIndex--];
                }
                //revert，和up的解释相同
                iIndex--;jIndex++;
                if(iIndex + 1 < iNum){
                    //先i+1
                    iIndex++;
                }else{
                    //i会超出边界，此时j+1
                    jIndex++;
                }
                isUp = true;
            }
        }
        return result;
    }

    private static int[] findDiagonalOrder1(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        // 待处理的矩阵有M行、N列
        int m = matrix.length;
        int n = matrix[0].length;
        // 用来存放遍历的结果
        int[] result = new int[m * n];
        int r = 0;
        int c = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[r][c];
            if ((r + c) % 2 == 0) {
                // 元素在最后一列，往下走
                if (c == n - 1) {
                    r++;
                    // 元素在第一行，往右走
                } else if (r == 0) {
                    c++;
                    // 其他情况，往右上走
                } else {
                    r--;
                    c++;
                }
            } else {
                //元素在最后一行，往右走
                if (r == m - 1) {
                    c++;
                    // //元素在第一列，往下走
                } else if (c == 0) {
                    r++;
                    //其他情况，往左下走
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
