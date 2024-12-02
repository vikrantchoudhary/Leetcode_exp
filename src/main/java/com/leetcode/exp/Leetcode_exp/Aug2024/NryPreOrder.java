package com.leetcode.exp.Leetcode_exp.Aug2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NryPreOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.child.add(new Node(2));
        root.child.add(new Node(3));
        root.child.add(new Node(4));
 
        root.child.get(0).child.add(new Node(5));
        root.child.get(0).child.get(0).child.add(
            new Node(10));
        root.child.get(0).child.add(new Node(6));
        root.child.get(0).child.get(1).child.add(
            new Node(11));
        root.child.get(0).child.get(1).child.add(
            new Node(12));
        root.child.get(0).child.get(1).child.add(
            new Node(13));
        root.child.get(2).child.add(new Node(7));
        root.child.get(2).child.add(new Node(8));
        root.child.get(2).child.add(new Node(9));
        System.out.println(preorder(root));
        
    }
    public static List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            output.add(node.val);
            Collections.reverse(node.child);
            for (Node ch_node: node.child) {
                stack.push(ch_node);
            }
        }
        return output;
    }
    
}
class Node {
    public int val;
    public List<Node> child;

    public Node() {}

    public Node(int _val) {
        val = _val;
        child = new ArrayList<>();
    }

    public Node(int _val, List<Node> child) {
        this.val = _val;
        this.child = child;
    }
}
