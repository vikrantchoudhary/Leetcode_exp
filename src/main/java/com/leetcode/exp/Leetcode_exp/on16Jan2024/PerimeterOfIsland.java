package com.leetcode.exp.Leetcode_exp.on16Jan2024;

public class PerimeterOfIsland {
    public static void main(String[] args) {
       // int [][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
       int [][] grid = {{1}};
        System.out.println("Perimete of the given grid is " + islandPerimeter(grid));

    }
    public static int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length ==0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;
        for (int i = 0; i< rows ; i++) {
            for (int j =0; j < cols ; j++) {        
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (i > 0 && grid [i-1][j] == 1) {
                        perimeter -=2;
                    }
                    if ( j > 0 && grid[i][j-1] == 1) {
                        perimeter -=2;
                    }
                }

            }
            
        }
        return perimeter;
    }
    
}
