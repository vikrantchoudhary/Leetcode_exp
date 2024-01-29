package com.leetcode.exp.Leetcode_exp.on26thJan2024;
/**
 * https://leetcode.com/problems/buddy-strings/
 */
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
public class BuddyString {
    public static void main(String[] args) {
        String s = "aa";
        String goal = "aa";
        if (buddyStrings(s, goal)) {
            System.out.println("buddy string");
        } else {
            System.out.println("Not buddy string");
        }
        
    }
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        List<Integer> diff = new ArrayList();
        for (int i=0 ;i <s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }
        if (diff.size() == 2 && 
        (s.charAt(diff.get(0)) == goal.charAt(diff.get(1))) &&
        (s.charAt(diff.get(1)) == goal.charAt(diff.get(0))))  {
            return true;
        }
        if (s.equals(goal)) {
            HashSet<Character> hashset = new HashSet<>();
            for (char c: s.toCharArray()) {
                hashset.add(c);
            }
            if (hashset.size() < s.length()) return true;
        }
        return false;
        };
    }
    

