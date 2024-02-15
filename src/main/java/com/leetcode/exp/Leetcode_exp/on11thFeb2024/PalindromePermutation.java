package com.leetcode.exp.Leetcode_exp.on11thFeb2024;

public class PalindromePermutation {
    public static void main(String[] args) {    
        String s = "code";
        String s2 = "carerac";
        if (canPermutePallindrome(s2)) {
            System.out.println("YES");
        }else {
            System.out.println("No");
        }
        
    }
    public static boolean canPermutePallindrome(String s) {
        int  ch_count[] = new int[26]; 
        for (char c : s.toCharArray()) {
            ch_count[c-'a']++;
            if (ch_count[c-'a']%2 == 0) ch_count[c - 'a'] = 0;
        }
        return false;
    }
    
}
