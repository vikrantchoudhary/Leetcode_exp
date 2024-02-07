package com.leetcode.exp.Leetcode_exp.on7thFeb2024;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() <1) return "";
        int start =0, end = 0;
        for (int i =0 ; i< s.length() ; i++) {
            int len1 = expandFromCenter(s, i, i);
            int len2 = expandFromCenter(s, i, i+1);
            int max = Math.max(len1, len2);
            if (max > end - start) {
                start = i - ((max -1)/2);
                end = i + max/2;
            }
            System.out.println("### " + s.substring(start, end+1));
        }
        return s.substring(start, end+1);
    }
    public static int expandFromCenter(String s , int start, int end) {
        if (s == null || s.length() <1) return 0;
        while (start >= 0 &&  end < s.length() && start <= end 
        && s.charAt(start) == s.charAt(end)) {
            start --;
            end ++;
        }

        return end - start -1;
    }
    
}
