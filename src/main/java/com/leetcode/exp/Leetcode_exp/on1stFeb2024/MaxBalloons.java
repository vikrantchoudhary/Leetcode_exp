package com.leetcode.exp.Leetcode_exp.on1stFeb2024;
/*
 * https://leetcode.com/problems/maximum-number-of-balloons/description/
 */
public class MaxBalloons {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println("Total balloon formed with given text is " + maxNumberOfBalloons(text));

    }
    public static int maxNumberOfBalloons(String text) {
        
        int[] letters = new int[26];
        for (char t : text.toCharArray()) {
            letters[t - 'a'] ++;
        }
        
        int min = letters['b'-'a'];
        min = Math.min(min,letters['a'-'a']);
        min = Math.min(min,letters['l'-'a']/2);
        min = Math.min(min,letters['o'-'a']/2);
        min = Math.min(min,letters['n'-'a']);
        return min;

    }
}
