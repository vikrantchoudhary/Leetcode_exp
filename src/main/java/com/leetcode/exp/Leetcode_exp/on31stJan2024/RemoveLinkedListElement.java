package com.leetcode.exp.Leetcode_exp.on31stJan2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 */
public class RemoveLinkedListElement {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        //listNode = listNode.getNext();
        listNode.setNext(new ListNode(2));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(6));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(3));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(4));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(5));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(6));
        ListNode.printList(head);
        ListNode resultList = removeElements(head, 6);
        System.out.println();
        ListNode.printList(resultList);
        
    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)return null;
        ListNode temp = new ListNode(0);
        temp.setNext(head);
        ListNode prev = temp;
        while (head != null) {
            if (head.getVal() == val) {
                prev.setNext(head.getNext());
                head.setNext(head.getNext());
            }else {
                prev = head;
            }
            head = head.getNext();
        }
        return temp.getNext();
    }
    
}
