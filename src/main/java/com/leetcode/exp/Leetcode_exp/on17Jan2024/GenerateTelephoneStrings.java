package com.leetcode.exp.Leetcode_exp.on17Jan2024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenerateTelephoneStrings {

    public static void main(String[] args) {
        String digits = "";
        
        List<String> geneStrings = letterCombinations(digits);
        for (String s : geneStrings) {
            System.out.println(s);
        }
    }
    
    public static List<String> letterCombinations(String digits) {
        //List<String> output = new ArrayList<>();
        if (digits.length() < 1) return null;
        LinkedList<String> output = new LinkedList<>();
        String[] digit_map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        output.add(""); // empty string added 
        for (int i =0 ; i<digits.length();i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (output.peek().length() == i) {
                String perString = output.remove();
                for (char c : digit_map[index].toCharArray()) {
                    output.add(perString + c);
                }
            }

        }
        return output;
    }
}
