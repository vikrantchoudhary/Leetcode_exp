package com.leetcode.exp.Leetcode_exp.on30thJan2024;
/**
 * https://leetcode.com/problems/find-pivot-index/
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int pivot = pivotIndex(nums);
        System.out.println("pivot index for given array is " + pivot );
    }
    public static int pivotIndex(int[] nums) {
        int total_sum = 0;
        for (int n : nums) {
            total_sum += n;
        }
        int left_sum = 0;
        for (int i = 0; i< nums.length;i++) {
            if (i != 0) left_sum += nums[i-1];
            if (total_sum - left_sum - nums[i] == left_sum) {
                return i;
            }
        }
        return -1;
    }

}
