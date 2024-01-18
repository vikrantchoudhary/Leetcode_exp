package com.leetcode.exp.Leetcode_exp.on17Jan2024;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/description/
 */
public class SubArraySumEqualsK {
    
    public static void main(String[] args) {
        int [] input = {1,2,3};
        int k =3;
        System.out.println("total subarrays which sum to k are " + subarraySum(input, k));
    }
    public static int subarraySum(int[] nums, int k) {
        int subarray_count = 0;
        int total = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1); // default value
        for (int i =0; i < nums.length ; i++) {
            total += nums[i];

            if (hashMap.containsKey(total - k)) {
                subarray_count += hashMap.get(total -k);
            }

            hashMap.put(total,hashMap.getOrDefault(total, 0) + 1);
        }

        return subarray_count;
    }
}
