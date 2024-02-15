package com.leetcode.exp.Leetcode_exp.on7thFeb2024;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 */
public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        //int []nums = {1,2,3,4};
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray2(nums));

    }
    public static int findUnsortedSubarray(int[] nums) {
        int [] snums = nums.clone();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Arrays.sort(snums);
        int n = nums.length -1;
        for (int i = 0; i <= n;i++) {
            if (nums[i] != snums[i]) {
                min = Math.min(min,i);
            }
            if (nums[n - i] != snums[n -i]) {
                max = Math.max(max, n -i);
            }
            //System.out.println("#### " + min + " --> " + max + " ### " + snums[i] + "  " + nums[i]);
        }
        if (max == Integer.MIN_VALUE) return 0;
        return max - min + 1;
    }
    public static int findUnsortedSubarray2(int[] nums) {
        int n = nums.length -1;
        int max = nums[0];
        int min = nums[n];
        int localMin =max;
        int localMax = min;
        
        for (int i =1 ; i < n ;i++ ) {
            if (nums[i -1 ] > nums[i]) {
                min = Math.min(min,i);
                if (localMin < nums[i] ) {
                    localMin = nums[i];
                }
            }
            if (nums[n-i ] < nums[n-i-1]) {
                max = Math.max(max,n-i+1);
                if (localMax > nums[n-i+1] ) {
                    localMax = nums[n-i+1];
                }
            }

        }
        System.out.println(min);
        System.out.println(max);
        if (max == nums[0]) return 0;
        return max - min + 1;
    }
    
}
