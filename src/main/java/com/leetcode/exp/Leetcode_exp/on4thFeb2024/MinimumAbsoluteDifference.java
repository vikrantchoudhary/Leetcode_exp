package com.leetcode.exp.Leetcode_exp.on4thFeb2024;
/*
 * https://leetcode.com/problems/minimum-absolute-difference/
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int arr[] = {4,2,1,3,7,9};
        System.out.println(minimumAbsDifference2(arr));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        int prev = arr[0];
        for (int i = 1; i<arr.length;i++) {
            int diff = arr[i] - prev;
            min_diff = Math.min(min_diff , diff);
            prev = arr[i];
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1;i++) {
            List<Integer> pair = new ArrayList<>();
            int rem = arr[i] + min_diff;
            for (int j = i+1;j<arr.length;j++) {
                if (arr[j] == rem) {
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    System.out.println(pair);
                    result.add(pair);
                }
            }
           
        }
       
        return result;
    }
    public static List<List<Integer>> minimumAbsDifference2(int[] arr) {
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        //HashMap<Integer,Integer> diff_num_map = new HashMap<>();

        int prev = arr[0];
        //diff_num_map.put(prev,0 );
        for (int i = 1; i<arr.length;i++) {
            int diff = arr[i] - prev;
            min_diff = Math.min(min_diff , diff);
            //diff_num_map.put(arr[i]+min_diff,arr[i] );
            prev = arr[i];
        }
        //System.out.println(diff_num_map);
        List<List<Integer>> result = new ArrayList<>();
        //we have min_diff this time 
        prev = arr[0];
        for (int i= 1 ; i< arr.length;i++){
            if (arr[i] - prev == min_diff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(prev);
                pair.add(arr[i]);
                result.add(pair);
            }
            prev = arr[i];
        }
        return result;
    }
}
