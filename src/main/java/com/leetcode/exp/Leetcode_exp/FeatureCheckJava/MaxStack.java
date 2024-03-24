package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

import java.util.Stack;

public class MaxStack <T extends Comparable<T>>{
    private Stack<T> stack;
    private Stack<T> maxStack;
    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }
    public void push (T element) {
        stack.push(element);
        if (maxStack.isEmpty() || element.compareTo(maxStack.peek()) > 0) {
            maxStack.push(element);
        }
    }
    public T pop() {
        T elT = stack.pop();
        if (elT.equals(maxStack.peek())) {
            maxStack.pop();
        }
        return elT;
    }
    public T max() {
        return maxStack.peek();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    

    
}
