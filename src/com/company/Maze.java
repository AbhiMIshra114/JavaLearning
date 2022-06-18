package com.company;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
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
}
