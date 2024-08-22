package com.leetcode.exp.Leetcode_exp.HackerRank;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1 ; i < strs.length ; i++) {
            if (strs[i].indexOf(prefix) == 0 ) {
                //System.out.println(strs[i]);
            }else {
                //System.out.println(strs[i].indexOf(prefix));
                prefix = prefix.substring(0,prefix.length() -1);
                System.out.println(prefix);
                i=0;
            }   
        }
        return prefix;
    }
    
}
