package com.leetcode.exp.Leetcode_exp.on16Jan2024;

/**
 * https://leetcode.com/problems/max-area-of-island/
 */
public class MaxAreaIsland {
    static boolean visited[][];
    public static void main(String[] args) {
        int [][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0}
        ,{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println("max area in given grid  " + maxAreaOfIsland(grid));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int max_area = 0;
        visited = new boolean[rows][cols];
        for (int i = 0 ; i < rows; i++) {
            for (int j =0; j<cols; j++) {
                max_area = Math.max(max_area, areaij(i,j,grid));
            }
        }
        return max_area;
    }
    public static int areaij(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i>= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] == 0) return 0;
        visited[i][j] = true;
        return (1 + 
            areaij(i-1, j, grid) +
            areaij(i+1, j, grid) +
            areaij(i, j-1, grid) +
            areaij(i, j+1, grid) 
            );
    }
    
}
