package com.leetcode.exp.Leetcode_exp.on8thFeb2024;

import java.util.Stack;

/**
 * https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/
 */
public class MininumRemoveToMakeValid {
    public static void main(String[] args) {
        String s = "))((";
        System.out.println(minRemoveToMakeValid(s));
    }
    public static String minRemoveToMakeValid(String s) {
        if (s.length() < 1) return s;
        int open = 0;
        StringBuilder ss = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            }
            if (c == ')') {
                if (open ==0) continue;
                open --;
            }
            ss.append(c);
            
        }
        //System.out.println(" open = " + open + " close =" + close);
        StringBuilder sb = new StringBuilder();
        int n = ss.length()-1;
        for (int i= n; i>=0;i--) {
            if (open > 0 && ss.charAt(i) == '(') {
                open --; continue; 
            }
            sb.append(ss.charAt(i));
        }
        return sb.reverse().toString();
    }
    
}
