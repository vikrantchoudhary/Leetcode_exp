package com.leetcode.exp.Leetcode_exp.on1stFeb2024;

public class RotateImage {
    public static void main(String[] args) {
        int [][] image  = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(image);
        for (int i = 0 ; i < image.length;i++) {
            for (int j=0; j < image[0].length;j++){
                System.out.print(" " + image[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        // tanspose the matrix
        for (int i = 0 ; i < matrix.length;i++) {
            for (int j=i+1; j < matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
        }
        
        //flip the matrix
        for (int i = 0; i<matrix.length;i++) {
            int a_pointer = 0;
            int b_pointer = matrix[0].length -1;
            while (a_pointer < b_pointer){
                int temp = matrix[i][a_pointer];
                matrix[i][a_pointer] = matrix[i][b_pointer];
                matrix[i][b_pointer] = temp;
                a_pointer++;
                b_pointer--;
            }
        }
    }
    
}
