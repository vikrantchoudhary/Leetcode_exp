package com.leetcode.exp.Leetcode_exp.on4thJan2024;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0;i < matrix.length;i++) {
            for (int j = 0 ; j< matrix[0].length;j++) {
                System.out.print(" " + matrix[i][j] );
            }
            System.out.println();
        }
        List<Integer> spList = new SpiralMatrix().spiralOrder(matrix);
        for (int sp:spList) {
            System.out.print(sp + " ");
        }


    }
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length < 1 )return null;
        int startR= 0;
        int startC= 0;
        int endR=matrix.length -1;
        int endC = matrix[0].length -1;
        List<Integer> spList = new ArrayList<>();
        while (startR <= endR && startC <= endC) {
            for (int i = startC ; i <= endC;i++) {
                spList.add(matrix[startR][i]);

            }
             startR ++;
              for (int i = startR ; i <= endR;i++) {
                spList.add(matrix[i][endC]);

            }
            endC --;
            if (startR <= endR){
                for (int i = endC ; i >= startC ;i--) {
                    spList.add(matrix[endR][i]);

                }
                endR --;
            }
            
            if (startC <= endC){
                for (int i = endR ; i >= startR;i--) {
                spList.add(matrix[i][startC]);

            }
             startC ++;
            } 
            

        }
        return spList;
    }
    
}
