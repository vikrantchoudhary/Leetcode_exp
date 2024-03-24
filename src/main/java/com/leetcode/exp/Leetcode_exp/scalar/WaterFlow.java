package com.leetcode.exp.Leetcode_exp.scalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WaterFlow {
    public static void main(String[] args) {
        int A[][] = {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
            };
        //int A[][] = {{2,3,6,7},{2,3,4,5}};
        System.out.println(solve(A));
        
    }
    public static int solve(int[][] A) {
       int rows = A.length;
       int cols  = A[0].length;
       boolean[][] red = new boolean[rows][cols];
       boolean[][] blue = new boolean[rows][cols];
       for (int i = 0; i < cols ; i++) {
        dfs(0,i,rows,cols,red,A[0][i],A);
        dfs(rows - 1,i,rows,cols,blue,A[rows - 1][i],A);
       } 
       for (int i = 0; i < rows ; i++) {
        dfs(i,0,rows,cols,red,A[i][0],A);
        dfs(i,cols -1,rows,cols,blue,A[i][cols - 1],A);
       } 
       List<List<Integer>> res = new ArrayList<>();
       
       for (int i = 0 ; i < rows ; i++) {
        for (int j =0 ; j < cols;j++) {
            if (red[i][j] && blue[i][j]) {
               res.add(Arrays.asList(i,j));
            }
        }
       }
       return res.size();

    }
    public static void dfs(int r, int c , int rows, int cols, boolean[][] visited, int prev,int[][] A ) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c] || prev > A[r][c]) return;
        visited[r][c] = true;
        dfs(r+1,c,rows,cols,visited,A[r][c],A);
        dfs(r-1,c,rows,cols,visited,A[r][c],A);
        dfs(r,c-1,rows,cols,visited,A[r][c],A);
        dfs(r,c+1,rows,cols,visited,A[r][c],A);
    }
   
}