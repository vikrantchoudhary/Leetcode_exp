package com.leetcode.exp.Leetcode_exp.on3rdJan2024;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-width-of-binary-tree/
 */
import  com.leetcode.exp.Leetcode_exp.genericClassInUse.TreeNode;
public class MaxWidthBT {
    static Map<Integer,Integer> level = new HashMap<>();
    public static void main(String[] args) {
       TreeNode tree = new TreeNode(1);
        //subtree 
        TreeNode lefttree = new TreeNode(3);
        lefttree.setLeft(new TreeNode(5));
        lefttree.setRight(new TreeNode(3));
        TreeNode righttree = new TreeNode(2);
        righttree.setRight(new TreeNode(9));
        tree.setLeft(lefttree);
        tree.setRight(righttree);
        System.out.println("Max width : " + widthOfBinaryTree(tree) );
    }
    //DFS way : iterate over all nodes and use hashmap to save most left index
    //
    public static int widthOfBinaryTree(TreeNode root) {
         return lookUpDepth_dfs(root,1,1);
    }
    public static int lookUpDepth_dfs(TreeNode tree,int dept, int index) {
        if (tree == null) return 0;
        level.putIfAbsent(dept, index);
        int leftCount = lookUpDepth_dfs(tree.getLeft(), dept+1, index *2);
        int rightCount = lookUpDepth_dfs(tree.getRight(), dept+1, index*2 +1);
        return Math.max(index - level.get(dept) + 1, Math.max(leftCount,rightCount));

    }
    
}
