package com.leetcode.exp.Leetcode_exp.on2ndFeb2024;

import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/maximum-subarray/description/
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int count = 0, max = 0;
        for (int n: nums) {
            
            if (n < 0) {
                count ++ ;
                max = n;
            }
        }
        if (count == nums.length) {
            return max;
        }
        int local_max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0 ; i< nums.length; i++) {
            sum += nums[i];
            local_max = Math.max(local_max,sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return local_max;
    }
    
}
