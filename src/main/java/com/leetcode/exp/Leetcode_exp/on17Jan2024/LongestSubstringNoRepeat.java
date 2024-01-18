package com.leetcode.exp.Leetcode_exp.on17Jan2024;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringNoRepeat {
    public static void main(String[] args) {
        //String s = "abcabcbb";
        String s2 = "aab";
        //System.out.println("String " + s + " contains longest substring without repeating is   " + lengthOfLongestSubstring(s));
        System.out.println("String " + s2 + " contains longest substring without repeating is   " + lengthOfLongestSubstring(s2));
    }
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int current_index = 0;
        int max = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (current_index < s.length()) {
            if (!hashSet.contains(s.charAt(current_index))) {
                hashSet.add(s.charAt(current_index));
                max = Math.max(hashSet.size(), max);
                current_index++;
            }else {
                hashSet.remove(s.charAt(start));
                start++;
            }
            
        }
        return max;
    }
    
}
