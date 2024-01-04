package com.leetcode.exp.Leetcode_exp.on4thJan2024;

import java.util.List;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;
/**
 * https://leetcode.com/problems/sort-list/
 */

public class SortList {
    public static void main(String[] args) {
        ListNode head;
        ListNode listNode = new ListNode(4);
        head = listNode;
        
        listNode.setNext(new ListNode(2));
        listNode = listNode.getNext();
         listNode.setNext(new ListNode(1));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(3));
         System.out.println("Initial list");
         ListNode.printList(head);
          System.out.println("Sorted list");
          ListNode.printList(sortList(head));
         
    }
    public static ListNode sortList(ListNode head) {
        if (head == null || head.getNext() == null) return head;
        ListNode list = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            list = slow;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        list.setNext(null);
        ListNode.printList(head);
        System.out.println("\n \n");
        ListNode.printList(slow);
        System.out.println("\n \n");
        ListNode leftHalf = sortList(head);
        ListNode rightHalf = sortList(slow);
        return mergeList(leftHalf,rightHalf);
    }
    public static ListNode  mergeList(ListNode left, ListNode right) {
        
        ListNode sortedList = new ListNode(0);
        ListNode currentList = sortedList;
        while (left != null && right!= null) {
            if (left.getVal() < right.getVal()) {
                currentList.setNext(left);
                left = left.getNext();
            }else {
                currentList.setNext(right);
                right = right.getNext();
            }
            currentList = currentList.getNext();

        }
        if (left != null) {
            currentList.setNext(left);
            left = left.getNext();
        }
        if (right != null) {
           currentList.setNext(right);
           right = right.getNext();
        }
        return sortedList.getNext();

    }
    
}
