package com.leetcode.exp.Leetcode_exp.on1stFeb2024;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int greed_factor [] = {1,2,3};
        int cookies_size [] = {1,1};
        System.out.println(findContentChildren(greed_factor, cookies_size));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int g_pointer = 0;
        int s_pointer = 0;
        while (g_pointer < g.length && s_pointer <s.length) {
            if (g[g_pointer] <= s[s_pointer]) {
                g_pointer++;
                s_pointer++;
            }else {
                s_pointer++;
            }
        }
        return g_pointer;
    }
}
