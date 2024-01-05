package com.leetcode.exp.Leetcode_exp.on5thJan2024;
/*
 * https://leetcode.com/problems/spiral-matrix-ii/
 */
public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 4;
        int sprialMatix2 [][] = generateMatrix(n);
        //print matix
        for (int i =0; i< n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " +sprialMatix2[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int n){
        int [][] marix = new int[n][n];
        if (n <1) return marix;
        int startRow = 0,endRow = n -1;
        int startCol=0 , endCol = n -1;
        int k = 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol ; i<= endCol;i++ ) {
                marix[startRow][i] = k;
                k++;
            }
            startRow ++;
            for (int i = startRow ; i<= endRow;i++ ) {
                marix[i][endCol] = k;
                k++;
            }
            endCol --;
            for (int i = endCol; i >= startCol;i--) {
                marix[endRow][i] = k;
                k++;
            }
            endRow --;
            for (int i = endRow; i >= startRow;i--) {
                marix[i][startCol] = k;
                k++;
            }
            startCol++;

        }
        return marix;
    }
    
}
