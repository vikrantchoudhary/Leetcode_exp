package com.leetcode.exp.Leetcode_exp.on1stFeb2024;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        if (wordPattern(pattern, s)) {
            System.out.println("Pattern found");
        } else {
            System.out.println("false with given pattern");
        }
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        HashMap<Character,String> hashMap = new HashMap<>();
        for (int i=0 ; i < pattern.length();i++) {
            if (hashMap.containsKey(pattern.charAt(i))) {
                String st = hashMap.get(pattern.charAt(i));
                if (!st.equals(words[i])) {
                    return false;
                }
            }else {
                if (hashMap.containsValue(words[i])) return false;
                hashMap.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
        
    }
    
}
