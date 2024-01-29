package com.leetcode.exp.Leetcode_exp.on26thJan2024;

public class RotateArray {
    public static void main(String[] args) {
        int [] input = {1,2,3,4,5,6,7};
        int k = 3;
        rotate2(input, k);
        for (int i : input) {
            System.out.print( " " + i);
        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int [k];
        for (int i=0 ; i < n - k; i++) {
            if (i < k) {
                temp[i] = nums[k+i];
                nums[k+i] = nums[i];
            }
        }
        for (int i=0;i<k;i++) {
            nums[i] = temp[i];
        }
    }
    // 2nd approach
    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rotateArray(nums,0,n-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,n-1);
    }
    public static void rotateArray(int [] nums, int start , int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
    
}
