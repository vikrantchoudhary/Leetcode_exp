package com.leetcode.exp.Leetcode_exp.on15Jan2024;

/**
 * https://leetcode.com/problems/minimum-size-subarray-sum/description/
 */


public class MinumSizeSubArray {
    public static void main(String[] args) {
        int target = 7;
        int nums[] = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minSubSize = Integer.MAX_VALUE;
        int left = 0;
        int val = 0;
        for (int i = 0; i <nums.length;i++) {
            val += nums[i];
            while (val >= target) {
                minSubSize = Math.min(minSubSize,i +1 - left);
                val = val - nums[left];
                left++; 
            }
        }
        return minSubSize!= Integer.MAX_VALUE ? minSubSize : 0;
    }
    
}
