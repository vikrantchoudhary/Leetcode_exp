package com.leetcode.exp.Leetcode_exp.on9thFeb2024.SingletonPattern;

// object will be created in JVM 
//if we are not using then also it present in memory & waste the resource
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance() {
        return instance;
    }
    
}
