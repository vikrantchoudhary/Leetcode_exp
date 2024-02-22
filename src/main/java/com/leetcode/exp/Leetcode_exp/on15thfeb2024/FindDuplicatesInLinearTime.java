package com.leetcode.exp.Leetcode_exp.on15thfeb2024;
/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 */
import java.util.List;
import java.util.ArrayList;
public class FindDuplicatesInLinearTime {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(nums);
        for (int r : result) {
            System.out.print( r + " ");
        }

    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int index;
        for (int i = 0; i< nums.length;i++) {
            index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) result.add(Math.abs(nums[i]));
            nums[index] = -nums[index];
        }
        return result;
    }
    
}
