package com.leetcode.exp.Leetcode_exp.on20thJan2024;

public class DistanceBetweenBusStop {
    public static void main(String[] args) {
         int [] distance = {7,10,1,12,11,14,5,0};
         int start =7;
         int destination = 2;
         System.out.println(" distance between point "   + start  + " & " + destination
          + " is " + distanceBetweenBusStops(distance, start, destination));
    }
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        int clockwise_dis = 0;
        
        int n = distance.length;
        for (int i = 0 ; i < n; i++){
            if (start < destination && (i >= start &&  i< destination )) {
                clockwise_dis += distance[i];
            }else if (start > destination && (i>= start || i < destination)){
                clockwise_dis += distance[i];

            }
            total += distance[i];
        }
         return Math.min(clockwise_dis ,total - clockwise_dis);
        
        
    }
    
}
