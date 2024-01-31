package com.leetcode.exp.Leetcode_exp.on31stJan2024;
/*
 * https://leetcode.com/problems/flood-fill/description/
 */
public class FloodFill {
    public static void main(String[] args) {
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc =1;
        int color = 2;
        int floodfilled[][] = floodFill(image, sr, sc, color);
        for (int i = 0; i< floodfilled.length;i++) {
            for (int j=0; j <floodfilled[0].length;j++) {
                System.out.print( " " + floodfilled[i][j]);
            }
            System.out.println();
        }

    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            colorchange(image,sr,sc,image[sr][sc],color);
        }
        return image;
        
    }
    public static void colorchange(int[][] image,int row, int col , int prev , int color) {
        if (row < 0 || row >= image.length || col <0 || col >= image[0].length
        || image[row][col] == color || image[row][col] != prev) return;
        image[row][col] = color;
        colorchange(image,row -1,col,prev,color);
        colorchange(image,row +1,col,prev,color);
        colorchange(image,row,col - 1,prev,color);
        colorchange(image,row,col +1 ,prev,color);

    }
}
