package com.leetcode.exp.Leetcode_exp.on30thJan2024;

public class FlippingImage {
    public static void main(String[] args) {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int output[][] = flipAndInvertImage(image);
        for (int i =0 ; i < output.length; i++) {
            for (int j =0 ; j< output[0].length ; j++) {
                System.out.print(" " + output[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        int rotated[][] = new int[m][n];
        
        //rotate
        for (int i =0 ; i < m; i++) {
            int j = 0, k = n - 1;
            while (k >= 0) {
                rotated[i][j] = image[i][k];
                k--;
                j++;
            }
           
        }
        for (int i =0 ; i < rotated.length; i++) {
            for (int j =0 ; j< rotated[0].length ; j++) {
                rotated[i][j] = rotated[i][j] == 0 ? 1: 0;
            }
        }

        return rotated;
    }
    
}
