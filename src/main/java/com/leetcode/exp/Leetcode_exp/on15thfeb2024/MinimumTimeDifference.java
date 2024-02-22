package com.leetcode.exp.Leetcode_exp.on15thfeb2024;
/*
 * https://leetcode.com/problems/minimum-time-difference/description/
 */
import java.util.List;
import java.util.ArrayList;
public class MinimumTimeDifference {
    public static void main(String[] args) {
        List<String> timePoints = new ArrayList();
        timePoints.add("00:00");
        timePoints.add("23:59");
        //timePoints.add("00:00");

        System.out.println(findMinDifference(timePoints));
    }
    public static int findMinDifference(List<String> timePoints) {
        if (timePoints.size() < 1) return 0;
        boolean time_seeen [] = new boolean[60*24];
        //int totalTime[] = new int[timePoints.size()]; 

        for (int i = 0; i < timePoints.size();i++ ) {
            String time_arr[] = timePoints.get(i).split(":");
            int HH = Integer.parseInt(time_arr[0]);
            int MM = Integer.parseInt(time_arr[1]);
            int total_time = HH * 60 + MM;
            //totalTime[i] = total_time;
            if (time_seeen[total_time]) return 0;
            time_seeen[total_time] = true;
        }
        Integer prev = null;
        Integer min = Integer.MAX_VALUE;
        Integer first_seen  = null;
        for (int i = 0; i< time_seeen.length; i++) {
            System.out.println(prev);
            if (time_seeen[i]) {
                if (first_seen == null) {
                    first_seen = i;
                    prev = i;
                }else {
                    min = Math.min(min, Math.min(i- prev, 1440 - i + prev));
                    prev = i;
           
                }
            }
        }
        min = Math.min(min, Math.min(prev -first_seen, 1440 - prev + first_seen));

        return min;
    }
    
}
