package com.leetcode.exp.Leetcode_exp.on17Jan2024;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/odd-even-jump/description/
 */
public class OddEvenJump {
    public static void main(String[] args) {
        int input[] = {10,13,12,14,15};
        System.out.println("Even odd jump : Number good starting indexes are  " + oddEvenJumps(input));
    }

    public static int oddEvenJumps(int[] arr) {
        int good_index_count = 1;
        int n = arr.length;
        boolean[] higer = new boolean[n];
        boolean[] lower = new boolean[n];
        //default last index is always good as it ends
        higer[n-1] = true;
        lower[n-1] = true;
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(arr[n-1], n-1);
        // starting in reverse order dynamically
        for (int i= n-2; i >=0;i--) {
            Map.Entry higer_key_pair = treeMap.ceilingEntry(arr[i]);
            Map.Entry lower_key_pair = treeMap.floorEntry(arr[i]);
            if (higer_key_pair != null) {
                higer[i] = lower[(int) higer_key_pair.getValue()];
            }
            if (lower_key_pair != null) {
                lower[i] = higer[(int) lower_key_pair.getValue()];
            }
            if (higer[i]) {
                good_index_count++;
            }
            treeMap.put(arr[i],i);
        }
        return good_index_count;
    }
    
}
