package com.leetcode.exp.Leetcode_exp.Aug2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode head;
        ListNode listNode = new ListNode(1);
        head = listNode;
        
        listNode.setNext(new ListNode(1));
        listNode = listNode.getNext();
         listNode.setNext(new ListNode(3));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(4));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(5));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(5));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(7));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(7));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(7));
         ListNode.printList(head);
         System.out.println();
         ListNode newList = deleteDuplicates(head);
         ListNode.printList(newList);

    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode result = head;
        while (head != null && head.getNext() != null) {
            if (head.getVal() == head.getNext().getVal()) {
                head.setNext(head.getNext().getNext());
            }else {
                head = head.getNext();
            }
        }
        return result;
    }
    
}
