package com.leetcode.exp.Leetcode_exp.on1stFeb2024;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        String prefix = longestCommonPrefix(str);
        System.out.println(prefix);
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return null;
        String prefix = strs[0];
        for (String s : strs) {
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        } 

        return prefix;
    }
    
}
