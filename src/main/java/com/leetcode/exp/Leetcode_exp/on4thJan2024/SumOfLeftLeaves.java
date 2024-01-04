package com.leetcode.exp.Leetcode_exp.on4thJan2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public class SumOfLeftLeaves {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        //subtree 
        TreeNode lefttree = new TreeNode(9);
        
        TreeNode righttree = new TreeNode(20);
        righttree.setLeft(new TreeNode(15));
        righttree.setRight(new TreeNode(7));
        tree.setLeft(lefttree);
        tree.setRight(righttree);
        System.out.println("Initial tree");
        TreeNode.printTree(tree);
        System.out.println();
        System.out.println("leave node sum " + sumOfLeftLeaves(tree));
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        int sum_left = 0;
        if (root == null) return 0;
        if (root.getLeft() != null) {
            if (root.getLeft().getLeft() == null && root.getLeft().getRight() == null) {
                //left leaf 
                sum_left += root.getLeft().getVal();
            }else {
                sum_left += sumOfLeftLeaves(root.getLeft());
            }
        }
        if (root.getRight() != null) {
            if (root.getRight().getLeft() != null || root.getRight().getRight() != null) {
                sum_left += sumOfLeftLeaves(root.getRight());
            }
        }

        return sum_left;
    }
    
}
