package com.leetcode.exp.Leetcode_exp.on17Jan2024;
/*
 * https://leetcode.com/problems/fruit-into-baskets/description/
 */
public class FruitBasket {
    public static void main(String[] args) {
        int [] fruits = {1,2,3,2,2};
        System.out.println("max fruits collected in two baskets " + totalFruit(fruits));

    }
    public static int totalFruit(int[] fruits) {
        int max = 0;
        int current_max =0;
        int last_fruit=-1;
        int second_last_fruit = -1;
        int last_fruit_count =0;
        for (int fruit: fruits) {
            if (last_fruit == fruit || second_last_fruit == fruit) {
                current_max++;
            }else {
                current_max = last_fruit_count + 1;
            }
            if (fruit == last_fruit) {
                last_fruit_count++;
            }else {
                last_fruit_count = 1;
                second_last_fruit = last_fruit;
                last_fruit = fruit;
            }
            max = Math.max(max, current_max);
            
        }

        return max;
    }
    
}
