package com.leetcode.exp.Leetcode_exp.BasicJavaConcurrency;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<Integer> queue;
    int capacity;
    public MyQueue(int capacity) {
        this.capacity = capacity;
        queue = new LinkedList<>();
    }
    public boolean queAdd(int n) {
        synchronized(queue) {
            while (queue.size() == capacity) {
                
            }
            
            queue.add(n);
            queue.notifyAll();
            return true;
        }
    }
    public int quePoll() {
        synchronized(queue) {
            while (queue.isEmpty()) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            int ele = queue.poll();
            queue.notifyAll();
            return ele;
        }
    }
    
}
