package com.leetcode.exp.Leetcode_exp.on29thJan2024;
/*
 * https://leetcode.com/problems/sort-colors/description
 */
public class SortColors {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void sortColors(int[] nums) {
        if (nums.length <2) return;
        int start = 0, end = nums.length -1, cur =0;
        while (cur <= end && start < end){
            if (nums[cur] == 0) {
                nums[cur] = nums[start];
                nums[start] = 0;
                start ++;
                cur++;
            } else if (nums[cur] == 2) {
                nums[cur] = nums[end];
                nums[end] =2;
                end --;

            }else {
                cur ++;
            }
        }
    }
    
}
