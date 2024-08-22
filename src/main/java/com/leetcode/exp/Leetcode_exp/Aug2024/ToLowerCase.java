package com.leetcode.exp.Leetcode_exp.Aug2024;

public class ToLowerCase {
    public static void main(String args[]) {
        String str = "This is a Test Case for IVSWSD ";
        System.out.println(toLowerCaseString(str));
    }

    private static String toLowerCaseString(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                c += 32;
            }
            result +=c;
        }
        return result;
    }
    
}
