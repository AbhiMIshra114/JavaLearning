package com.company;

public class Pattern {
    public static void main(String[] args) {
        pattern1(4,0);
        pattern2(4,0);
    }
    static void pattern1(int row, int col){
        if (row==0){
            return;
        }
        if (col<row) {
            System.out.print("* ");
            pattern1(row, col + 1);
        }
        else {
            System.out.println();
            pattern1(row - 1,0);
        }
    }
    static void pattern2(int row, int col){
        if (row==0){
            return;
        }
        if (col<row) {
            pattern1(row, col + 1);
            System.out.print("* ");
        }
        else {
            pattern1(row - 1,0);
            System.out.println();
        }
    }
}
