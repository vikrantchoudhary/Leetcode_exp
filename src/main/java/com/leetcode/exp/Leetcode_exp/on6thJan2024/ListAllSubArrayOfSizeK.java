package com.leetcode.exp.Leetcode_exp.on6thJan2024;
import java.util.List;

import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;

import java.util.HashMap;
public class ListAllSubArrayOfSizeK {
    public static void main(String args[]) {
        //int[] input = {3,9,7,3};
        int[] input = {2,-1,0,4,-2,-9};
        System.out.println("Input " + input);
        int subArraySize = 3;
        HashMap<int[],Integer>  listArrayOfSizeK = listAllSubArray(input,subArraySize);
        
    }
    public static HashMap<int[],Integer> listAllSubArray(int[] input,int k){
        int n = input.length;
        HashMap<int[],Integer>  resultMap = new HashMap<>();
        if (k > n) return resultMap;
        if (k == n) {
            resultMap.put(input, 0);
            return resultMap;
        }
        
        return resultMap;

    }
    
}
