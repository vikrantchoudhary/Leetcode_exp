package com.leetcode.exp.Leetcode_exp.BasicJavaConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        System.out.println("Main started ..");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0 ; i < 20 ; i++) {
            Runnable runnable = () -> {
                System.out.println("Started thread : " + Thread.currentThread().getName() );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            executorService.execute(runnable);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            //System.out.println("thread is not completed.. waiting");
        }
        System.out.println("Main completed");
    }
    
}
