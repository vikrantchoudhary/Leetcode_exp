package com.leetcode.exp.Leetcode_exp.Aug2024;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,3,1,5,7,11,15};
        int result[] = twoSum(nums,9);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int firstEle = 0;
        int secondnUm = 0;
        HashMap num_hash = new HashMap();
        for (int i =0 ; i<nums.length ; i++) {
            firstEle = nums[i];
            secondnUm = target - nums[i];
            if (num_hash.containsKey(secondnUm)) return new int []{i,(int) num_hash.get(secondnUm)};
            num_hash.put(firstEle, i);

        }
        

        return new int[] {};
    }
    
}
