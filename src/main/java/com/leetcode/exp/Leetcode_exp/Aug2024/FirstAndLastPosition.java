package com.leetcode.exp.Leetcode_exp.Aug2024;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int nums[] = {5,7,7,7,7,7,7,8,8,8,8,10};
        int target = 8;
        int result [] = searchRange(nums, target);
        System.out.println(result[0] + " " + result[1]);


    }
    public static int[] searchRange(int[] nums, int target) {
        int result[] = {-1,-1};
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (nums[mid] < target) {
                start = mid +1;
            }else if (nums[mid] > target) {
                end = mid -1;
            }else {
                return new int []{first(nums,mid,target), last(nums,mid,target)};
            }
        }
        return result;
    }
    public static int first(int[] nums,int index, int target) {

        while (nums[index] == target) {
            index --; 
        }
        return index + 1;

    }
    public static int last(int[] nums,int index, int target) {
        while (nums[index] == target) {
             index ++;
            }
        return index -1;
    }
    
}
