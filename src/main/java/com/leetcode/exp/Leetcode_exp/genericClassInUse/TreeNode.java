package com.leetcode.exp.Leetcode_exp.genericClassInUse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {this.val = val;}
    public static void printTree(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root); 
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null ) {
                System.out.print(" null ");
                
            } else {
                if (node.left != null) {
                    queue.add(node.left);
                }else {
                    if (node.right != null) {
                        queue.add(null);
                    }
            }
            if (node.right != null) {
                queue.add(node.right);
            }else {
                if (node.left != null) {
                        queue.add(null);
                    }
            }
                System.out.print(node.val + " ");
            }
            
        }
        
    }
}
