package com.leetcode.exp.Leetcode_exp.on12thJan2024;
/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
 */
public class BestTimeToBuyII {
    public static void main(String args[]) {
        //int prices[] = {7,1,5,3,6,4};
        //int prices[] = {1,2,3,4,5};
        int prices[] ={7,6,5,4,3,2};
        int max_profit = maxProfit(prices);
        System.out.println("Max profit with given input: " + max_profit);
    }
    public static int maxProfit(int[] prices) {
        int min_val = Integer.MAX_VALUE;
        int max_profit = 0;
        int sum_profit = 0;
        for (int i =0 ; i< prices.length; i++) {
            if (prices[i] < min_val) {
                min_val = prices[i];
            }else if ( (prices[i] - min_val) > max_profit) {
                max_profit = prices[i] - min_val;
                sum_profit += max_profit;
                min_val = Integer.MAX_VALUE;
                max_profit = 0;
                i = i -1; // need to consider this as we can buy the stock on same day too.
            }
        }
        return sum_profit;
    }
    
}
