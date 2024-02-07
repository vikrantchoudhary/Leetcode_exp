package com.leetcode.exp.Leetcode_exp.on5thFeb2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestWordDictionary {
    public static void main(String[] args) {
        //String [] words = {"b","br","bre","brea","break","breakf","breakfa","breakfas","breakfast","l","lu","lun","lunc","lunch","d","di","din","dinn","dinne","dinner"};
        String[] words = {"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"};
        System.out.println(" ### " + longestWord(words));
    }
    public static String longestWord(String[] words) {
        String result=null ;
        if (words.length ==0) return null;
       
        Arrays.sort(words);
        String word = words[0];
        int count=0, max_count= -1;
        HashMap <Integer,String> hashMap = new HashMap<>();
        for (int i = 1 ; i< words.length;i++) {
            if (words[i].indexOf(word) == 0){
                if (words[i].length() > word.length()) {
                    word = words[i];
                    result = words[i];
                    count++;
                    max_count = Math.max(max_count,count);
                    hashMap.put(count,words[i]);
                }
                
            }
            if (words[i].length() == 1) {
                word = words[i];
                result = words[i];
                count =1;
                hashMap.put(count,words[i]);
            }
        }
        System.out.println(hashMap);
        if (count > 0) return hashMap.get(max_count);
        return "";
    }
    public static String longestWord2(String[] words) {
        String result="";
        Arrays.sort(words);
        HashSet<String>buildWords = new HashSet<>();
        for (String word: words) {
            if (word.length() == 1 || 
            buildWords.contains(word.subSequence(0, word.length() -1))) {
                if (word.length() > result.length())result = word;
                buildWords.add(word);
            }
        }
        return result;
    }
    
}
