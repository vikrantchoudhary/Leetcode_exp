package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;
@FunctionalInterface
public interface MyLambdaFunctionalInterface {
    int sum (int i, int j);
    static int add (int i, int j) {
        return i +j;
    }
    default int addDefault (int i, int j) {
        return i + j;
    }
    
}
