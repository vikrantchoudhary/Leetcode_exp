package com.leetcode.exp.Leetcode_exp.on16Jan2024;
/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * 
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums [] = {1,0,1,1,0,1};
        System.out.println("Max number of consecutive ones " + findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int current_one_count = 0;
        for (int i=0; i<nums.length;i++) {
            if (nums[i] == 1) {
                current_one_count++;
                max_count = Math.max(max_count, current_one_count);
            }else {
                current_one_count = 0;
            }
        }
        return max_count;
    }
    
}
