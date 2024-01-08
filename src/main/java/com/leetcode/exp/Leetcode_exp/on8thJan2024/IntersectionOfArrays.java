package com.leetcode.exp.Leetcode_exp.on8thJan2024;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
/**
 * 
 */
public class IntersectionOfArrays {
    public static void main(String[] args) {
        //case1
        //int array1[] = {1,2,2,1};
        //int array2[] = {2,2};
        //case2
        int array1[] = {4,9,5};
        int array2[] = {9,4,9,8,4};
        int result[] = intersect2(array1, array2);
        for (int i = 0 ; i< result.length; i++) {
            System.out.println(result[i]);
        }
        
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int n = Math.min(nums1.length,nums2.length);
        Map<Integer,Integer> common = new HashMap<>();
        int [] result = new int[n];
        for (int i =0 ; i< nums1.length ; i++) {
            if (!common.containsKey(nums1[i]))  {
                common.put(nums1[i],1);
            }else {
                common.replace(nums1[i],common.get(nums1[i]) +1);
            }
        }
        int k = 0;
         for (int i =0 ; i< nums2.length ; i++) {
            while (common.containsKey(nums2[i]) && common.get(nums2[i]) > 0 )  {
                common.replace(nums2[i],common.get(nums2[i]) -1);
                result[k] = nums2[i];
                k++;
            }
        }
    return result;
    }
    public static int[] intersect2(int[] nums1, int[] nums2) {
        int [] result =new int[nums1.length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i =0, j=0, k =0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            }else if (nums1[i] > nums2[j]) {
                j++;
            }else {
                result[k++] = nums1[i++];
                j++;
            }
        }
        
    return Arrays.copyOfRange(result,0,k);
    }
    
}
