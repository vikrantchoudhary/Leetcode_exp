package com.leetcode.exp.Leetcode_exp.on5thFeb2024;

public class ReshapeMatrix {
    public static void main(String[] args) {
       int [][] mat = {{1,2},{3,4}};
       int r = 2, c = 4;
       int [][] reshape_matrix = matrixReshape(mat, r, c);
       
       for (int i = 0 ; i <reshape_matrix.length ; i++) {
        for (int j =0; j < reshape_matrix[0].length;j++) {
            System.out.print( " " +reshape_matrix[i][j]);
        }
        System.out.println();
        }
    
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if (row * col  != r * c) return mat;

        int [][] result = new int[r][c];
        int l=0,m=0;
        for (int i = 0 ; i  <mat.length ; i++) {
            for (int j =0; j < mat[0].length;j++) {
                result[l][m++] = mat[i][j];
                if (m >= c  ) {
                    l ++;
                    m = 0;
                }
            }
        }
        return result;
    }
    
}
