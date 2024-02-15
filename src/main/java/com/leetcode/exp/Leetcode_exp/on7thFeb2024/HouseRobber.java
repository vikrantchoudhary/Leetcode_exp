package com.leetcode.exp.Leetcode_exp.on7thFeb2024;
/**
 * https://leetcode.com/problems/house-robber/description/
 */
public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
        
    }
    //dynamic programming
    public static int rob(int[] nums) {
        if (nums.length < 1) return 0;
        int robAmount[] = new int[nums.length + 1];
        robAmount[0] = 0;
        robAmount[1] = nums[0];
        for (int i= 1; i<nums.length;i++) {
            robAmount[i+1] = Math.max(robAmount[i],robAmount[i-1] + nums[i]);
        }


        return robAmount[nums.length];
        
    }
    
}
