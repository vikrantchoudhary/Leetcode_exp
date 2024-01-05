package com.leetcode.exp.Leetcode_exp.on5thJan2024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;
/*
 * https://leetcode.com/problems/find-bottom-left-tree-value/
 */
public class FindButtomLeftValue {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        
        TreeNode subLeft = new TreeNode(2);
        subLeft.setLeft(new TreeNode(4));
        TreeNode sRightLeft = new TreeNode(5);
        sRightLeft.setLeft(new TreeNode(7));
        TreeNode subRight = new TreeNode(3);
        subRight.setLeft(sRightLeft);
        subRight.setRight(new TreeNode(6));
        treeNode.setLeft(subLeft);
        treeNode.setRight(subRight);
        TreeNode.printTree(treeNode);
        System.out.println("\noutput : " + new FindButtomLeftValue().findBottomLeftValue(treeNode));
    }
    public int findBottomLeftValue(TreeNode node) {
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(node);
        if (!queue.isEmpty()){
             node = queue.poll();
            if (node.getRight()!= null) {
                queue.add(node.getRight());
            }
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
        }
    
        return node.getVal();
    }

    
}
