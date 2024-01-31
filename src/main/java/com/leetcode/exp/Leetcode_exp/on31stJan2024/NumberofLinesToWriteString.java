package com.leetcode.exp.Leetcode_exp.on31stJan2024;
/*
 * https://leetcode.com/problems/number-of-lines-to-write-string/description/
 */
public class NumberofLinesToWriteString {
    public static void main(String[] args) {
        int [] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] result = numberOfLines(widths, s);
        System.out.println("[ " + result[0] + " ," + result[1] + " ]");

    }
    public static int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int width_size = 0;
        for (char c: s.toCharArray()) {
            int char_width = widths[c - 'a'];
            if (char_width + width_size > 100) {
                System.out.println( char_width);
                width_size = 0;
                lines ++;
            }
            width_size += char_width;
            
        }
        return new int[] {lines,width_size};
        
    }
    
}
