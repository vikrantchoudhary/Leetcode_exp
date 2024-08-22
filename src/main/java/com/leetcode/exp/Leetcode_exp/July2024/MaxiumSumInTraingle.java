package com.leetcode.exp.Leetcode_exp.July2024;

public class MaxiumSumInTraingle {
    public static void main(String[] args) {
        int tri[][] = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
        for (int i=0;i<tri.length;i++) {
            for (int j=0;j<tri[i].length;j++) {
              System.out.print(tri[i][j] + " ");
            }
           }
           System.out.println();
        
       System.out.println(maxPathSum(tri, 0, 0, 4, 4));   
       
    }

    private static int maxPathSum(int[][] tri, int i, int j, int row, int col) {
        // TODO Auto-generated method stub
        if (i == col) {
            return 0;
        }
        if (i == row -1) {
            return tri[i][j];
        }
        return tri[i][j] + Math.max(
            maxPathSum(tri, i+1, j, row, col), 
            maxPathSum(tri, i+1, j+1, row, col)
        );
        //throw new UnsupportedOperationException("Unimplemented method 'maxPathSum'");
    }
}
