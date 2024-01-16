package com.leetcode.exp.Leetcode_exp.on16Jan2024;
/**
 * https://leetcode.com/problems/word-search/description/
 */
public class WordSearch {
    static boolean visited[][];
    public static void main(String[] args) {
        char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        if (exist(board,word)) {
            System.out.println("Found the word " + word);
        }else {
            System.out.println("Not found ");
        }
    }
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        visited = new boolean[rows][ cols];
        char[] wordArray = word.toCharArray();
        for (int i =0; i < rows;i++) {
            for (int j =0; j< cols; j++) {
                if (board[i][j]== wordArray[0] && searchWord(i,j,0,word,board)) return true;
            }
        }
        return false;
        
    }
    public static boolean searchWord(int i, int j, int index,String word, char[][] board) {
        if (index == word.length()) return true;
        if (i < 0 || j <0 || i>= board.length || j >= board[0].length || visited[i][j] || word.charAt(index) != board[i][j] ) return false;
        visited[i][j] = true;
        if (
            searchWord(i+1, j, index+1, word, board) ||
            searchWord(i-1, j, index+1, word, board) ||
            searchWord(i, j+1, index+1, word, board) ||
            searchWord(i, j-1, index+1, word, board)
        ){
            return true;
        }
        visited[i][j] =false;
        return false;
    }
    
}
