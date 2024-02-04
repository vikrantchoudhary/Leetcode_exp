package com.leetcode.exp.Leetcode_exp.on2ndFeb2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;

/*
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
 */
public class BinaryTreeMaximumPathSum {
    static int max_sum = Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.setLeft(new TreeNode(2));
        tree.setRight(new TreeNode(3));
        TreeNode.printTree(tree);
        System.out.println("max path sum = " + maxPathSum(tree));
    }
    public static int maxPathSum(TreeNode root) {
        computeMax(root);
        return max_sum;
    }
    static int computeMax(TreeNode tree) {
        if (tree == null) return 0;
        int max_left = Math.max(computeMax(tree.getLeft()),0);
        int max_right = Math.max(computeMax(tree.getRight()),0);
        max_sum = Math.max(max_sum, max_left + max_right + tree.getVal());
        return Math.max(max_left + tree.getVal() , max_right + tree.getVal());
    }
}
