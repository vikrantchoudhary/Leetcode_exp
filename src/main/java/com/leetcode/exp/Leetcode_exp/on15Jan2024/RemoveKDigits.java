package com.leetcode.exp.Leetcode_exp.on15Jan2024;

import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-k-digits/
 */
public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println("String after removing k digits" + removeKdigits(num, k));

    }
    public static String removeKdigits(String num, int k) {
        int n = num.length();
        if ( k == n) return "0";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack();
        int i =0;
        while (i < n) {
            if (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
       
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
           
        }

        return sb.toString();
    }
    
}
