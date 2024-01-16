package com.leetcode.exp.Leetcode_exp.on16Jan2024;

import java.util.Stack;
/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
 */
public class RemoveAllAdjString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(s + " after removing adjacent characters " + removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        StringBuilder  result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char d = stack.peek();
                if (c == d) { 
                    stack.pop();
                }else {
                    stack.add(c);
                }
            }else {
                stack.add(c);
            }
            
        }
        while (!stack.isEmpty()) result.append(""+stack.pop());
        return result.reverse().toString();
    }
    
}
