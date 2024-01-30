package com.leetcode.exp.Leetcode_exp.on30thJan2024;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/verifying-an-alien-dictionary/description/
 */
public class VerifyingAlienDictionary {
    public static void main(String[] args) {
        String words[] = {"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"};
        String order = "zkgwaverfimqxbnctdplsjyohu";
        if (isAlienSorted(words, order)) {
            System.out.println("Valid dictionary words");
        }else {
            System.out.println("Invalid dictionary words");
        }

    }
    public static boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> letters = new HashMap<>();
        int index = 0;
        for (char ch : order.toCharArray()) {
            letters.put(ch,index);
            index++;
        }
        System.out.println("letters " + letters);
        String word = words[0];
        
        for (int i=1; i< words.length;i++) {
            //char charWord[] = word.toCharArray();
            //char charWord2[] = words[i].toCharArray();
            //compare
            int j = 0;
            while ( j < word.length()) {
                System.out.println(" j = " + j + "  " + words[i].length()  );
                if (j  > words[i].length() ) return false;

                System.out.println(word.charAt(j) +  " word1 = " + letters.get(word.charAt(j))  + "  --- >  " + words[i].charAt(j) + "    word2= " + letters.get(words[i].charAt(j)) );
                if (letters.get(word.charAt(j)) - letters.get(words[i].charAt(j)) > 0) return false;
                if (letters.get(word.charAt(j)) - letters.get(words[i].charAt(j)) < 0) break;
                j++;
            }
            word = words[i];
        }
        return true;
        
    }
    
}
