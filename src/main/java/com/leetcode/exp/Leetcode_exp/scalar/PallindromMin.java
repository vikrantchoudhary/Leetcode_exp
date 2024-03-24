package com.leetcode.exp.Leetcode_exp.scalar;

public class PallindromMin {
    public static void main(String[] args) {
       // String  A = "oqycntornscygodzdctxnhoc";
       String A = "abede";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        if (isPallindrom(A)) return 0;

        A= A.substring(1);
        return 1 + solve(A);
    }
    public static boolean isPallindrom(String A) {
        if (A.length() <= 1) return true;
        int i = 0, k = A.length() -1;
        while (i<=k) {
            if (A.charAt(i) !=  A.charAt(k))  return false;
            i++;
            k--;
        }
        return true;
    }
}
