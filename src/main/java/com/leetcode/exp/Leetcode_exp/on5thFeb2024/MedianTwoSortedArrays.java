package com.leetcode.exp.Leetcode_exp.on5thFeb2024;

public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        int nums1[] = {1,3};
        int nums2[] = {2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
        
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int l = 0,m=0,k=0;
        int merge_arr [] = new int[n1+n2];
        while (l < n1 && m < n2) {
            if (nums1[l] < nums2[m]) {
                merge_arr[k] = nums1[l];
                l++;
            }else {
                merge_arr[k] = nums2[m];
                m++;
            }
            k++;
        }
        while (l < n1) {
            merge_arr[k++] = nums1[l++];
        }
        while (m < n2) {
            merge_arr[k++] = nums2[m++];
        }
        int mid = (n1+n2) /2;
         if ((n1+n2) %2 == 0) {
            
            median = (merge_arr[mid -1 ] + merge_arr[mid])/2.0;
         }else {
            median = merge_arr[mid];
         }
        return median;
    }
}
