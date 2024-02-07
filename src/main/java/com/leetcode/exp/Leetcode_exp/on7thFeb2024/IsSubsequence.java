package com.leetcode.exp.Leetcode_exp.on7thFeb2024;
/*
 * https://leetcode.com/problems/is-subsequence/description/
 */
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "b", t = "ahbgdc";
        if (isSubsequence(s, t)) {
            System.out.println("subsequence");
        }else {
            System.out.println("not subsequence");
        }
    }
    public static boolean  isSubsequence(String s, String t) {
        if (s.equals("") || s.length() < 1) return true;
        if (s.length() > t.length()) return false;
        int k = 0;
        for (int i = 0; i<t.length();i++) {
            if (s.charAt(k) == t.charAt(i)) {
                k++;
            }
            if (k == s.length()) return true;
        }
        return false;
    }
    
}
