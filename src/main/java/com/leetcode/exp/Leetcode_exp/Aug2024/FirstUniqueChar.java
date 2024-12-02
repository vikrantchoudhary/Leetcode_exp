package com.leetcode.exp.Leetcode_exp.Aug2024;

import java.util.HashMap;


public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "dddccdbba";
        System.out.println("Postion : " + firstUniqChar(s));

    }
    public static int firstUniqChar(String s) {
        int char_arr[] = new int[26];
        for (char c : s.toCharArray()) {
            char_arr[c - 'a']++;
        }
        for ( int i = 0 ; i < s.length();i++) {
            if (char_arr[s.charAt(i) - 'a'] == 1) return i; 
        }
        return -1;
    }
    public static int firstUniqChar_1(String s) {
        int pos = -1;
        HashMap <Character,Integer> map = new HashMap<>();
        char ch = 0;
        char pre = 0;
        for (int i = s.length() -1 ; i >= 0;i--) {
            char c= s.charAt(i);
            
            if (map.containsKey(s.charAt(i))) {
                if (ch == s.charAt(i)) ch=0;
            }else {
                map.put(c, 0);
                if (pre == 0) pre = ch;
                ch = s.charAt(i);
                pos = i;
            }
        }
        if (ch == 0) pos = -1;
       
        System.out.println(map);
        return pos;
    }
    
}
