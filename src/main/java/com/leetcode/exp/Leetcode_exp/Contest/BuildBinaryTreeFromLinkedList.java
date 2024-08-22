package com.leetcode.exp.Leetcode_exp.Contest;

import java.util.LinkedList;

public class BuildBinaryTreeFromLinkedList {

    
    public static void main(String arg[]) {
        LinkedList<Node> nodeList = new LinkedList<>();
        nodeList.add(0, null);
    }
    
}
class Node {
    int data;
    Node next, prev;

    Node(int d) {
        data = d;
        next = prev = null;
    } 
   
}
