package com.leetcode.exp.Leetcode_exp.on8thJan2024;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
    public static int maxArea(int[] height) {
        if (height.length <=1) return 0;
        int min = 0;
        int area = 0;
        int left =0;
        int right = height.length -1 ;
        while (left < right) {
            min = Math.min(height[left], height[right]);
            area = Math.max (area,(right - left ) * min);
            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return area;
       
    }
    
}
