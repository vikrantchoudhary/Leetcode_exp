package com.leetcode.exp.Leetcode_exp.on2ndFeb2024;

import java.util.List;
/*
 * Given network of computers, each identified by unique id.
 *  The network is represented as a list of connections between computers.
 *  Write a program to find minimum number of connections needed to make the entire network connected
 */
public class test {
 public static void main(String[] args) {
    int computers[] = {0,1,4,0,3,2,5,0};
    // output {1,4,3,2,5,0,0,0}
    for (int n: arrangezeros(computers)) {
        System.out.println(n);
    }

 }
 public static int[] arrangezeros(int nums[]) {
    int result[] = new int[nums.length];
    int count = 0;
    for (int i= 0; i<nums.length;i++) {
       if (nums[i] == 0) {
        count ++;
       }else {
            
       }
    }
    return nums;
 }
 
     
}
/*public class test {
    public static void main(String[] args) {
        int nums[] = {1,3,7,6,4,9};
        int target = 10;
        System.out.println(pairWithtarget(nums,target));
    }
    public static List<Integer,Integer> pairWithtarget(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            int second = target - nums[i]; // 1
            for (int j = i+1; j < nums.length;j++) {
                if (nums[j] == second) {
                    List.add(nums[i],nums[j]);
                }
            }
        }
    }
}*/

//select max(marks) from sudent_marks 

//select marks from student_marks order by marks limit 2;


//sitemesh framework