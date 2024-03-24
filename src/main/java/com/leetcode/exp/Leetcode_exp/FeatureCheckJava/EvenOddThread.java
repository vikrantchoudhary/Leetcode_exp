package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddThread {
    private static Object object = new Object();
    private static IntPredicate evenNo = e -> e%2 ==0;
    private static IntPredicate oddNo = e -> e%2 ==1 ;

    public static void main(String[] args) {
        CompletableFuture.runAsync(()->EvenOddThread.printNumber(oddNo));
        CompletableFuture.runAsync(()->EvenOddThread.printNumber(evenNo));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void printNumber ( IntPredicate predicate) {
        IntStream
            .rangeClosed(1, 10)
            .filter(predicate)
            .forEach(EvenOddThread::execute);
    }
    public static void execute(int no) {
        synchronized(object) {
            try {
                System.out.println(Thread.currentThread().getName() + " : " + no);
                object.notify();
                object.wait();
            }catch(InterruptedException iex) {
                iex.printStackTrace();
            }
        }
    }
    
}
