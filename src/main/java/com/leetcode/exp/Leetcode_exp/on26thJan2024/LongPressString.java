package com.leetcode.exp.Leetcode_exp.on26thJan2024;

public class LongPressString {
    public static void main(String[] args) {
        String name = "aleex";
        String typed = "aleexxxxxxx";
        if (isLongPressedName2(name, typed)) {
            System.out.println(" a long pressed Name");
        }else {
            System.out.println("Not a pressed string, they are different");
        }
    }
    public static boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) return true;
        //char [] nameArr = name.toCharArray();
        int namei=0;
        int typedi = 0 ;
        char prev = name.charAt(0), nameChar =name.charAt(0),typedChar;
        while (namei < name.length() && typedi < typed.length()) {
            nameChar = name.charAt(namei);
            typedChar = typed.charAt(typedi);
            if ( nameChar == typedChar) {
                namei++;
                typedi++;
                prev = nameChar;
            }else if (typedChar == prev) {
                typedi++;
               }
            else  return false;
        }
        
        while (typedi < typed.length()) {
            typedChar = typed.charAt(typedi);
            if (typedChar != nameChar) {
                return false;
            }
            typedi++;

        }
        return namei == name.length() &&  typedi == typed.length();
    }
    public static boolean isLongPressedName2(String name, String typed) {
        int n = name.length();
        int m = typed.length();
        if (n > m ) return false;
        int i =0, j =0;
        while ( j < m) {
            if (i < n && name.charAt(i) == typed.charAt(j)) {
                i++;
            }
            else if (j == 0 || typed.charAt(j) != typed.charAt(j-1)) return false;
            j++;
        }
        return i == n;
    }

}
