package com.leetcode.exp.Leetcode_exp.Aug2024;

import java.util.List;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        
        TreeNode righttree = new TreeNode(2);
        righttree.setLeft(new TreeNode(3));
        tree.setRight(righttree);
        TreeNode.printTree(tree);
        TreeNode invertBT = InvertBTree(tree);
        System.out.println();
        TreeNode.printTree(invertBT);
    }

    private static TreeNode InvertBTree(TreeNode tree) {
        if(tree == null) return tree;
        TreeNode left = InvertBTree(tree.getRight());
        TreeNode right = InvertBTree(tree.getLeft());
        tree.setLeft(left);
        tree.setRight(right);
        return tree;
        
    }
}
