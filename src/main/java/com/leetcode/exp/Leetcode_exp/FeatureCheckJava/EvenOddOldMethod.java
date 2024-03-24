package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

public class EvenOddOldMethod implements Runnable{
    Object object ;
    static int i = 1;

    public EvenOddOldMethod(Object object) {
        this.object = object;
    }
    public static void main(String[] args) {
       Object lock = new Object();
       Runnable r1 = new EvenOddOldMethod(lock);
       Runnable r2 = new EvenOddOldMethod(lock);
       new Thread(r2, "odd").start();
       new Thread(r1, "even").start();
       

        
    }
    public void run() {

        while ( i <= 20) {
            if ( i %2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized(object) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    i++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    object.notify();
                }

            }
            if (i %2 == 1 && Thread.currentThread().getName().equals("odd")) {
                synchronized(object) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    i++;
                    object.notify();
                }
            }
        }
    }
    
}
