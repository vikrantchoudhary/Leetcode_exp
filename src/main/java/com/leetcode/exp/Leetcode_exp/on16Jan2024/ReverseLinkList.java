package com.leetcode.exp.Leetcode_exp.on16Jan2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 */
public class ReverseLinkList {
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
         ListNode reverse = reverseList(head);
         System.out.println();
         ListNode.printList(reverse);
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.getNext();
            head.setNext(prev);
            prev = head;
            head = temp;
        }
        return prev;
    }
    
}
