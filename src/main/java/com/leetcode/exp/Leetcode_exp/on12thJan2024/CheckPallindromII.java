package com.leetcode.exp.Leetcode_exp.on12thJan2024;
/**
 * https://leetcode.com/problems/valid-palindrome-ii
 */
public class CheckPallindromII {
    public static void main(String[] args) {
        String inpuString = "abbcca";
        if (validPalindrome(inpuString)) {
            System.out.println("String is pallindrome");
        }else {
            System.out.println("Not a pallindrome with one exception");
        }
    }

    public static boolean validPalindrome(String s) {
        int a = 0;
        int b = s.length() - 1;
        while (a < b ) {
            if (s.charAt(a) != s.charAt(b)) {
                return validPalindrome(s, a,b-1) || validPalindrome(s,a+1,b);
            }
            a = a+1;
            b = b-1;
        }
        return true;
    }
    public static boolean validPalindrome (String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i = i+1;
            j = j-1;
        }
        return true;
        
    }
    
}
