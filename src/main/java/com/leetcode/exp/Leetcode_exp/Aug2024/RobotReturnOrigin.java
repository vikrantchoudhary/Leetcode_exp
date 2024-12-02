package com.leetcode.exp.Leetcode_exp.Aug2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RobotReturnOrigin {
    public static void main(String[] args) {
        String moves = "UUDLLDRDUR";
        if (judgeCircle(moves)) {
            System.out.println("Success ");
        }else {
            System.out.println("Not sucessful");
        }
        
    }
    public static boolean judgeCircle(String moves) {
        //Stack<Character> stack = new Stack<>();
        //Map<Character,Character> valid_moves = Map.of('U','D','D','U','L','R','R','L');
        // up = +1, d = -1 , l = +2 , R = -2
        
        for (char c : moves.toCharArray()) {
            if (c == 'U') {

            }
        }
        return false;
    }
    
}
