package com.leetcode.exp.Leetcode_exp.on30thJan2024;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/open-the-lock/description/
 */
public class OpenLock {
    public static void main(String[] args) {
        String [] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        System.out.println("Number of steps to open the lock " + openLock(deadends, target));
        
    }
    public static int openLock(String[] deadends, String target) {
        HashSet<String> deadSet = new HashSet<>();
        for (String dead : deadends) deadSet.add(dead);
        //System.out.println(deadSet);
        if (deadSet.contains(target) || deadSet.contains("0000")) return -1;
        HashSet <String> visited = new HashSet<>();
        visited.add("0000");

        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
           // while(size >0) {
            for (int j =0 ; j< size ; j++) {
                String lock_pos = queue.poll();
               
                if (lock_pos.equals(target)) return steps;
                StringBuilder sb = new StringBuilder(lock_pos);
                for (int i= 0; i<4; i++) {
                    char cur_pos = sb.charAt(i);
                    //System.out.println(cur_pos);
                    //if (i == 1) break;
                    String s1 = sb.substring(0,i) + (cur_pos == '9' ? 0 : cur_pos - '0' + 1)+ sb.substring(i+1) ;
                    String s2 = sb.substring(0,i) + (cur_pos == '0' ? 9 : cur_pos - '0' - 1) + sb.substring(i+1);
                    System.out.println(s1 + "  " + s2);
                    if (!visited.contains(s1) && !deadSet.contains(s1)) {
                        visited.add(s1);
                        queue.add(s1);
                    }
                    if (!visited.contains(s2) && !deadSet.contains(s2)) {
                        visited.add(s2);
                        queue.add(s2);
                    }
                }
            }
            steps++;
        }
       
        return -1;
    }
    
}
