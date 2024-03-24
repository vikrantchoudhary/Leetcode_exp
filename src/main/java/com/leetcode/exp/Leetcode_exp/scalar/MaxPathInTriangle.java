package com.leetcode.exp.Leetcode_exp.scalar;

public class MaxPathInTriangle {
    public static void main(String[] args) {
        int A[][] = {
            {725,0,0,0,0,0,0,0,0,0},
            {479,359,0,0,0,0,0,0,0,0},
            {963,465,706,0,0,0,0,0,0,0},
            {146,282,828,962,0,0,0,0,0,0},
            {492,996,943,828,437,0,0,0,0,0},
            {392,605,903,154,293,383,0,0,0,0},
            {422,717,719,896,448,727,772,0,0,0},
            {539,870,913,668,300,36,895,704,0,0},
            {812,323,334,674,665,142,712,254,869,0},
            {548,645,663,758,38,860,724,742,530,779}
        };
        System.out.println(solve(A));
    }
    public static int solve(int[][] A) {
        
        int rows = A.length;
        int sum = A[0][0];
        int sum1 =0 , sum2 = 0;
        int j = 1;
        for (int i = 1; i < rows ;i++ ) {
                sum1 = sum + A[i][j-1];
                sum2 = sum + A[i][j];
                if (sum1 < sum2)  {
                    sum = sum2;
                    j = i+1;

                }else {
                    sum = sum1;
                    j=i;
                }
        }
        return sum;
    }
    
}
