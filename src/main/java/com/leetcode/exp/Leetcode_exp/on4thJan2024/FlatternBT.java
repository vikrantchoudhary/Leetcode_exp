package com.leetcode.exp.Leetcode_exp.on4thJan2024;

import java.util.Stack;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;

/**
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 * 
 * output : 
 Initial tree
1 2 5 3 4  null 6 
Flattern tree
1  null 2  null 3  null 4  null 5  null 6 %    
 */
public class FlatternBT {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        //subtree 
        TreeNode lefttree = new TreeNode(2);
        lefttree.setLeft(new TreeNode(3));
        lefttree.setRight(new TreeNode(4));
        TreeNode righttree = new TreeNode(5);
        righttree.setRight(new TreeNode(6));
        tree.setLeft(lefttree);
        tree.setRight(righttree);
        System.out.println("Initial tree");
        TreeNode.printTree(tree);
        flatten(tree);
        System.out.println("\nFlattern tree");
         TreeNode.printTree(tree);
    }
    public static void flatten(TreeNode root) {
        if (root == null) System.out.println("null");
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.getRight() != null) stack.push(node.getRight());
            if (node.getLeft() != null) stack.push(node.getLeft());
            if (!stack.isEmpty()) {
                node.setRight(stack.peek());
            }
            node.setLeft(null);
        }
        /*while (!stack.isEmpty()) {
            System.out.print(stack.pop().getVal() + " ");
            
        }*/
    }

}
