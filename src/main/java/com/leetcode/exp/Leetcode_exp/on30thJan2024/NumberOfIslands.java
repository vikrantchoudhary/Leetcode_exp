package com.leetcode.exp.Leetcode_exp.on30thJan2024;

public class NumberOfIslands {
    public static void main(String[] args) {
        char [][] grid = {{'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}
      };
      System.out.println(numIslands(grid));

    }
    public static int numIslands(char[][] grid) {
        int totalIsland = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n; j++) {
                if (grid[i][j] == '1') {
                    totalIsland ++;
                    findFurtherIslands(grid,i,j);
                }
            }
        }

        return totalIsland;
    }
    public static void findFurtherIslands(char[][] grid,int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        findFurtherIslands(grid,i-1,j);
        findFurtherIslands(grid,i+1,j);
        findFurtherIslands(grid,i,j-1 );
        findFurtherIslands(grid,i,j+1);

    }
    
}
