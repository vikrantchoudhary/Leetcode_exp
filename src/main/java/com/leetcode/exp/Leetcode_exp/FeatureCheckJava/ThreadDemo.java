package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;
/*
 * 4 ways to create threads
 * all threads access the same resource 
 */
public class ThreadDemo {
    static int n = 30;
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while ( n > 0) 
                System.out.println(Thread.currentThread().getName() + " : " + n--);
            }
        },"MyThread1");

        Thread t2 = new MyThread2("MyThread2");
        
        Runnable runnable = () -> {
            while ( n > 0) 
                System.out.println(Thread.currentThread().getName() + " : " + n--);
        };
        Thread t3 = new Thread(runnable,"Mythread3");
        
        Thread t4 = new Thread(() -> {
            while ( n > 0) 
                System.out.println(Thread.currentThread().getName() + " : " + n--);
        },"MyThread4");
        t2.start();
        t1.start();
        t3.start();
        t4.start();
    }
    
}
class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        while (ThreadDemo.n > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + ThreadDemo.n--);
        }
    }
}
