package com.leetcode.exp.Leetcode_exp.on12thJan2024;
import java.util.Arrays;
/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/description/
 */

public class SortByParity2 {
    public static void main(String[] args) {
        int [] input = {4,2,5,7};
        int [] output = sortArrayByParityII(input);
        System.out.println("");
        for (int x : output) {
            System.out.print(" " + x);
        }

    }
    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        //int result[] = new int[n];
        //Arrays.sort(nums);
        int i = 0, j=1;
        int temp;
        while (i < n && j < n) {
            while (i < n && nums[i] %2 == 0) i = i+2;
            while (j< n && nums[j] %2 != 0  ) j = j+2 ;
            if ( i< n && j < n) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } 
        }
         for (int x : nums) {
            System.out.print(" " + x);
        }
        return nums;
    }
    
}
