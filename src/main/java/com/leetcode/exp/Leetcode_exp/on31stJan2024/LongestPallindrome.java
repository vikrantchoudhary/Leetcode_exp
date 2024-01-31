package com.leetcode.exp.Leetcode_exp.on31stJan2024;
/*
 * https://leetcode.com/problems/longest-palindrome/description/
 */
public class LongestPallindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println("longest pallindrome constructed of size = " +longestPalindrome(s) );
    }
    public static int longestPalindrome(String s) {
        int result = 0;
        int []chars_feq = new int[128];
        for (char c : s.toCharArray()) {
            chars_feq[c]++;
        }
        for (int n : chars_feq) {
            result += n /2 *2;
            if (result %2 == 0 && n%2 == 1) {
                result +=1;
            }
        }
        return result;
    }
    
}
