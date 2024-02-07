package com.leetcode.exp.Leetcode_exp.on7thFeb2024;
/*
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
 */
public class LongestContinousSubArray {
    public static void main(String[] args) {
        int []nums = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
    public static int findLengthOfLCIS(int[] nums) {

        if (nums.length  <1 ) return nums.length;
        int max = 1,prev,count=1;
        prev = nums[0];
        for (int i =1 ; i < nums.length;i++) {
            if (nums[i] > prev) {
                count++;
                max = Math.max(max, count);
            }else {
                count = 1;
            }
            prev = nums[i];
        }
        return max;
    }
    
}
