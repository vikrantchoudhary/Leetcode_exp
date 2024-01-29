package com.leetcode.exp.Leetcode_exp.on20thJan2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

public class RemoveKElementInList {
    public static void main(String[] args) {
         ListNode head;
        ListNode listNode = new ListNode(1);
        head = listNode;
        
        listNode.setNext(new ListNode(2));
        listNode = listNode.getNext();
         listNode.setNext(new ListNode(3));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(4));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(5));
         ListNode.printList(head);

         head = removeNthFromEnd(head, 2);
         System.out.println();
         ListNode.printList(head);

    }

    /*public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int k =0;
        if (head == null || head.getNext() == null || n < 1) return head;
        while (head != null  && k < n) {
            head  = head.getNext();
            k++;
        }
        System.out.println(k);
        if (head == null || head.getNext() == null) return null;
        head.setNext(head.getNext().getNext());
       
        return temp;
    }*/
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //ListNode temp = head ;
        int k =0 ;
        ListNode  slow = head;
        ListNode fast = head; 
        while (fast!= null && k < n ) {
            fast = fast.getNext();
            k++;
        }
        if (fast == null) return head.getNext();
        while (fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        slow.setNext(slow.getNext().getNext());
        return head ;
    }
    
}
