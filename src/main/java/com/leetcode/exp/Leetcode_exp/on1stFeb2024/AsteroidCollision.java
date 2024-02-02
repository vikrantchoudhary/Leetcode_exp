package com.leetcode.exp.Leetcode_exp.on1stFeb2024;

import java.util.Stack;

/**
 * https://leetcode.com/problems/asteroid-collision/description/
 */
public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {10,2,-5};
        int[] remainingAsteriods = asteroidCollision(asteroids);
        for (int asteroid : remainingAsteriods) {
            System.out.print( " " + asteroid);
        }

    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        //stack.push(asteroids[0]);
        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            }else {
                while (true) {
                    int peek = stack.peek();
                    if (peek <0) {
                        stack.push(asteroid);
                        break;
                    }else if (peek == -asteroid) {
                        stack.pop();
                        break;
                    }else if (peek > -asteroid) {
                        break;
                    }else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroid);
                            break;
                        }
                    }
                }
            }
        }
        int [] remaining = new int[stack.size()];
        int i =stack.size() -1 ;
        while (!stack.isEmpty()){
            remaining[i--] = stack.pop();
        }
        return remaining;
    }
    
}
