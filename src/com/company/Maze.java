package com.company;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(countPaths(3,3));
//        System.out.println();
//        printPaths("",3,3);
//        System.out.println(printPathsRet("",3,3));
//        System.out.println(countPathsDiagonal(3,3));
//        System.out.println(countPathMazeWithObstacle(0,0,3,3));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestrictions("",board,0,0);

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
    static int countPathsDiagonal(int r, int c){

        if (r == 1 || c == 1)
            return 1;

        // count paths downwards
        int downPaths = countPathsDiagonal(r-1,c);
        // count paths rightwards
        int rightPaths = countPathsDiagonal(r,c-1);
        // count paths diagonal
        int diagPaths = countPathsDiagonal(r-1,c-1);
        return downPaths+rightPaths+diagPaths;
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
    static int countPathMazeWithObstacle(int r, int c, int R, int C){
        if (r==R-1 || c==C-1) {
            return 1;
        }
        if (r==1 && c==1) {
            return 0;
        }
        int downPath = countPathMazeWithObstacle(r+1,c,R,C);
        int rightPath = countPathMazeWithObstacle(r,c+1,R,C);
        return downPath + rightPath;
    }
    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if (r < maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if (c < maze.length-1){
            pathRestrictions(p+'R',maze,r,c+1);
        }
    }
}
