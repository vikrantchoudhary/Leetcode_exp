package com.leetcode.exp.Leetcode_exp.Aug2024;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int arr[] = {0,10,5,2};
        System.out.println(peakIndexInMountainArr(arr));
    }
    public static int peakIndexInMountainArr(int [] arr) {
        
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        
        while (start < end) {
            mid = start + (end - start)/2 ;
            if (arr[mid] < arr[mid + 1]) {
                start = mid +1;
            }else {
                end = mid;
            } 
        }

        return start;
    }
    
}
