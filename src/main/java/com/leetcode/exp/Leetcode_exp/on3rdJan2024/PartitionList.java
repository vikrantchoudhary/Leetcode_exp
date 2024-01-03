package com.leetcode.exp.Leetcode_exp.on3rdJan2024;
/**
 * https://leetcode.com/problems/partition-list/
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val,ListNode next) {this.val = val;this.next = next;}
}
public class PartitionList {
    public static void main(String[] args) {
        ListNode inputList = new ListNode(1);
        addNode(inputList, 4);
        addNode(inputList, 3);
        addNode(inputList, 2);
        addNode(inputList, 5);
        addNode(inputList, 2);
        System.out.println("Initial List : " );
        
        printNode(inputList);

        System.out.println("Partition List : " );
        ListNode resultList = partition(inputList,3);
         printNode(resultList);

        
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode beforeX = new ListNode(0);
        ListNode beforeXhead = beforeX;
        ListNode afterX = new ListNode(0);
        ListNode afterXhead = afterX;
        while (head != null) {
            if (head.val < x) {
                beforeX.next= head;
                beforeX = beforeX.next;
            }else {
                afterX.next =head;
                afterX = afterX.next;
            }
            head = head.next;
        }
        afterX.next = null;
        beforeX.next = afterXhead.next;
        return beforeXhead.next;
    }
    public static void addNode(ListNode list , int n) {
        ListNode listNode = new ListNode(n);
        if (list == null) list = listNode;
        ListNode head = list;
        while (list.next != null) {
            list = list.next;
            head = list;
        }
        list.next = listNode;
    }
    public static void printNode(ListNode list) {
        while (list!= null) {
            System.out.print(list.val + " --> ");
            list = list.next;
        }
        System.out.println();
    }
    
}
