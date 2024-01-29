package com.leetcode.exp.Leetcode_exp.on29thJan2024;

import java.util.HashSet;

public class GoatLatin {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        System.out.println( toGoatLatin2(sentence));
    }
    public static String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        int count = 0; //start 
        for (String word : words) {
            if (word.startsWith("a") || word.startsWith("e")
             || word.startsWith("i") || word.startsWith("o") || 
             word.startsWith("u") || word.startsWith("A") || word.startsWith("E")
             || word.startsWith("I") || word.startsWith("O") || 
             word.startsWith("U")) {
                sb.append(word);
                sb.append("ma");
             }else {
                char ch = word.charAt(0);
                word = word.substring(1);
                sb.append(word);
                sb.append(ch);
                sb.append("ma");
             }
             
             int j = count;
             while (j >= 0) {
                sb.append("a");
                j--;
             }
             count++;
             sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static String toGoatLatin2(String sentence) {
        HashSet<Character> hashSet = new HashSet();
        for (char c: "aeiouAEIOU".toCharArray()){
            hashSet.add(c);
        }
        String[] words = sentence.split("\\s");
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (String word: words) {
            char ch = word.charAt(0);
            if (hashSet.contains(ch)) {
                sb.append(word);
                sb.append("ma");
            }else {
                sb.append(word.substring(1));
                sb.append(ch);
                sb.append("ma");
            }
            int j =count;
            while (j >= 0) {
                sb.append("a");
                j--;
            }
            sb.append(" ");
            count++;

        }
        return sb.toString().trim();
    }
    
}
