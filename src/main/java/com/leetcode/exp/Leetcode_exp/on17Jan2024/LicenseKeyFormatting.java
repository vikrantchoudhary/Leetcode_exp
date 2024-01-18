package com.leetcode.exp.Leetcode_exp.on17Jan2024;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String input1 = "5F3Z-2e-9-w" ;
        int k1 = 4;
        String input2 = "2-5g-3-J";
        int k2 = 2;
        System.out.println(input1 + "  formatted with " + licenseKeyFormatting(input1, k1));
        System.out.println(input2 + "  formatted with " + licenseKeyFormatting(input2, k2));
    }
    public static String licenseKeyFormatting(String s, int k) {
        s= s.toUpperCase();
        s = s.replaceAll("-", "");
        StringBuilder sb = new StringBuilder(s);
        for (int i = s.length()-k;i>0;i=i-k) {
            sb.insert(i, "-");
        }
        return sb.toString();
    }
    
}
