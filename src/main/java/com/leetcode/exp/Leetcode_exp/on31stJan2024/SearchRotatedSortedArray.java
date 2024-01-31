package com.leetcode.exp.Leetcode_exp.on31stJan2024;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int targetIndex = search(nums, target);
        System.out.println(targetIndex);

    }
    public static int search(int[] nums, int target) {
        if ( nums == null || nums.length == 0 ) return -1;
        int left = 0;
        int right = nums.length -1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) /2 ;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        int start = left;
        left = 0;
        right = nums.length -1;
        if (target >= nums[start] && target <= nums[right]) {
            left = start;
        }else {
            right = start;
        }
        while (left <= right) {
            mid = left + (right - left) /2 ;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] > target) {
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }

        return -1;
        
    }
    
}
