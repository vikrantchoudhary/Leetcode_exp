package com.leetcode.exp.Leetcode_exp.On11thJan2024;
/**
 * https://leetcode.com/problems/sum-of-even-numbers-after-queries/description/
 */
public class SumOfEvenNumberAfterQueries {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int queries[][] = {{1,0},{-3,1},{-4,0},{2,3}};
        int [] result = sumEvenAfterQueries2(nums, queries);
        for (int i =0 ; i < result.length ; i++ ) {
            System.out.print("  " + result[i]);
        }
    }
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int result[] = new int [nums.length];
        int count = 0;
        while (count < result.length) {
            int sum = 0;
            int val = queries[count][0];
            int index = queries[count][1];
            //for (int i =0 ; i < result.length ; i ++) {
                nums[index ] += val;
            //}
             for (int i =0 ; i < result.length ; i ++) {
                if (nums[i] %2 == 0) {
                    sum += nums[i];
                }
            }
            result[count] = sum;
            count ++;
        }


        return result;
    }
    public static int[] sumEvenAfterQueries2(int[] nums, int[][] queries) {
        int result[] = new int [queries.length];
        int sum = 0;
        for (int x : nums) {
            if (x%2 ==0 ) sum += x;
        }
        for (int i=0 ; i < queries.length; ++i) {
            int val = queries[i][0];
            int index = queries[i][1];
            if (nums[index]%2 == 0) sum -= nums[index];
            nums[index] += val;
            if (nums[index]%2 == 0) sum +=nums[index];
            result[i] = sum;
        }
        return result;
    }
    
}
