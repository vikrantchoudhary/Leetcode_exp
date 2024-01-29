package com.leetcode.exp.Leetcode_exp.on20thJan2024;

import com.leetcode.exp.Leetcode_exp.genericClassInUse.ListNode;

public class NextGreaterNode {
    public static void main(String[] args) {
        ListNode head;
        ListNode listNode = new ListNode(2);
        head = listNode;
        
        listNode.setNext(new ListNode(7));
        listNode = listNode.getNext();
         listNode.setNext(new ListNode(4));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(3));
         listNode = listNode.getNext();
         listNode.setNext(new ListNode(5));
         ListNode.printList(head);
         int [] nextGreaterNode = nextLargerNodes(head);
         for (int i: nextGreaterNode) {
            System.out.println(i);
         }
    }
    public static int[] nextLargerNodes(ListNode head) {
        ListNode list = head;
        int n = 0; //size of list
        while (list != null) {
            n++;
            list = list.getNext();
        }
        int [] result = new int[n];
        int i = 0, j = i;
        list = head;
        while(list != null) {
            //int nodeVal = list.getVal();
            
            if (result[i] < list.getVal()) {
                result[i] = list.getVal();
                i++;
                j = i;
                continue;
            }
            if ( j >= n) {
                result[i] = -1;
                list = head;
                j = i;
                i++;
                
            } else {
            j++;
            list = list.getNext();
            }
        } 
        return result;
    }
    
}
