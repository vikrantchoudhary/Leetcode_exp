package com.leetcode.exp.Leetcode_exp.on18thJan2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

public class ReverseListII {
    public static void main(String args[]) {
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
         int left = 2;
         int right = 4;
         ListNode revLeftRight = reverseBetween(head, left, right);
         System.out.println(" ###");
         ListNode.printList( revLeftRight);

    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return head;
        ListNode prev = null;
        ListNode currNode = head;
        while (left > 1) {
            prev = currNode;
            currNode = currNode.getNext();
            left -- ;
            right --;
        }
        ListNode last = prev;
        //prev.setNext(null);
        ListNode head2 = currNode;
        while (right > 0) {
            ListNode next_node = currNode.getNext();
            currNode.setNext(prev);
            prev = currNode;
            currNode = next_node;
            right --;
        }
        if (last != null) {
            last.setNext(prev);
        }else {
            head =prev;
        }
       // prev2.setNext(null);

       // ListNode l2 = reverseList(head2);
        //prev.setNext(l2);
        //l2.setNext(currNode);
        //prev2.setNext(currNode);
        head2.setNext(currNode);
        return head;

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
