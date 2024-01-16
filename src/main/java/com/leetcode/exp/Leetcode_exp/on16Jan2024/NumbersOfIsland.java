package com.leetcode.exp.Leetcode_exp.on16Jan2024;

public class NumbersOfIsland {
    public static void main(String[] args) {
        char [][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'} };
        System.out.println("total number of island are " + numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i =0 ; i < grid.length;i++) {
            for (int j =0; j < grid[0].length;j++) {
                if (grid[i][j] == '1') {
                    count++;
                    findfurtherLand(i,j,grid);
                }
            }
        }
        return count;
    }
    public static void findfurtherLand(int i, int j, char[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        findfurtherLand(i-1, j, grid);
        findfurtherLand(i, j-1, grid);
        findfurtherLand(i+1, j, grid);
        findfurtherLand(i, j+1, grid);
        return;
    }
    
}
