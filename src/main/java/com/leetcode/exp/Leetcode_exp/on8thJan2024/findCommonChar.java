package com.leetcode.exp.Leetcode_exp.on8thJan2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
/**
 * https://leetcode.com/problems/find-common-characters/
 */
public class findCommonChar {
    public static void main(String[] args) {
        String [] inpuStrings = {"bella","label","roller"};
        System.out.println(commonChars(inpuStrings));
        
    }
    public static List<String> commonChars(String[] words) {
        int n = words.length;
        List<String> common_chars = new ArrayList<>();
        int[] letters = new int[26];
        Arrays.fill(letters, Integer.MAX_VALUE);
        for (String s : words) {
            char[] sChar = s.toCharArray();
            int [] char_feq = new int[26];
            for (char c : sChar) {
                char_feq[c - 'a']++;
            }
            for (int i = 0; i< 26;i++) {
                letters[i] = Math.min(letters[i],char_feq[i]);
            }
        }
        for (int i =0; i< 26 ; i++) {
            while (letters[i] >0 ) {
                common_chars.add(""+(char)(i + 'a'));
                letters[i] --;
             }
        }
        return common_chars;
    }
    
}
