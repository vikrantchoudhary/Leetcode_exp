package com.leetcode.exp.Leetcode_exp.on17Jan2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> threeList = threeSum(nums);
        for (List<Integer> list : threeList) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
     public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) return null;
        Arrays.sort(nums);
        int a_pointer ,b_pointer,sum;
        for (int i=0; i < nums.length -2; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            a_pointer = i+1;
            b_pointer = nums.length -1;
            while (a_pointer < b_pointer) {
                sum = nums[i] + nums[a_pointer] + nums[b_pointer];
                //System.out.println(" " + nums[i] + " " + nums[a_pointer] + " " + nums[b_pointer]);
                if (sum > 0) {
                    b_pointer --;
                }else if ( sum < 0) {
                    a_pointer++;
                }else {
                    result.add(Arrays.asList(nums[i],nums[a_pointer],nums[b_pointer]));
                    while(a_pointer < b_pointer && nums[a_pointer] == nums[a_pointer + 1]) a_pointer++;
                    while(a_pointer < b_pointer && nums[b_pointer] == nums[b_pointer - 1]) b_pointer--;
                    a_pointer++;
                    b_pointer--;
                }

            }
        }
        return result;
     }
    
}
