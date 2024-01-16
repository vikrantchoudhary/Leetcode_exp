package com.leetcode.exp.Leetcode_exp.on8thJan2024;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class differenceArrays {
    public static void main(String[] args) {
        //case1:
        //int[] nums1 = {1,2,3};
        //int [] nums2 = {2,4,6};
        //case2
        int[] nums1 = {1,2,3,3};
        int[] nums2 ={1,1,2,2};
        List<Set<Integer>> difList = new ArrayList<>();
        difList = findDifference(nums1, nums2);
        for(Set<Integer> list : difList) {
            System.out.println(list);
        }

    }
    /*public static List<Set<Integer>> findDifference2(int[] nums1, int[] nums2) {
        List<List<Integer>> diffList = new ArrayList<>();
        List<Integer> nums1List= new ArrayList<>();
        
        Set<Integer> nums1Set = new HashSet<>(Arrays.asList(Arrays.setAll(nums1, i->nums1[i])));
        ArrayList<Integer> nums2List= new ArrayList<>();
        Set<Integer> nums2Set = new HashSet<>(Arrays.asList(nums2));
        
        int i=0, j = 0;
        while (i < nums1Set.size() && j < nums2Set.size()) {
            if (nums1Set.get(i) < nums2Set.get(j)) {
                nums1List.add(nums1Set.get(i));
                i++;
            }else if (nums1Set.get(i) > nums2Set.get(j)){
                nums2List.add(nums2Set.get(i));
                j++;
            }
            else  {
                i++;
                j++;
            }
            
        }
        while (i < nums1Set.size()) {
            nums1List.add(nums1Set.get(i));
            i++;
        }
        while (j < nums2Set.size()) {
            nums2List.add(nums1Set.get(i));
            j++;
        }
        
        diffList.add(nums1List);
        diffList.add(nums2List);
        return diffList;
    }*/
    public static List<Set<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Set<Integer>> diffList = new ArrayList<>();
        Set<Integer> nums1List= new HashSet<>();
        Set<Integer> nums2List= new HashSet<>();
        int i=0, j = 0, cont = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j] && nums1[i] != cont) {
                nums1List.add(nums1[i]);
                i++;
            }else if (nums1[i] > nums2[j] && nums2[i] != cont){
                nums2List.add(nums2[j]);
                j++;
            }
            else  {
                cont = nums1[i];
                i++;
                j++;
            }
            
        }
        while (i < nums1.length) {
            nums1List.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            nums2List.add(nums2[j]);
            j++;
        }
        
        diffList.add(nums1List);
        diffList.add(nums2List);
        return diffList;
    }
}
