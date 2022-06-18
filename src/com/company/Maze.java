package com.company;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(countPaths(3,3));
//        System.out.println();
//        printPaths("",3,3);
        System.out.println(printPathsRet("",3,3));
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
    static ArrayList<String> printPathsRet(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(printPathsRet(p+'D',r-1,c));
        }
        if (c > 1){
            list.addAll(printPathsRet(p+'R',r,c-1));
        }
        return list;
    }
}
