package com.leetcode.exp.Leetcode_exp.on9thFeb2024.SingletonPattern;

public class MutiThreadedSingleton {

    private static MutiThreadedSingleton instance = null;
    
    private MutiThreadedSingleton() {}

    public static MutiThreadedSingleton getInstance() {
       
        if (instance == null) {
            synchronized(MutiThreadedSingleton.class) {

            if (instance == null ) instance = new MutiThreadedSingleton();
            }
        }
        return instance;
    }
    
}
