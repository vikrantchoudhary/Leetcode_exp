package com.leetcode.exp.Leetcode_exp.on29thJan2024;

import java.util.HashMap;
import java.util.Stack;
public class BracketsValidator {

     public static void main(String[] args) {
       // String input = "({[](){}})";
        String input = "({[](})[])";
       // String input= "()()(){}{}";
        if (IsBracketValidWithStack(input)) {
            System.out.println(" valid " );
        }else {
            System.out.println("Not valid expression");
        }
        
     }
     public static boolean IsBracketValid(String expr) {
        HashMap <Character,Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('{', '}');
        hashMap.put('[', ']');
        System.out.println(expr.charAt(expr.length() -1 ));
        Stack<Character> stack = new Stack<>();
        if(!hashMap.containsKey(expr.charAt(0)) 
        || hashMap.containsKey(expr.charAt(expr.length() - 1))) 
        return false;
        for (char c : expr.toCharArray()) {
            if (hashMap.containsKey(c)) {
                stack.push(c);
            }else if (!stack.isEmpty()){
                char ch = stack.pop();
                if (c != hashMap.get(ch)) {
                    return false;
                }
            }else {
                return false;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
    public static boolean IsBracketValidWithStack(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char c:expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else {
                char n = stack.pop();
                if (c == ')' && n != '(') return false; 
                if (c == '}' && n != '{') return false; 
                if (c == '[' && n != ']') return false;
            }

        }
        return true;
    }

}