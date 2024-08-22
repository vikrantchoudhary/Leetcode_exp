package com.leetcode.exp.Leetcode_exp.Aug2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

public class OddEvenLInkedLIst {
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
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(6));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(7));
         System.out.println("Initial list");
         ListNode.printList(head);
         ListNode oddEvenList = OddEvenList(head);
         System.out.println();
         ListNode.printList(oddEvenList);
         System.out.println();
    }
    private static ListNode OddEvenList(ListNode head) {
        if (head == null ) return head; 
        ListNode odd = head;
        ListNode even = odd.getNext();
        ListNode evenHead = even;
        while (even!= null &&  even.getNext() != null ) {
                odd.setNext(even.getNext());
                odd = odd.getNext();
                even.setNext(odd.getNext());
                even = even.getNext();
        }
        System.out.println("###");
        odd.setNext(evenHead);
        return head;
    }
}
