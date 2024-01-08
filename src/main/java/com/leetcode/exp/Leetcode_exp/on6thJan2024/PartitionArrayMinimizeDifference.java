package com.leetcode.exp.Leetcode_exp.on6thJan2024;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/
 */
public class PartitionArrayMinimizeDifference {
    public static void main(String[] args) {
        //int[] input = {3,9,7,3};
        int[] input = {2,-1,0,4,-2,-9};
        System.out.println("Input " + input);
        System.out.println("Minimum difference: " + minimumDifference2(input));

    }
    public static int minimumDifference(int[] nums) {
        if (nums.length <1) return nums[0]; 
        Arrays.sort(nums);
        int total = nums.length;
        int start = 0 ,end = total -1;
        int half = total/2;
        int[] array1 = new int[half];
        int[] array2 = new int[half];
        int i=0;
        int sum1=0, sum2=0;
        
        while (start <= end && half > 1) {
            if (sum1 <= sum2) {
                array1[i] = nums[start];
                array1[i+1] = nums[end];
                start++;
                end--;
                array2[i] = nums[start];
                array2[i+1] = nums[end];
                start++;
                end--;
            }else {
                array2[i] = nums[start];
                array2[i+1] = nums[end];
                start++;
                end--;
                array1[i] = nums[start];
                array1[i+1] = nums[end];
                start++;
                end--;
                
            }
            sum1 =  sum1 + array1[i] + array1[i+1];
            sum2 = sum2 +  array2[i] + array2[i+1];
            i=i+2;
            half = half - 2;
        }
        if (start <= end ) {
           if (sum1 <= sum2) {
            array1[i] = nums[start];
            array2[i] = nums[end];
           }else {
            array1[i] = nums[end];
            array2[i] = nums[start];
           }
           sum1 += array1[i];
           sum2 = array2[i];
        }
        System.out.println( "array1 " + Arrays.asList(array1));
        System.out.println( "array2 " + Arrays.asList(array2));
       
        return Math.abs(sum1 - sum2);

    }
    public static int minimumDifference2(int[] nums) {
        int n = nums.length/2;
        int total = Arrays.stream(nums).sum();
        HashMap<Integer,List<Integer>> leftMap = new HashMap<>();
        HashMap<Integer,List<Integer>> rightMap = new HashMap<>();
        generatedSet(0,leftMap,nums,n);
        generatedSet(n,rightMap,nums,n);
        leftMap.put(0,Arrays.asList(0));
         rightMap.put(0,Arrays.asList(0));
         int min = Integer.MAX_VALUE;
         for (int i = 0; i<=n ; i++) {
            List<Integer> left = leftMap.get(i);
            List<Integer> right = rightMap.get(n-i);
            Collections.sort(left);
            Collections.sort(right);
            int p1 = 0,p2 = right.size() -1;
            while (p1 < left.size() && p2 >= 0) {
                int sum = left.get(p1) + right.get(p2);
                int remain = total - sum;
                int diff = Math.abs(remain - sum) ;
                min = Math.min(min, diff);
                if (sum > total / 2) p2 --;
                else p1++;
            }
         }
         return min;

    }
    // bitwise 1 if number is considered & 0 if not.
    public static void generatedSet(int start, HashMap <Integer, List<Integer>> map, int[] nums , int n ){
        //total set for given n is 2^n -1 
        for (int i = 0; i < Math.pow(2,n) ; i++) {
            String binaryString = Integer.toBinaryString(i);
            int sum = 0;
            int setBits = 0;
            int index = nums.length -1 ; 
            for ( int j = binaryString.length() -1 ;j >=0 ; j--){
                if (binaryString.charAt(j) == '1') {
                    setBits++;
                    sum += nums[index - start];
                    index --;
                }
                if (!map.containsKey(setBits)) {
                    map.put(setBits, new ArrayList<>());
                }
                map.get(setBits).add(sum);

             }

        }
    }

    
}
