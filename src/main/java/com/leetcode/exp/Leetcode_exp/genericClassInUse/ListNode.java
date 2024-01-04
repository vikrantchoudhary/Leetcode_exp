package com.leetcode.exp.Leetcode_exp.genericClassInUse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode addNode(ListNode list,int val) {
        ListNode newList = new ListNode(val);
        if (list == null) {
            return newList;
        }
        ListNode head = list;
        while (list.next != null){
            list = list.next;
        }
        list.next = newList;
        return head;
    }
    public static void printList(ListNode list) {
        while (list!= null) {
            System.out.print(list.val + " --> ");
            list = list.next;
        }
    }
    
}
