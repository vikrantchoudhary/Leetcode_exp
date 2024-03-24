package com.leetcode.exp.Leetcode_exp.BasicJavaConcurrency;

public class DeadLock {
    public static void main(String[] args) {
        String lock1 = "lock1";
        String lock2 = "lock2";
        System.out.println("Main started ...");
        Thread t1 = new Thread(() -> {
            synchronized(lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    lock1.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
                synchronized(lock2) {
                    for (int i = 0 ; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName() + " :  " + i);
                    }
                }
                
            }
            

        },"Thread1");

        Thread t2 = new Thread(() -> {
            
            synchronized(lock2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock2.notify();
                synchronized(lock1) {
                    for (int i = 0 ; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName() + " :  " + i);
                    }
                }
                
            }

        },"Thread2");

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Main existing ...");
    }
    
}
