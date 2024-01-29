package com.leetcode.exp.Leetcode_exp.on26thJan2024;

public class ShortedDistanceToCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int [] result = shortestToChar(s, c);
        for (int r : result) {
            System.out.print(r + " ");
        }

    }
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int [] result = new int[n];
        int pos = -n;
       for (int i = 0; i< n; i++){
            if (s.charAt(i) == c) {
                pos = i;
            }
            result[i] = i - pos;
        }
        for (int i = n -1 ; i >= 0; i--) {
            if (s.charAt(i) == c){
                pos = i;
            }
            result[i] = Math.min(result[i],Math.abs(i - pos));
         }
        return result;
    }
    
}
