package com.leetcode.exp.Leetcode_exp.Aug2024;

public class ExcelNumber {
    public static void main(String[] args) {
        String columnTitle = "FXSHRXW";
        System.out.println(titleToNumber(columnTitle));
    }
    public static int titleToNumber(String columnTitle) {
       
        int value = 0;
        for (int i = 0; i< columnTitle.length();i++) {
            value = 26 * value + columnTitle.charAt(i) - 'A' + 1;
        }
        return value ;
    }
    
}
