package com.leetcode.exp.Leetcode_exp.on31stJan2024;

public class IsRectangleOverlapping {
   
    public static void main(String[] args) {
        int[] rec1 = {0,0,2,2}, rec2 = {1,1,3,3};
        if (isRectangleOverlap(rec1, rec2)) {
            System.out.println("Overlapping");
        }else {
            System.out.println("Not overlapping");
        }
    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0]< rec2[0] && rec2[0]< rec1[2] && rec1[1]< rec2[1] && rec2[1]< rec2[3];
     }

    
}
