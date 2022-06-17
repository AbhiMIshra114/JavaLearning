package com.company;

public class PlaceTheTiles {
    public static void main(String[] args) {
        System.out.println(placeTiles(4,2));
    }
    static int placeTiles(int n, int m){

        if(n == m){
            return 2;
        }
        if (n < m){
            return 1;
        }
        // place the tiles vertically
        int vertPlacement = placeTiles(n-m,m);
        // place the tiles horizontally
        int horzPlacement = placeTiles(n-1,m);
        return vertPlacement + horzPlacement;
    }
}
