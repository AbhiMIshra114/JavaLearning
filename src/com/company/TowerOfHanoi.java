package com.company;

public class TowerOfHanoi {
    public static void main(String[] args) {
//        int n = 3;
        towerOfHanoi(10,"S","H","D");
    }
    static void towerOfHanoi(int n, String src, String helper, String dest){

        if(n==1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1,helper,src,dest);

    }
}
