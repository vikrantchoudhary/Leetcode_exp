package com.leetcode.exp.Leetcode_exp.on31stJan2024;

public class SumEvenNumbersAfterQueries {
    public static void main(String[] args) {
       int [] nums = {1,2,3,4};
       int [][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
       int [] result = sumEvenAfterQueries(nums, queries);
       for (int n : result) {
        System.out.print("  " + n);
       }
    }
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int []result = new int[nums.length];
        int counter = 0;
        for (int i=0 ; i< queries.length;i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            int sum = 0;
            nums[index] += val;
            for (int j = 0; j <nums.length;j++) {
                if (nums[j]%2 == 0) {
                    sum += nums[j];
                }
            }
            result[counter] = sum;
            counter++;
        }

        return result;
    }
    
}
