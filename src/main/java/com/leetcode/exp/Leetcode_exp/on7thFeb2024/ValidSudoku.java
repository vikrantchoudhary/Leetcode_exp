package com.leetcode.exp.Leetcode_exp.on7thFeb2024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {

  public static void main(String[] args) {
    //char[][] board = {{'.','.','.','.','5','.','.','1','.'},{'.','4','.','3','.','.','.','.','.'},{'.','.','.','.','.','3','.','.','1'},{'8','.','.','.','.','.','.','2','.'},{'.','.','2','.','7','.','.','.','.'},{'.','1','5','.','.','.','.','.','.'},{'.','.','.','.','.','2','.','.','.'},{'.','2','.','9','.','.','.','.','.'},{'.','.','4','.','.','.','.','.','.'}};
    char[][] board = {{'5','3','.','.','7','.','.','.','.'}
    ,{'6','.','.','1','9','5','.','.','.'}
    ,{'.','9','8','.','.','.','.','6','.'}
    ,{'8','.','.','.','6','.','.','.','3'}
    ,{'4','.','.','8','.','3','.','.','1'}
    ,{'7','.','.','.','2','.','.','.','6'}
    ,{'.','6','.','.','.','.','2','8','.'}
    ,{'.','.','.','4','1','9','.','.','5'}
    ,{'.','.','.','.','8','.','.','7','9'}};
    if (isValidSudoku2(board)) {
      System.out.println("valid sudoku");
    } else {
      System.out.println("Invalid sudoku");
    }
  }

  public static boolean isValidSudoku(char[][] board) {
    if (board.length != 9 || board[0].length != 9) return false;
    //3*3 matrix
    HashMap<Character, Integer> numberMapRow = new HashMap<>();
    HashMap<Character, Integer> numberMapCol = new HashMap<>();
    HashMap<Character,Integer> matix3x3 =  new HashMap<>();
    
    //check each row
    int k = 0;
    //each column
    while (k < 9) {
      for (int i = 0; i < 9; i++) {
        if (numberMapRow.containsKey(board[i][k])) return false;
        if (board[i][k] != '.')numberMapRow.put(board[i][k],1);
        //System.out.print(board[i][k] + " ");
      }
       for (int i= 0 ; i<9;i++) {
        if (board[k][i] != '.' && numberMapCol.containsKey(board[k][i])) return false;
        if (board[k][i] != '.')numberMapCol.put(board[k][i],1);
        //System.out.print(board[k][i] + " ");
       }
      k++;
      numberMapRow = new HashMap<>();
      numberMapCol = new HashMap<>();
    }

    k =1;
    int l = 0;
    while (k <=3 ) {
        for (int i = l ; i < 3*k ; i++ ) {
            for (int j = l; j<3*k; j++) {
                if (matix3x3.containsKey(board[i][j])) return false;
                if (board[i][j] != '.')matix3x3.put(board[i][j],1);
            }
        }
        System.out.println(l);
        k++;
        System.out.println("--- " + matix3x3);
        matix3x3 = new HashMap<>();
    }
   
    return true;
  }
  public static boolean isValidSudoku2(char[][] board) {
    Set seen = new HashSet<>();
    for (int i = 0; i<9;i++) {
        for (int j = 0; j<9;j++) {
            if (board[i][j] != '.') {
                if ((!seen.add(board[i][j] + " row" + i)) || (!seen.add(board[i][j] + " column" + j)) || (!seen.add(board[i][j] + " block" + i/3 + "- " +  j/3))){
                    return false;
                }
                System.out.println(seen);
            }
        }
    }
    return true;
  }
  
}
