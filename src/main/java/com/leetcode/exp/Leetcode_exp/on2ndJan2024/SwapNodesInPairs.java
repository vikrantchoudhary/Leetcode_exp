package com.leetcode.exp.Leetcode_exp.on2ndJan2024;

import java.util.List;

/**
 * swap-nodes-in-pairs : https://leetcode.com/problems/swap-nodes-in-pairs
 * Swaps the nodes in pairs
 */
class ListNode{
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {this.val = val;}
    ListNode(int val,ListNode next) {this.val = val; this.next = next;}
}
public class SwapNodesInPairs {
    public static void main(String args[]) {
        ListNode inputList = new ListNode(1);
        addNode(inputList, 2);
        addNode(inputList, 3);
        addNode(inputList, 4);
        System.out.println("Initial List : " );
        
        printNode(inputList);

        System.out.println("After swaping the List : " );
        ListNode result = swapPairs(inputList);
        printNode(result);


    }
    public static void addNode(ListNode list , int n) {
        ListNode listNode = new ListNode(n);
        if (list == null) list = listNode;
        ListNode head = list;
        while (list.next != null) {
            list = list.next;
            head = list;
        }
        list.next = listNode;
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode curNode = result;
        ListNode firstNode,secondNode;
        while(curNode.next != null && curNode.next.next != null) {
            firstNode = curNode.next;
            secondNode = curNode.next.next;
            firstNode.next = secondNode.next;
            curNode.next = secondNode;
            curNode.next.next = firstNode;
            curNode = curNode.next.next;
        }
        return result.next;
    }
    public static void printNode(ListNode list) {
        while (list!= null) {
            System.out.print(list.val + " --> ");
            list = list.next;
        }
        System.out.println();
    }
    
}

/**
 * output: 
 * Initial List : 
1 --> 2 --> 3 --> 4 --> 
After swaping the List : 
2 --> 1 --> 4 --> 3 --> 
 */
