package com.company;

public class CountPathsInMaze {
    public static void main(String[] args) {
        System.out.println(countPaths(0,0,3,3));
    }
    static int countPaths(int i, int j, int m, int n){

        if (i == m || j == n){
            return 0;
        }
        if (i == m-1 && j == n-1){
            return 1;
        }
        // count path downwards
        int downPaths = countPaths(i+1,j,m,n);
        // count path rightwards
        int rightPaths = countPaths(i,j+1,m,n);
        return downPaths+rightPaths;
    }
}
