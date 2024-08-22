package com.leetcode.exp.Leetcode_exp.Aug2024;

public class ReverseString {
    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        if (s.length <1) System.out.println(s);
        int start = 0;
        int end = s.length -1;
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end --;
        } 
        System.out.println(s);
    }
    
}
