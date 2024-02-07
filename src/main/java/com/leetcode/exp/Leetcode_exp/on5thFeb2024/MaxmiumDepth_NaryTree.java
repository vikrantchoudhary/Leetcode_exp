package com.leetcode.exp.Leetcode_exp.on5thFeb2024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/
 */
public class MaxmiumDepth_NaryTree {

  public static int max_depth;

  public static void main(String[] args) {
    Node node = new Node(1);
    List<Node> children = new ArrayList<>();
    Node node3 = new Node(3);

    List<Node> subchildren = new ArrayList<>();
    subchildren.add(new Node(5));
    subchildren.add(new Node(6));
    node3.children = subchildren;
    children.add(node3);

    children.add(new Node(2));
    children.add(new Node(4));
    node.children = children;

    printTree(node);
  }

  public static void printTree(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      if (node == null) {
        System.out.print(" null ");
      } else {
        System.out.print(node.val + " --> ");
        if (node.children == null) return;
        for (Node child : node.children) {
          System.out.print(" -- > " + child.val);
          //printTree(child);
          queue.add(child);
        }
      }
    }
  }

  public void getMaxDepthDFS(Node node, int depth) {
    if (node == null) return;
    max_depth = Math.max(depth, max_depth);
    for (Node child : node.children) {
      getMaxDepthDFS(child, depth + 1);
    }
  }

  public int getMaxDepthBFS(Node root) {
    if (root == null) return 0;
    int max_depth = 0, depth = 1;
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      max_depth = Math.max(depth, max_depth);
      for (int i = 0; i < size; i++) {
        Node node = queue.poll();
        for (Node child : node.children) {
          queue.add(child);
        }
      }
      depth++;
    }
    return max_depth;
  }
}

class Node {

  public int val;
  public List<Node> children;

  public Node() {}

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }

  public void addNode(Node node) {}
}
