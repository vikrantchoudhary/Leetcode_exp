package com.leetcode.exp.Leetcode_exp.on5thJan2024;

public class SortArrayByParity {
    public static void main(String[] args) {
        int input[] = {3,1,2,4};
        int output[] = sortArrayByParity2(input);
        for(int i= 0 ; i < output.length; i++) {
            System.out.print ("  " + output[i]);
        }

    }
    public static int[] sortArrayByParity(int[] nums) {
        int even[] = new int[nums.length];
        int odd[] = new int[nums.length];
        int j =0;
        int k = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]%2 == 0) {
                even[j] = nums[i];
                j++;
            }else {
                odd[k] = nums[i];
                k++;
            }
        }
        k = 0;
        for (int i= j; i < nums.length; i++ ) {
            even[i] = odd[k];
            k++;
        }
        return even;
    }
    // 2nd approach
    public static int[] sortArrayByParity2(int[] nums) {
        int start = 0 , end = nums.length -1;
        int temp;
        while (start <= end) {
            if (nums[start]%2 != 0 && nums[end]%2 == 0) {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            if (nums[start]%2 == 0 ) start++;
            if (nums[end]%2 != 0 ) end--;
        }
        return nums;
    }
    
}
