package com.leetcode.exp.Leetcode_exp.on3rdJan2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;

/**
 * https://leetcode.com/problems/distribute-coins-in-binary-tree
 * 
 */
public class DistributeCoinsBST {
    static int num_coins=0;
    public static void main(String[] args) {
        //case1:
       /*  TreeNode treeNode = new TreeNode(0);

        treeNode.setLeft(new TreeNode(3));
        treeNode.setRight(new TreeNode(0)); */

        //case2:
        TreeNode treeNode = new TreeNode(3);

        treeNode.setLeft(new TreeNode(0));
        treeNode.setRight(new TreeNode(0));


        System.out.println("steps : " + distributeCoins(treeNode));
        
    }
    public static int distributeCoins(TreeNode root) {
        getCoinsData(root);
        return num_coins;
    }
    public static int getCoinsData(TreeNode tree) {
        if (tree == null) return 0;
        int left = getCoinsData(tree.getLeft());
        int right = getCoinsData(tree.getRight());
        num_coins += Math.abs(left) + Math.abs(right);
        return tree.getVal() + left + right -1;
    }
    
}
