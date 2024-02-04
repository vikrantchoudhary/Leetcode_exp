package com.leetcode.exp.Leetcode_exp.on2ndFeb2024;

import java.util.HashMap;

public class DegreeOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
        System.out.println(findShortestSubArray(nums));
        
    }
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> degree_map = new HashMap<>();
        HashMap<Integer,Integer> window_size_first = new HashMap<>();
        int max_degree = 0;
        int degree_window = 0;
        for (int i =0 ; i<nums.length;i++) {
            window_size_first.putIfAbsent(nums[i], i);
            degree_map.put(nums[i], degree_map.getOrDefault(nums[i], 0)+1);
            if (max_degree < degree_map.get(nums[i])) {
                max_degree = degree_map.get(nums[i]);
                degree_window = i - window_size_first.get(nums[i])  + 1;
            }else if (degree_map.get(nums[i]) == max_degree) {
                degree_window = Math.min(degree_window,i - window_size_first.get(nums[i])  + 1);
            }
            
        }
        return degree_window;
    }
    
    
}
