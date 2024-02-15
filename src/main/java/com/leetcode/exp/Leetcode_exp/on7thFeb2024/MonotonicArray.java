package com.leetcode.exp.Leetcode_exp.on7thFeb2024;

public class MonotonicArray {
    public static void main(String[] args) {
        int nums[] = {1,2,2,3};
        if (isMonotonic(nums)) {
            System.out.println(" Monotonic");
        }else {
            System.out.println("Not monotonic");
        }
    }

    public static boolean isMonotonic(int[] nums) {
        int asc =0, desc = 0;
        int n = nums.length -1;
        
        for (int i = 1 ; i < nums.length;i++) {
            if (nums[i] >= nums[i-1] ) {
                asc++;
            }
            if (nums[i] <= nums[i-1]) {
                desc++;
            } 
        }
       
        return (asc == n || desc == n);
    }
    
}
