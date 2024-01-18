package com.leetcode.exp.Leetcode_exp.on17Jan2024;

public class MaxIncreaseSkyline {
    public static void main(String[] args) {
        int[][] grid = {
            {3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}
        };
        System.out.println("Max increase in skyline " + maxIncreaseKeepingSkyline(grid));
    }
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int total=0;
        int n = grid.length;
        int max_row[] = new int[n];
        int max_col[] = new int[n];
        for (int i = 0 ; i < n ; i++) {
            for (int j =0; j<n; j++) {
                max_row[i] = Math.max(max_row[i],grid[i][j]);
                max_col[j] = Math.max(max_col[j], grid[i][j]);
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0;j<n;j++) {
                total += Math.min(max_row[i], max_col[j]) - grid[i][j];
            }
        }
        return total;
    }
    
}
