package com.leetcode.exp.Leetcode_exp.on20thJan2024;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int [] nums= {5,4,3,2,1};
        nums = nextGreaterElements(nums);
        for (int i : nums ) {
            System.out.println(i);
        }

    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        for (int i = 0 ; i < nums.length; i++) {
            result[i] = nextGreater(nums, i);
        }
        return result;
    }
    public static int nextGreater(int[] nums , int pos) {
        int n = nums.length;
        for (int i = pos + 1; i < 2 * n -1 ; i++) {
            if (nums[pos] < nums[i%n]) return nums[i%n];
        }
        return -1;
    }
    
}
