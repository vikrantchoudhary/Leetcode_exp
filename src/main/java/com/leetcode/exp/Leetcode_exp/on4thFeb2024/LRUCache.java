package com.leetcode.exp.Leetcode_exp.on4thFeb2024;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/lru-cache/
 */
public class LRUCache {
    final ListNode head = new ListNode();
    final ListNode tail = new ListNode();
    HashMap<Integer,ListNode> LRUCacheMap;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        LRUCacheMap = new HashMap<>(capacity);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        int result = -1;
        ListNode listNode = LRUCacheMap.get(key);
        if (listNode != null) {
            remove(listNode);
            result = listNode.value;
            // put into front and update the list
            add(listNode);
        }
        return result;
    }
    
    public void put(int key, int value) {
        ListNode listNode = LRUCacheMap.get(key);
        //update & put into front
        if (listNode != null) {
            remove(listNode);
            listNode.value = value;
            add(listNode);
        }else {
            ListNode new_node = new ListNode();
            new_node.value = value;
            new_node.key = key;
            if (LRUCacheMap.size() == capacity) {
                LRUCacheMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            add(new_node);

        }
    }
    public void  add (ListNode node) {
        ListNode head_next = head.next;
        head_next.prev = node;
        node.next = head_next;
        node.prev = head;
        head.next = node;
        LRUCacheMap.put(node.key, node);

    }
    public void remove(ListNode node) {
        ListNode prev_node = node.prev;
        ListNode next_node = node.next;
        LRUCacheMap.remove(node.value);
        prev_node.next = next_node;
        next_node.prev = prev_node;
    }
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache);
        System.out.println(lruCache.get(1));
        lruCache.put(3,3);
        System.out.println(lruCache);
        System.out.println(lruCache.get(2));
        lruCache.put(4,4);
        System.out.println(lruCache);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));
    }
}
class ListNode {
    int key;
    int value;
    ListNode prev;
    ListNode next;
    ListNode() {

    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */