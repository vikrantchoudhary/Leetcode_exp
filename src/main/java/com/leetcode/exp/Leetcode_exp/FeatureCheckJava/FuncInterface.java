package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

@FunctionalInterface
public interface FuncInterface {
    abstract int add(int i, int j);
    static  int sum (int i, int j) {
        return i + j;
    }
    default int[] initalNumber(int i, int j) {
        i = 6;
        j = 11;
        return new int[] {i,j};
    }

    
}
