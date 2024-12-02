package com.leetcode.exp.Leetcode_exp.Aug2024;

public class SortSquareArray {
    public static void main(String[] args) {
        int nums [] = {-4,-1,0,3,10};
        for (int i : sortedSquares(nums)) {
            System.out.println(i);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] result = new int [n];
        int left =0 ,right = n -1;
        while ( left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[n -1] =nums[left] * nums[left];
                left ++;
                
            }else {
                result[n -1] =nums[right] * nums[right];
                right --;
            }
            n --;
        }
        return result;
    }
}
