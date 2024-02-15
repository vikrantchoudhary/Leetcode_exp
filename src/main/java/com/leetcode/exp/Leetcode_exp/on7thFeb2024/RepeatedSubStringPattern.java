package com.leetcode.exp.Leetcode_exp.on7thFeb2024;
/*
 * https://leetcode.com/problems/repeated-substring-pattern/description/
 */
public class RepeatedSubStringPattern {
    public static void main(String[] args) {
        String s = "abcabcabcabcabc";
        if (repeatedSubstringPattern(s)) {
            System.out.println("repeated substring found");
        }else {
            System.out.println("No");
        }

    }
    public static boolean repeatedSubstringPattern(String s) {
        if (s.length() < 1) return true;
        int n = s.length();
        for (int i = n -1 ; i>=1 ; i--) {
            if (n % i ==0) {
                String startString = s.substring(0, i);
                int n_times = n /i;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j<n_times;j++) {
                    sb.append(startString);
                }
                if (sb.toString().equals(s) ) return true;
            }
        }
        return false;

    }
    
}
