package com.leetcode.exp.Leetcode_exp.on20thJan2024;

import java.util.HashMap;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int nums1[] = {4,1,2}, nums2 [] = {1,3,4,2};
        int [] result = nextGreaterElement(nums1, nums2);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<nums2.length;i++) {
            hashMap.put(nums2[i], nextGreater(nums2,i));
        }
        for (int i =0 ; i < nums1.length ; i++) {
            nums1[i] = hashMap.get(nums1[i]);
        }
        return nums1;
    }
    public static int nextGreater(int[] nums , int pos) {
        for (int i = pos + 1; i < nums.length; i++) {
            if (nums[pos] < nums[i]) return nums[i];
        }
        return -1;
    }
    
}
