package com.leetcode.exp.Leetcode_exp.Aug2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

public class AddTwoNumberLinkedList {
    public static void main(String[] args) {
         ListNode head;
        ListNode listNode = new ListNode(2);
        head = listNode;
        
        listNode.setNext(new ListNode(4));
        listNode = listNode.getNext();
         listNode.setNext(new ListNode(6));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(4));

         ListNode head2;
         ListNode listNode2 = new ListNode(5);
         head2 = listNode2;
         listNode2.setNext(new ListNode(6));
         listNode2 = listNode2.getNext();
         listNode2.setNext(new ListNode(4));
         ListNode.printList(head);
         System.out.println();
         ListNode.printList(head2);
         System.out.println();
         ListNode result= addTwoNumbers(head2, head);
         
         ListNode.printList(result);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null &&  l2 == null) return null;
        ListNode result = new ListNode(0);
        ListNode resultHead = result;
        int queo=0,rem = 0 ;
        while (l1 != null || l2 != null) {
            int l1Val = l1 != null ? l1.getVal():0;
            int l2Val = l2 != null ? l2.getVal():0;
            rem = (l1Val + l2Val + queo)%10;
            queo = (l1Val + l2Val + queo)/10;
            ListNode node = new ListNode(rem);
            result.setNext(node);
            if (l1 != null) l1 = l1.getNext();
            if (l2 != null) l2 = l2.getNext();
            result = result.getNext();
            
        }
        if (queo != 0) {
            result.setNext(new ListNode(queo));
        }
        return resultHead.getNext();
    }
    
}
