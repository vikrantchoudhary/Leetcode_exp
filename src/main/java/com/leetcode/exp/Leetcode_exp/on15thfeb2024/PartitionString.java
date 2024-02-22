package com.leetcode.exp.Leetcode_exp.on15thfeb2024;
/*
 * https://leetcode.com/problems/partition-labels/description/
 */
import java.util.List;
import java.util.ArrayList;
public class PartitionString {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> result = partitionLabels(s);
        for (Integer r : result) {
            System.out.println(r);
        }
    }
    public static List<Integer> partitionLabels(String s) {
        if (s == null || s.length() < 1) return null;
        List<Integer> output_arr = new ArrayList();
        int end_index[] = new int[26];
        for (int i =0; i< s.length() ; i++) {
            end_index[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end =0;
        for (int i = 0; i<s.length();i++) {
            end = Math.max(end_index[s.charAt(i) - 'a'], end);
            if ( i == end) {
                output_arr.add(end - start +1);
                start = end + 1;
                
            }
        }

        return output_arr;
    }
}
