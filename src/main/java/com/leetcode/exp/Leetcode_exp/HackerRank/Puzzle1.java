package com.leetcode.exp.Leetcode_exp.HackerRank;


import java.util.ArrayList;
import java.util.List;
/*
 * given 1-100 people standing in circle 
 * after each round person 1 will cut the person next to him and then pass the swrod 
 * another person
 */
public class Puzzle1 {
    public static void main(String[] args) {
        int n = 100;
        //int a [] = IntStream.range(1, n).toArray();
        List<Integer> a = new ArrayList<>();
        for (int i =1 ; i<= n;i++) {
            a.add(i);
        }
        System.out.println(a);
        
        //int k =2;
        /*for (int i = 0; i < a.size() -1; i ++) {
            a.remove(i+1);
        }*/
        //int i = 1;
        while (a.size() > 1) {
            //for (int i = 1 ; i <= n ; i++) {
                
             for (int i = 0; i < a.size() -1; i ++) {
                a.remove(i+1);
            }
            //}
            //if (i >= a.size() ){
                System.out.println(a);
                System.out.println("=======");
            //}
            
           
        }
        System.out.println("********");
        System.out.println(a);
    }
   
}
