package com.leetcode.exp.Leetcode_exp.BasicJavaConcurrency;


import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;


public class EvenOddThread {
    static Object object = new Object();
    static IntPredicate evenPredicate = e -> e%2 == 0;
    static IntPredicate oddPredicate  = e -> e%2 == 1;

    public static void main(String[] args) {
        
        CompletableFuture.runAsync(() -> EvenOddThread.printElement(evenPredicate));
        CompletableFuture.runAsync(() -> EvenOddThread.printElement(oddPredicate));
       
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static void printElement(IntPredicate condition) {
        IntStream.rangeClosed(1, 20).filter(condition).forEach(i -> EvenOddThread.execute(i,condition));
    }

    public static void execute(int n,IntPredicate condtion) {
        synchronized(object) {
            if (condtion == evenPredicate) { 
                Thread.currentThread().setName("even");
            }else {
                Thread.currentThread().setName("odd");
            }
            System.out.println(Thread.currentThread().getName() + " : " + n);
            object.notify();
            try {
                object.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }


    
}
