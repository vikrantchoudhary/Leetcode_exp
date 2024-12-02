package com.leetcode.exp.Leetcode_exp.Aug2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;

public class BTPreOrder {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        
        TreeNode righttree = new TreeNode(2);
        righttree.setLeft(new TreeNode(3));
        tree.setRight(righttree);
        TreeNode.printTree(tree);
        List<Integer> btPreOrder = BuildPreOderTree(tree);
        System.out.println();
        System.out.println(btPreOrder);
    }
    public static List<Integer> BuildPreOderTree(TreeNode tree) {
        if (tree == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();
        stack.push(tree);
        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            output.add(t.getVal());
            if (t.getRight() != null) {
                stack.push(t.getRight());
            }
            if (t.getLeft() != null) {
                stack.push(t.getLeft());
            }
        }
        return output; 

    }
    
}
