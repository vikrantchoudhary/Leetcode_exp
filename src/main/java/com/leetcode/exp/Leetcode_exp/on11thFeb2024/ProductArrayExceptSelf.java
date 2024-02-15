package com.leetcode.exp.Leetcode_exp.on11thFeb2024;

import java.util.Arrays;

/**
 * 
 */
public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4};
        int result[] = productExceptSelf2(nums);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        if (nums.length <=1) return nums;
        int prod;
        int result[] = new int[nums.length];
        for (int i = 0; i< nums.length;i++) {
            prod = 1;
            for (int j = 0; j < nums.length;j++) {
                if (i != j)prod = prod*nums[j];
            }
            result[i] = prod;
        }
        return result;
    }
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
       int[] leftProduct = new int[n];
       int [] rightProduct = new int[n];
       leftProduct[0] = 1;
       rightProduct[n -1] = 1;
       for (int i=1 ;i < n; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
       }
       for (int i=n-2 ;i >=0; i--) {
         rightProduct[i] = rightProduct[i+1] * nums[i+1];
       }
       for (int i = 0 ; i < n;i++) {
        nums[i] = leftProduct[i] * rightProduct[i];
       }
       for (int n1 : rightProduct) {
        System.out.println(n1 + " " );
       }
       return nums;
    }
    
}
