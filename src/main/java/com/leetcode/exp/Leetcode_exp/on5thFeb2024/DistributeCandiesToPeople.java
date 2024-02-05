package com.leetcode.exp.Leetcode_exp.on5thFeb2024;
/*
 * https://leetcode.com/problems/distribute-candies-to-people/description/
 */
public class DistributeCandiesToPeople {
    public static void main(String[] args) {
        //int candies = 900, num_people = 40;
        int candies = 10,num_people = 3;
        int [] distribution = distributeCandies2(candies, num_people);
        for (int i = 0; i < distribution.length;i++) {
            System.out.print(" " + distribution[i]);
        }

    }
    public static int[] distributeCandies(int candies, int num_people) {
        if (num_people < 1) return new int[0];
        int [] result = new int[num_people];
        int total_consumtion = (num_people) * (num_people +1) /2;
        int n = candies / total_consumtion;
        if (n <= 1 ) n =2;
        for (int i = 0 ; i < n * num_people;i++) {
            if (candies >= i+1) {
                candies = candies - i - 1;
                result[i % num_people] = result[i%num_people] + i+1;
            }else {
                result[i% num_people] = result[i%num_people] + candies;
                candies = 0;
            }
        }
        if (candies != 0) {
            result[0] = result[0] + candies;
        }
        
        return result;
    }
    public static int[] distributeCandies2(int candies, int num_people) {
        int [] result = new int[num_people];
        int index = 0, count = 1;
        while (candies > 0) {
            if (candies <= count) {
                result[index] += candies;
                break;
            }
            result[index++] += count;
            candies = candies - count;
            if (index >= num_people) index = index % num_people;
            count++;
             
        }
        return result;
    }
    
}
