package com.leetcode.Interview;

public class PivotIndex {
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        int sum = 0;
        for (int i = 0 ; i < nums.length;i++) {
            if (sum + nums[i] == total/2) {
                System.out.println(i);
                break;
            }
            sum = sum+ nums[i];
        }
        
    }
    
}
