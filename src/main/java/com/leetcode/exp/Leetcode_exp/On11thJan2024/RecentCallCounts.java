package com.leetcode.exp.Leetcode_exp.On11thJan2024;
import java.util.Queue;
import java.util.LinkedList;
/**
 * Design problem
 * https://leetcode.com/problems/number-of-recent-calls/description/
 */
public class RecentCallCounts {
    Queue<Integer> queue;
    public RecentCallCounts() {
        queue = new LinkedList();
    }
    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < (t - 3000))  {
            queue.poll();
        }
        return queue.size();
    }
    
}
