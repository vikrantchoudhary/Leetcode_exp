package com.leetcode.exp.Leetcode_exp.on2ndJan2024;

import java.util.TreeMap;

/**
 * https://leetcode.com/problems/hand-of-straights
 * Problem: arranging consecutive cards with the given size
 * Approach: 
 * 1. Ordered Map to store all the cards
 * 2. arrange consecutive card  from each map of size m and reduce the count
 * 3. return false if no such arrangement.
 * 
 */
public class HandOfStraights {
    public static void main(String args[]) {
        //case 1:
        int hand[] = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        //case 2: 
        int hand1[] = {1,2,3,4,5};
        int groupSize1 =4;
        if (isNStraightHand(hand,groupSize)){
            System.out.println("Found consecutive sets with size " + groupSize);
        }else {
            System.out.println("Failed to get consecutive sets of size "  +groupSize);
        }

    }
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        
        TreeMap<Integer,Integer> countMap = new TreeMap<>();
        //initialize Map 
        for (int card: hand ) {
            if (countMap.containsKey(card)){
                countMap.put(card,countMap.get(card) +1);
            }else {
                countMap.put(card, 1);
            }
        }
        while (!countMap.isEmpty()){
            int currentCard = countMap.firstKey();
            for (int i = currentCard; i <currentCard+ groupSize;i++) {
                if (!countMap.containsKey(i)) return false;
                if (countMap.get(i) == 1) {
                    countMap.remove(i);
                }else {
                    countMap.replace(i, countMap.get(i) -1);
                }
            }
        }

        return true;
    }

    
}
