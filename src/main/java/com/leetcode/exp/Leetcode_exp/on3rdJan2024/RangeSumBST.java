package com.leetcode.exp.Leetcode_exp.on3rdJan2024;

import java.util.Stack;
/**
 * https://leetcode.com/problems/range-sum-of-bst/
 * output: rang sum L= 7 R= 15 is  32
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val,TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
public class RangeSumBST {
    public static void main(String args[]) {
        //int[] BSTTree = {10,5,15,3,7,null,18};
        TreeNode treeNode = new TreeNode(10);
        //treeNode.root = new TreeNode(1);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(7);
        //treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(18);
        int low =7;
        int high = 15;
        System.out.println("rang sum L= " + low + " R= " + high + " is  " + rangeSumBST(treeNode, low, high));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (node.val <= high && node.val >= low) {
                    sum += node.val;
                }   
                if (node.left != null) {
                    stack.push(node.left);
                }
                if (node.right != null) {
                    stack.push(node.right);
                }
            }
        }
        return sum ;
    }
    
}
