package com.leetcode.exp.Leetcode_exp.on5thJan2024;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static void main(String[] args) {
        int left =1;
        int right = 22;
        List<Integer> selfDivingList = selfDividingNumbers(left,right);
        for (int list:selfDivingList) {
            System.out.println(list);
        }
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDivingList = new ArrayList<>();
        for (int i = left ; i <= right; i++) {
            if (selfDiving(i)) selfDivingList.add(i);
        }

        return selfDivingList;
    }
    public static Boolean selfDiving(int n) {
        //123
        while (n > 0) {
            int reminder = n % 10 ; 
            if (reminder == 0 || n%reminder != 0) return false;
            n = n/10;
        }
        return true;
    }
    
}
