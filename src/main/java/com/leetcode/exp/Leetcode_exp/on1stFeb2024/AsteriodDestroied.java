package com.leetcode.exp.Leetcode_exp.on1stFeb2024;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/destroying-asteroids/
 */
public class AsteriodDestroied {
    public static void main(String[] args) {
    
        int mass = 10;
        int [] asteroids ={3,9,19,5,21};
        if (asteroidsDestroyed(mass, asteroids)) {
                System.out.println("destryed");
            }else {
                System.out.println();
            }
    
    }
    
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for(int asteriod : asteroids) {
            if (mass < asteriod) {
                return false;
            }
            mass += asteriod;
        }
       return true; 
    }
    
}
