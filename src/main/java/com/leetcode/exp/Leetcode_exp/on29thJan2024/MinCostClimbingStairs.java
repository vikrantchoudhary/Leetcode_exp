package com.leetcode.exp.Leetcode_exp.on29thJan2024;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int cost[] = {1,100,1,1,1,100,1,1,100,1};
        System.out.println("min cost to reach to top " + minCostClimbingStairs(cost));
        
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }
        System.out.println(cost);
        return Math.min(cost[n-1],cost[n-2]);
    }
    public static int minCostClimbingStairs2(int[] cost) {
        int n = cost.length;
        int step1= 0;
        int step2 = 0;
        for (int i = n-1; i>=0; i--) {
            int current_step = cost[i] + Math.min(step1,step2);
            step1 = step2;
            step2 = current_step;
        }
        return Math.min(step1,step2);
    }
}
