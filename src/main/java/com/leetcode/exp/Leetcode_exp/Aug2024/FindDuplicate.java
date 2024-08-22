package com.leetcode.exp.Leetcode_exp.Aug2024;

import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,7,6,3,3,4,3,2,4,2};
        if (containsDuplicate(nums)) {
            System.out.println("duplicate found");
        }else {
            System.out.println("No duplicate");
        }

    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap num_hash = new HashMap();
        for (int n : nums) {
            if (num_hash.containsKey(n)) return true;
            num_hash.put(n,1);
        }
        return false;
    }
    
}
