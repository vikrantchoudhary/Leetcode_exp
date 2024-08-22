package com.leetcode.exp.Leetcode_exp.Aug2024;

public class FindMinimumRotation {
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        System.out.println(getMinimum(nums));

    }
    public static int getMinimum(int[] arr) {
        //int index= 0;
        int left =0;
        int right = arr.length -1;
        while (left <= right) {
            int mid = left + (right - left) /2;
            if (mid > 0 && arr[mid] < arr[mid -1]) return arr[mid];
            if (arr[mid] >= arr[left] && arr[mid] >= arr[right]) {
                left = mid +1;
            }else if (arr[mid] > arr[right]){
                right =mid -1;
            }
            //System.out.println(arr[mid]);
        }
        return arr[0];
        
    }
    
}
