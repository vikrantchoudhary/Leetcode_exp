package com.leetcode.exp.Leetcode_exp.on30thJan2024;

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        String s = "BBBABBA";
        int k = 1;
        int output = characterReplacement(s, k);
        System.out.println(output);
    }
    public static int characterReplacement(String s, int k) {
        int N = s.length();
        int max_count = 0;
        int start = 0;
        int[] charCount = new int[26];
        int max_char_count = 0;
        for (int end = 0 ; end < N ; end++) {
            charCount[s.charAt(end) - 'A']++;
            max_char_count = Math.max(max_char_count,charCount[s.charAt(end) - 'A']);
            while ((end - start - max_char_count +1) > k) {
                charCount[s.charAt(start) - 'A'] --;
                start++;
            }
            max_count = Math.max(max_count,end - start +1);
        }
        return max_count;
    }
    
}
