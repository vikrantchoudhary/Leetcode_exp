package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ThreadEvenOdd{
    static Object object = new Object();
    static IntPredicate evenNo = e -> e%2 == 0;
    static IntPredicate oddNo = e -> e%2 == 1;
    public static void main(String[] args) {
        CompletableFuture.runAsync(()->ThreadEvenOdd.printNumber(evenNo));
        CompletableFuture.runAsync(()->ThreadEvenOdd.printNumber(oddNo));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    public static void printNumber(IntPredicate predicate){
        IntStream.rangeClosed(1, 20).filter(predicate).forEach(ThreadEvenOdd::execute);

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
