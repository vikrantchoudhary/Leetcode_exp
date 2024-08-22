package com.leetcode.exp.Leetcode_exp.on28Apr2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/same-tree/
 */
public class SameTree {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(1);
        tree1.setLeft(new TreeNode(2));
        tree1.setRight(new TreeNode(1));
        tree2.setLeft(new TreeNode(2));
        tree2.setRight(new TreeNode(1));
        System.out.println("Both tree are same " + isSameTree(tree1, tree2));

    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.getVal() != q.getVal()) return false;
        return isSameTree(p.getLeft(),q.getLeft()) && isSameTree(p.getRight(), q.getRight());
    }
    
}
