package com.leetcode.exp.Leetcode_exp.on12thJan2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbersInList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode head = listNode;
        //listNode = listNode.getNext();
        listNode.setNext(new ListNode(4));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(6));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(7));
        ListNode.printList(head);
        ListNode listNode2 = new ListNode(5);
        ListNode head2 = listNode2;
        listNode2.setNext(new ListNode(6));
        listNode2 = listNode2.getNext();
        listNode2.setNext(new ListNode(4));
        System.out.println();
        ListNode.printList(head2);
        ListNode resultList = addTwoNumbers(head, head2);
        System.out.println();
        ListNode.printList(resultList);
        
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode3 = new ListNode(0);
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = listNode3;
        int carry = 0;
        while(l1 != null || l2 != null) {
            //listNode3.setVal(l1.getVal() + l2.getVal());
            int l1val = l1 != null ? l1.getVal():0;
            int l2val = l2 != null ? l2.getVal():0;
            int val = l1val + l2val + carry;
            carry = val / 10;
            val = val % 10;
            listNode3.setNext(new ListNode(val));
            listNode3 = listNode3.getNext();
            if (l1 != null) l1 = l1.getNext();
            if (l2 != null) l2 = l2.getNext();
        }
        if (carry > 0) {
            listNode3.setNext(new ListNode(carry));
            listNode3 = listNode3.getNext();
        }

        return head.getNext();
    }
}
