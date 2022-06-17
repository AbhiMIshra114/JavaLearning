package com.company;

public class NumberPrinting {

    public static void main(String[] args) {
        // print numbers from 5 to 1
        print(5);
    }

    static void print(int n){
        if (n==0)
            return;
        System.out.println(n);
        print(n-1);
    }

}
