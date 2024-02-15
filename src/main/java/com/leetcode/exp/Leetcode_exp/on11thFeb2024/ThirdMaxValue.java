package com.leetcode.exp.Leetcode_exp.on11thFeb2024;

public class ThirdMaxValue {
    public static void main(String[] args) {
        int nums[] = {3,2};
        System.out.println(thirdMax(nums));

    }
    public static int thirdMax(int[] nums) {if (nums.length < 1) return Integer.MIN_VALUE;
        // if (nums.length <=2) return nums[0] > nums[1] ? nums[0] : nums[1];
         Integer max = null;
         Integer secondMax = null;
         Integer result = null;
         for (Integer n: nums) {
             if (n.equals(max) || n.equals(secondMax) || n.equals(result)  ) continue;
             if (max == null || n > max) {
                 result = secondMax;
                 secondMax = max;
                 max = n;
             }
             else if (secondMax == null ||n > secondMax) {
                 result = secondMax;
                 secondMax = n;
             }else if (result == null || n > result) {
                 result = n;
             }
         }
         
         return result == null ? max : result;
     }
}