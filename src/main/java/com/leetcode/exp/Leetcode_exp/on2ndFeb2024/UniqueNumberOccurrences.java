package com.leetcode.exp.Leetcode_exp.on2ndFeb2024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 
 */
public class UniqueNumberOccurrences {
    public static void main(String[] args) {
        int []arr = {1,2,2,1,1,3};
        if (uniqueOccurrences(arr)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> num_occur_map = new HashMap<>();
        for (int i = 0 ; i<arr.length;i++) {
            num_occur_map.put(arr[i],num_occur_map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> hashset = new HashSet(num_occur_map.values());
        System.out.println(num_occur_map);
        System.out.println(hashset);
        return (hashset.size() == num_occur_map.size());
    }
    
}
