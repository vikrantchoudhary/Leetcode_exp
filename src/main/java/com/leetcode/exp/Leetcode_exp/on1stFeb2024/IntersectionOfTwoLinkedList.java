package com.leetcode.exp.Leetcode_exp.on1stFeb2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

/*
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode headA = listNode;
        //listNode = listNode.getNext();
        listNode.setNext(new ListNode(1));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(8));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(4));
        listNode = listNode.getNext();
        listNode.setNext(new ListNode(5));

        ListNode listNode2 = new ListNode(5);
        ListNode headB = listNode2;
        //listNode = listNode.getNext();
        listNode2.setNext(new ListNode(6));
        listNode2 = listNode2.getNext();
        listNode2.setNext(new ListNode(1));
        listNode2 = listNode2.getNext();
        listNode2.setNext(new ListNode(8));
        listNode2 = listNode2.getNext();
        listNode2.setNext(new ListNode(4));
        listNode2 = listNode2.getNext();
        listNode2.setNext(new ListNode(5));
        //ListNode.printList(headA);
        //System.out.println();
        //ListNode.printList(headB);
        ListNode list = getIntersectionNode(headA,headB);
        //System.out.println(list.getVal());
        //System.out.println();
        ListNode.printList(list);
        
        
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode posA = headA;
        ListNode posB = headB;
        System.out.println();
        ListNode.printList(posA);
        System.out.println();
        ListNode.printList(posB);
        int it = 0;
        while (posA != posB) {
            System.out.println(" iteration " + it++);
            
            if (posA != null && posB != null) System.out.println(posA.getVal() + " " + posB.getVal());
            if (posA == null) {
                posA = headB;
            }else {
                posA = posA.getNext();
            }
            if (posB == null) {
                posB = headA;
            }else {
                posB = posB.getNext();
            }
        }
        ListNode.printList(posA);;
        return posA;
    }
    
}
