package com.leetcode.exp.Leetcode_exp.on17Jan2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

public class ReorderList {
    public static void main(String[] args) {
        ListNode head;
        ListNode listNode = new ListNode(1);
        head = listNode;
        
        listNode.setNext(new ListNode(2));
        listNode = listNode.getNext();
         listNode.setNext(new ListNode(3));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(4));
         ListNode.printList(head);
         reorderList(head);
         //System.out.println("###");
        // ListNode.printList(head);
         

    }
    public static void reorderList(ListNode head) {
        if (head == null || head.getNext() == null) return;
        ListNode l1 = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev= null;
        while (fast != null && fast.getNext() != null) {
            prev = slow;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        prev.setNext(null);
        System.out.println();
        ListNode.printList(l1);
        System.out.println();
        ListNode.printList(slow);
        ListNode l2 = reverseList(slow);
        System.out.println();
        ListNode.printList(l2);
        ListNode l3 = mergeList(l1,l2);
        //mergeTwoList(l1, l2);
        System.out.println("#### l3");
        ListNode.printList(l3);
    }
    public static ListNode reverseList (ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.getNext();
            head.setNext(prev);
            prev = head;
            head = temp;
        }
        return prev;
    }
    public static ListNode mergeList(ListNode l1, ListNode l2) {
        //ListNode l3 = new ListNode(0);
        ListNode head = l1;
        while (l1 != null ) {
            ListNode l1Next = l1.getNext();
            ListNode l2Next = l2.getNext();
            l1.setNext(l2);
            //if (l1Next == null) break;
            l2.setNext(l1Next);
            l1 = l1Next;
            l2 = l2Next;
            
        }
        return head;
    }
    public static void mergeTwoList(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode l1Next = l1.getNext();
            ListNode l2Next = l2.getNext();
            l1.setNext(l2);
            if (l1Next == null) break;
            l2.setNext(l1Next);
            l1 = l1Next;
            l2 = l2Next;
        }
    }
}
