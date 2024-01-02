package com.leetcode.exp.Leetcode_exp.on2ndJan2024;

import java.util.LinkedList;
import java.util.Queue;
/**
 * https://leetcode.com/problems/find-bottom-left-tree-value/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left,TreeNode right) { this.val = val; this.left = left; this.right = right;}
}
public class FindButtomLeftTree {
    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(1);
        //treeNode.root = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        //treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        System.out.println( "bottom node " + findBottomLeftValue(treeNode));
    }
    public static int findBottomLeftValue(TreeNode treeNode){
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            treeNode = queue.poll();
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
        }
        return treeNode.val;

    }
    public static void printTree(TreeNode root) {
        
    }
    
}
