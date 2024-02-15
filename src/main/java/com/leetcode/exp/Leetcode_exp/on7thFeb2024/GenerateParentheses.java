package com.leetcode.exp.Leetcode_exp.on7thFeb2024;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(generateParenthesis(n));
    }
     public static List<String> generateParenthesis(int n) {
        //backtracking
        List<String> list = new ArrayList<>();
        backTrack(list, "",0,0,n);
        return list;
    }
    public static void backTrack(List<String> list, String current,int open, int close, int n) {
        if (current.length() == 2*n) {
            list.add(current);
            return;
        }
        System.out.println("##### " + current);
        if (open < n) backTrack(list, current+ "(", open+1, close, n);
        if (close < open) backTrack(list, current+ ")", open, close+1, n);
        
    }
}
