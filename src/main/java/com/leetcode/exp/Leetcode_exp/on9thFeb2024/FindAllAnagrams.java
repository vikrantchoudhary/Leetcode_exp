package com.leetcode.exp.Leetcode_exp.on9thFeb2024;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class FindAllAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p)); 
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        System.out.println("  ### " + p);
        if (s == null || s.length() < 1 || s.length() < p.length()) return result;
        int []ch = new int [26];
        for (char c: p.toCharArray()){
            ch[c - 'a']++;
        }
        
        int left = 0 ;
         int right = 0;
         int count = p.length();

        /*while (right < s.length()) {
            if (ch[s.charAt(right) - 'a'] >=1) {
                plength --;
                ch[s.charAt(right) - 'a']--;
                right++;
            }
            if (plength == 0) {
                result.add(left);
                right++;
                plength = p.length();
                
            }
            if ((right - left ) == plength && ch[s.charAt(left) - 'a'] >= 0) {
                left++;
                ch[s.charAt(left) - 'a']++;
            }
            System.out.println("left " + left + " right = " + right);
        }*/
        while (right < s.length()) {
            if (ch[s.charAt(right++) - 'a']-- >= 1) {
                count --;
            }
            if (count == 0) result.add(left);
            if ((right - left) == p.length() && ch[s.charAt(left++) - 'a']++ >=0) {
               count++;
            }
        }
        return result;
    }
    
}
