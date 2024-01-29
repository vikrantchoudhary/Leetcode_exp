package com.leetcode.exp.Leetcode_exp.on20thJan2024;

import java.util.HashMap;
import java.util.HashSet;

public class CommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."; 
        String [] banned = {"hit"};
        System.out.println("Most common word : " + mostCommonWord(paragraph,banned));   
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> banned_word = new HashSet<>();
        HashMap<String, Integer> common_word_count = new HashMap<>();
        for (String ban : banned) {
            banned_word.add(ban);
        }
        String[] stringArray = paragraph.toLowerCase().split("\\W+");
        for (String st : stringArray) {
            if (banned_word.contains(st)) continue;
            common_word_count.put(st, common_word_count.getOrDefault(st, 0) + 1);
        }
        int feq = 0;
        String ans ="";
       for (String s : common_word_count.keySet()) {
        if (common_word_count.get(s) > feq ) {
            feq = common_word_count.get(s);
            ans = s;
        }
        
       }
       return ans;
    }
    
}
