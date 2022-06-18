package com.company;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
        System.out.println();
        printPaths("",3,3);
    }
    static int countPaths(int r, int c){

        if (r == 1 || c == 1)
            return 1;

        // count paths downwards
        int downPaths = countPaths(r-1,c);
        // count paths rightwards
        int rightPaths = countPaths(r,c-1);
        return downPaths+rightPaths;
    }
    static void printPaths(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return ;
        }
        if (r > 1){
            printPaths(p+'D',r-1,c);
        }
        if (c > 1){
            printPaths(p+'R',r,c-1);
        }
    }
}
