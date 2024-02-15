package com.leetcode.exp.Leetcode_exp.on7thFeb2024;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        char[][] board = {{'.','.','.','.','5','.','.','1','.'},{'.','4','.','3','.','.','.','.','.'},{'.','.','.','.','.','3','.','.','1'},{'8','.','.','.','.','.','.','2','.'},{'.','.','2','.','7','.','.','.','.'},{'.','1','5','.','.','.','.','.','.'},{'.','.','.','.','.','2','.','.','.'},{'.','2','.','9','.','.','.','.','.'},{'.','.','4','.','.','.','.','.','.'}};
    
        Set<String> set = new HashSet<>();
        /*set.add(5);
        set.add(6);
        set.add(7);
        System.out.println(set);
        if (set.add(5)) {
            System.out.println("able");
        }else {
            System.out.println("unable");
        }*/
        for (int i= 0; i< 9 ;i++) {
            for (int j =0;j<9;j++) {
                if (board[i][j] != '.') {
                    //if (!set.add(board[i][j] + "R" + i) || (!set.add(board[i][j]+"C"+j))) {
                    if (!set.add(board[i][j]+"R" + i/3 + "C"+j/3)) {   
                        System.out.println("add");
                    }else {
                        System.out.println("### " + set);
                    }
                }
            }
        }
        System.out.println(set);
    }
    
}
