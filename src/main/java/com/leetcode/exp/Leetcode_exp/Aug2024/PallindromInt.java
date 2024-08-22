package com.leetcode.exp.Leetcode_exp.Aug2024;

public class PallindromInt {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(isPalindrome(x));
        System.out.println(reverseInt(x));

    }
    public static boolean isPalindrome(int x) {
        if (x < 0 ) return false;
        int initial_x =x;
        int number = 0;
        while (x > 0) {
            
            int rem = x % 10;
            number = number * 10 + rem;
            x = x /10;
        }
        if (number == initial_x ) return true;
        return false;
    }
    public static int reverseInt(int x) {
        boolean neg =  false;
        int result = 0;
        if (x != 0) {
            neg = true;
            x *= -1;
        }
        while (x > 0) {
            result = result * 10 + x % 10;
           
            x = x / 10;
        }
        result = result /10;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        if (neg) result = result * -1;
        return result;
    }
    
}
