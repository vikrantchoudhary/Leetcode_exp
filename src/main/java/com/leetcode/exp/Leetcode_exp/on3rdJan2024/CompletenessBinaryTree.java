package com.leetcode.exp.Leetcode_exp.on3rdJan2024;

import java.util.LinkedList;
import java.util.Queue;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;

/**
 * https://leetcode.com/problems/check-completeness-of-a-binary-tree/
 * Check Completeness of a Binary Tree
 * In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h
 */
public class CompletenessBinaryTree {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        //subtree 
        TreeNode lefttree = new TreeNode(2);
        lefttree.setLeft(new TreeNode(4));
        lefttree.setRight(new TreeNode(5));
        TreeNode righttree = new TreeNode(3);
        righttree.setLeft(new TreeNode(6));
        tree.setLeft(lefttree);
        tree.setRight(righttree);
        //check completeness    
        if (isCompleteTree(tree)) {
            System.out.println("complete Binary tree");
        }else {
            System.out.println("Not complete tree");
        }

    }
    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isNullFound = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                isNullFound = true;
            }else {
                if (isNullFound) return false;
                queue.add(node.getLeft());
                queue.add(node.getRight());
            }
        }
        return true;
    }
    
}
