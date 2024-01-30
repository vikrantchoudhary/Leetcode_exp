package com.leetcode.exp.Leetcode_exp.on30thJan2024;
/**
 * https://leetcode.com/problems/max-consecutive-ones-iii/description/
 */
public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int output = longestOnes(nums, k);
        System.out.println(output);
    }
    public static int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == 0){
               k--;
            }
            if ( k <0) {
                if (nums[j] == 0) {
                    k++;
                } 
                j++;
            }

            i++;
        }


        return i - j;
        
    }
    
}
