package com.leetcode.exp.Leetcode_exp.on30thJan2024;

public class FirstAndLastPostionOfElements {
    public static void main(String[] args) {
        int nums[] = {2,2};
        int target = 2;
        int[] ans = searchRange(nums, target);
        for (int a : ans) {
            System.out.print( a + " ");
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) /2;
            if (nums[mid] == target) {
                return new int[] {first(nums,target,mid), last(nums,target,mid)};
            }else if (nums[mid] > target) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }

        return new int[] {-1,-1};
    }
    public static int first(int nums[], int target, int mid) {
        int start = 0;
        int ans = mid;
        int end = mid -1;
        while (start <= end) {
            mid = start + (end - start) /2;
            if (nums[mid] == target) {
                ans = mid;
                end = mid -1;
            }else if (nums[mid] > target) {
                end = mid -1;
            }else {
                start = mid+1;
            }
        }
        return ans;

    }
    public static int last (int nums[], int target,int mid) {
        int start = mid + 1;
        int ans = mid;
        int end = nums.length - 1;
        while (start <= end) {
            mid = start + (end - start) /2;
            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            }else if (nums[mid] > target) {
                end = mid -1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
    
}
