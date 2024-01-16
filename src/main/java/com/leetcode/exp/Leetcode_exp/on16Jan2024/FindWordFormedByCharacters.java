package com.leetcode.exp.Leetcode_exp.on16Jan2024;
import java.util.Arrays;
public class FindWordFormedByCharacters {
    public static void main(String[] args) {
        String []words = {"hello","world","leetcode"};
        String  chars = "welldonehoneyr";
        System.out.println( "good words count " + countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars){
        int good_word_count = 0;
        int char_count [] = new int[26];
        for (char c: chars.toCharArray()) {
            char_count[c-'a'] ++;
        }
       
        for (String word : words) {
            int found_length = 0;
            int temp_count [] = Arrays.copyOf(char_count, char_count.length);
            for (char w : word.toCharArray()) {
                if(temp_count[w - 'a'] >0) {
                    found_length++;
                    temp_count[w - 'a'] --;
                }
            }
            if (found_length == word.length()) {
                good_word_count += word.length();
            }
        }

        return good_word_count;
    }

    
}
