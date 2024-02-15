package com.leetcode.exp.Leetcode_exp.on11thFeb2024;



public class PlusOne {
    public static void main(String[] args) {
        int digits[] = {9,9,9};
        int result[] = plusOne(digits);
        for (int n: result) {
            System.out.print(n + " ");
        }

    }
    public static int[] plusOne(int[] digits) {
        if (digits.length < 1) return null;
        int n = digits.length -1;
        int carry = 0;
        digits[n] += 1;
        if (digits[n] == 10) {
            digits[n] = 0;
            carry =1;
        }
        n--;
        while ( n >= 0) {
            if (digits[n] ==9 && carry ==1) {
                digits[n] = 0;
                carry =1;
            }else if (carry == 1) {
                digits[n] +=1;
                carry = 0;
            }
            n--;
        }
        
        if (carry ==1) {
            int result[] = new int[digits.length+1];
            result[0] =1;
            return result;
            
        }
        return digits;
    }
    
}
