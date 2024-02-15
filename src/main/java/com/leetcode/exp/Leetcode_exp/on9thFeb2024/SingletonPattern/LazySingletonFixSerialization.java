package com.leetcode.exp.Leetcode_exp.on9thFeb2024.SingletonPattern;

import java.io.Serializable;

public class LazySingletonFixSerialization implements Serializable{
    private static LazySingletonFixSerialization instance = null;
    private LazySingletonFixSerialization() {
    }
    public static LazySingletonFixSerialization getInstance() {
        if (instance == null) {
            instance = new LazySingletonFixSerialization();
        }
        return instance;
    }
    protected Object readResolve() { return instance;}
}
