package com.leetcode.exp.Leetcode_exp.on31stJan2024;

import java.util.List;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 */
public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        //listNode = listNode.getNext();
        listNode.setNext(new ListNode(1));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(2));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(3));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(3));
        ListNode.printList(head);
        System.out.println();
        ListNode newList = deleteDuplicates(head);
        ListNode.printList(newList);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.getNext() == null) return head;
        ListNode temp = head;
        while (head != null &&  head.getNext() != null ) {
            if (head.getVal() == head.getNext().getVal()) {
                head.setNext(head.getNext().getNext());
            }else {
               head = head.getNext();
            }
        }
        return temp;
    }
    
}
