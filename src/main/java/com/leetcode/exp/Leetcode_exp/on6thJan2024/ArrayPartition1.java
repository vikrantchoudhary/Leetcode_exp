package com.leetcode.exp.Leetcode_exp.on6thJan2024;
import java.util.Arrays;
public class ArrayPartition1 {
    public static void main(String[] args) {
        int[] input = {1,4,3,2};
        System.out.println("pair sum : " + arrayPairSum(input));
    }
    public static int arrayPairSum(int [] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i =0 ; i < nums.length ; i+= 2){
            sum += nums[i];
        }
        return sum;
    }
    
}
