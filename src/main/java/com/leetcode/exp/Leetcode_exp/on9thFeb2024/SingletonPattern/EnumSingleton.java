package com.leetcode.exp.Leetcode_exp.on9thFeb2024.SingletonPattern;

public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println(INSTANCE.hashCode());
    }
}
