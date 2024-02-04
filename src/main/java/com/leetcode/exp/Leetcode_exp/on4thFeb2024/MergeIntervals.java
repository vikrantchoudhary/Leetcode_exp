package com.leetcode.exp.Leetcode_exp.on4thFeb2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/merge-intervals/description/
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        //int [][] intervals = {{1,4},{5,6}};
         int [][] merged_intervals = merge(intervals);
        for (int i=0; i< merged_intervals.length;i++) {
            for (int j = 0 ; j < merged_intervals[0].length;j++) {
                System.out.print("  " + merged_intervals[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length < 2) return intervals;
        List<int[]> merged_intervals = new ArrayList<>();
        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        int [] current_interval = intervals[0];
        merged_intervals.add(current_interval);
        for (int i = 1; i < intervals.length; i++) {
            if (current_interval[1] >= intervals[i][0]) {
                merged_intervals.remove(current_interval);
                current_interval[1] = Math.max (current_interval[1],intervals[i][1]);
            }else {
                current_interval = intervals[i];
            }
            merged_intervals.add(current_interval);
        }
        return merged_intervals.toArray(new int[merged_intervals.size()][]);
    }
    
}
