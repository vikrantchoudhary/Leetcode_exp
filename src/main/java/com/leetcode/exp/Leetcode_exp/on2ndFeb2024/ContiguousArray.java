package com.leetcode.exp.Leetcode_exp.on2ndFeb2024;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        int [] nums = {0,1,0,1,1,1,0,1,1};
        System.out.println(findMaxLength(nums));

    }
    public static int findMaxLength(int[] nums) {
        int max_length = 0;
        HashMap<Integer,Integer> counterMap = new HashMap<>();
        int count=0;
        for (int i = 0; i < nums.length;i++) {
            if (nums[i] == 1) {
                count +=1;
            }else {
                count -=1;
            }
            if (counterMap.containsKey(count)) {
                max_length = Math.max(max_length, i - counterMap.get(count));
            }else {
                counterMap.put(count,i);
            }
        }
        return max_length;
    }   
    
}
