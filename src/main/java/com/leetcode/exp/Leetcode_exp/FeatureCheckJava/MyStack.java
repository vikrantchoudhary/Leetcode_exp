package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

public class MyStack {

  int[] array;
  int stackTop;
  Object lock;

  public MyStack(int capacity) {
    array = new int[capacity];
    stackTop = -1;
    lock = new Object();
  }

  public boolean isEmpty() {
    return stackTop < 0;
  }

  public boolean isFull() {
    return stackTop == array.length - 1;
  }

  public boolean push(int element) {
    if (isFull()) return false;
    synchronized (lock) {
      stackTop++;
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      array[stackTop] = element;
    }
    return true;
  }

  public int pop() {
    if (isEmpty()) return Integer.MIN_VALUE;
    synchronized (lock) {
      int data = array[stackTop];
      array[stackTop] = Integer.MIN_VALUE;
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      stackTop--;
      return data;
    }
  }
}
