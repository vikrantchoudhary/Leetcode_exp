package com.leetcode.exp.Leetcode_exp.Aug2024;

public class BestTimetoBuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i=1;i<prices.length;i++) {
            if (min > prices[i]) {
                min = prices[i];
            }else {
                if (profit < (prices[i] - min)) {
                    profit = prices[i] - min;
                }
            }

        }
        return profit;
    }
    
}
