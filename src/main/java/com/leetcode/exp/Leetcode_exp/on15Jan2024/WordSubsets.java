package com.leetcode.exp.Leetcode_exp.on15Jan2024;
import java.util.List;
import java.util.ArrayList;
/**
 * https://leetcode.com/problems/word-subsets/description/
 */
public class WordSubsets {
    public static void main(String[] args) {
        String [] word1 = {"amazon","apple","facebook","google","leetcode"};
        String[] word2 = {"l","e"};
        List<String> result = wordSubsets(word1, word2);
        for (String res : result) {
            System.out.println(res);
        }

     }
     public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] letter_max_count = new int[26];
        int [] current_word = new int[26];
        for (int i=0 ; i < words2.length ; i++) {
            current_word = countCharacters(words2[i]);
            for (int j=0; j < 26; j++) {
                letter_max_count[j] = Math.max(letter_max_count[j], current_word[j]);
            }
        }
        
        
        for (int i = 0 ; i < words1.length ; i++) {
            current_word = countCharacters(words1[i]);
            /*System.out.println();
            for (int l: current_word) {
                System.out.print(l);
            }*/
            Boolean valid = true;
            for (int j=0 ; j< 26; j++) {
                if ( letter_max_count[j] > current_word[j] ) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                result.add(words1[i]);
            }
            
        }
        return result;
     }
     public static int [] countCharacters(String s) {
        int charCount[] = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a'] ++;
        }
        return charCount;

     }
}
