package com.leetcode.exp.Leetcode_exp.on12thJan2024;
/*
 * https://leetcode.com/problems/transpose-matrix/description/
 */
public class TansposeMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] tanspose = transpose(matrix);
        for (int i =0 ; i  < tanspose.length; i++) {
            for (int j=0; j< tanspose[0].length;j++) {
                System.out.print( " " + tanspose[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] tanspose = new int [n][m];
        for (int i =0;i< n; i++) {
            for (int j=0 ; j<m;j++) {
                tanspose[j][i] = matrix[i][j];
            }
        }
        return tanspose;
    }
    
}
