package com.leetcode.exp.Leetcode_exp.Aug2024;

public class TwoSumII {
    public static void main(String[] args) {
        int nums[] = {2,3,4,6,7,11,15};
        int result[] = twoSum(nums,9);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int [] result = {-1,-1};
        int start = 0;
        int end = numbers.length -1;
        int cur_sum  =0;
        int mid ;
        while (start <= end) {
            cur_sum = numbers[start] + numbers[end];
            
            if (cur_sum > target) {
                end --;
            }else if (cur_sum < target) {
                start ++;
            }else {
                return new int [] {start,end};
            }
        }

        return result;
    }
    
}
