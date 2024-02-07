package com.leetcode.exp.Leetcode_exp.on5thFeb2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;

public class SortedArrayToBinaryTree {
    public static void main(String[] args) {
        int nums[] = {-10,-3,0,5,9};
        TreeNode BinaryTree = sortedArrayToBST(nums);
        TreeNode.printTree(BinaryTree);
        
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        
        
        return BST(nums, 0, nums.length -1);
        
    }
    public static TreeNode BST(int[] nums,int start, int end) {
        TreeNode BT = new TreeNode();
        if (start > end) {
            return null;
         }

        //while (start < end) {
            int mid = start + (end -start) /2;
            BT.setVal(nums[mid]);
            BT.setLeft(BST(nums, start, mid -1));
            BT.setRight(BST(nums, mid+1, end));
            return BT;
        //}
    }
    
}
/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode (int val,TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}*/
