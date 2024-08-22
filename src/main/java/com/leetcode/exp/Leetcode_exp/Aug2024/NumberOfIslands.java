package com.leetcode.exp.Leetcode_exp.Aug2024;

public class NumberOfIslands {
    public static void main(String[] args) {
        char grid [][] = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        System.out.println("Total islands = " + numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i =0 , j =0; i<grid.length && j<grid[0].length;i++,j++){
            if (grid[i][j] == '1') {
                count ++;
                dfs(grid, i, j);
            }
        }
        return count;

    }
    public static void  dfs(char[][] grid,int i, int j) {
        if (i < 0 || j < 0 || i > grid.length || j > grid.length || grid[i][j] != '1') return;
        grid[i][j] = '0';
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j -1);
        dfs(grid, i, j +1);



    }
    
}
