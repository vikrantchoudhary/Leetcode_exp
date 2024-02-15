package com.leetcode.exp.Leetcode_exp.on11thFeb2024;
/*
 * https://leetcode.com/problems/add-binary/description/
 */
public class AddBinary {
    public static void main(String[] args) {
        String a = "1", b = "1011";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String a, String b) {
        if (a == null)return b;
        if (b == null) return a;
        StringBuilder sb = new StringBuilder();
        int n = a.length() -1;
        int m = b.length() - 1;
        int sum;
        int carry = 0;
        while (n >=0 || m >=0) {
            sum = carry;
            if (n>=0 ) sum += a.charAt(n) - '0';
            if (m >=0) sum += b.charAt(m) - '0';
            sb.append(sum %2);
            carry = sum / 2;
            n--;
            m--;
        }
        if (carry == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();

    }
    //}
    
}
