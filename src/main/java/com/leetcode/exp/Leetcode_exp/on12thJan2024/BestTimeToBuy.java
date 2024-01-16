package com.leetcode.exp.Leetcode_exp.on12thJan2024;

public class BestTimeToBuy {
    public static void main(String args[]) {
        int prices[] = {7,1,5,3,6,4};
        int max_profit = maxProfit(prices);
        System.out.println("Max profit with given input: " + max_profit);
    }
    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_val = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_val) {
                min_val = prices[i];
            } else if (prices[i] - min_val > max_profit) {
                max_profit = prices[i] - min_val;
            }
            
        }
        return max_profit;
    }
    
}
