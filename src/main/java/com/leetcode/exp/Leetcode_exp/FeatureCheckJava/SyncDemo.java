package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

public class SyncDemo {
    
    public static void main(String[] args) {
        Object lock = new Object();
        MyStack myStack = new MyStack(10);
        Thread t1 = new Thread(() -> {
            int counter = 0;
                while (++ counter < 10) {
                    System.out.println("Push action on stack" + myStack.push(100));
             }
        },"pushThread");

        Thread t2 = new Thread(() -> {
            int counter = 0;
                while (++counter < 10) {
                 System.out.println("Pop action on stack " + myStack.pop());
             }
             

        },"popThread");
        t1.start();
        t2.start();
    }
    
    
}
