package com.company;

public class SolveSudoku {
    public static void main(String[] args) {

    }
    public boolean helper(char[][] board,int row,int col){
        int nRow = 0;
        int nCol = 0;
        if (col != board.length-1){
            nRow = row;
            nCol = col + 1;
        } else{
            nRow = row + 1;
            nCol = 0;
        }

        if (board[row][col] != '.'){
            if (helper(board,nRow,nCol)){
                return true;
            }
        }else {
            for (int i = 1; i <= 9; i++){

            }
        }
        return false;
    }
    public void solveSudoku(char[][] board){
        helper(board,0,0);
    }
}
