package com.leetcode.exp.Leetcode_exp.on30thJan2024;

public class SmallestRangeI {
    public static void main(String[] args) {
        int []nums = {1,3,6};
        int  k = 3;
        System.out.println(smallestRangeI(nums, k));
        
    }
    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for ( int n : nums) {
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        if ((max - k) > (min +k)) return (max - k) - (min +k);
        return 0;
    }
}
