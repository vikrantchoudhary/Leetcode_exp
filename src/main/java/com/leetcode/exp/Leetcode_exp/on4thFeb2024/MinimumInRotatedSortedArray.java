package com.leetcode.exp.Leetcode_exp.on4thFeb2024;
/*
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 */
public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {11,13,15,17};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length -1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (mid > 0 && nums[mid] < nums[mid -1]) return nums[mid];
            if (nums[mid] >=  nums[left] && nums[mid] >= nums[right]) {
                left = mid + 1;
            }else {
                right = mid -1;
            }
            
        }
        return nums[0];
    }
    
}
