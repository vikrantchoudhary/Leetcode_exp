package com.leetcode.exp.Leetcode_exp.on15Jan2024;

public class Search2DMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 31;
        if (searchMatrix(matrix, target)) {
            System.out.println("Found in search");
        }else {
            System.out.println("not found");
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length ;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols -1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right -left)/2;
            int mid_element = matrix[mid / cols ] [mid % cols];
            if (mid_element == target) {
                return true;
            }else if (mid_element < target) {
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return false;
    }
    
}
