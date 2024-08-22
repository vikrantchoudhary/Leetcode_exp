package com.leetcode.exp.Leetcode_exp.Aug2024;

public class IsPallindorm {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (isPalindrome(s)){
            System.out.println("TRUE");
        }else {
            System.out.println("False");
        }
    }

    public static boolean isPalindrome(String s) {
        
        if (s.length() <= 1) return true;
        s = s.toLowerCase().replaceAll("\\s","");
        int start = 0;
        int end = s.length() -1;
        while (start <= end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) start++;
            if (!Character.isLetterOrDigit(s.charAt(end)))  end--;
            if (s.charAt(start) != s.charAt(end)) return false;
            start ++;
            end --;
        }
        return true;
    }
    
}
