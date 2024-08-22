package com.leetcode.exp.Leetcode_exp.Aug2024;

public class IsPowerof2 {
    public static void main(String args[]) {
        int test_num [] = {2,16,3,11,64,258,256,2048};
        for (int n : test_num) {
            System.out.println(isPowerOfTwo(n));
        }
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while ( n / 2 >= 1) {
            if (n %2 == 1) return false;
            n = n/2;
        }
        return true;
        
    }
    
}
