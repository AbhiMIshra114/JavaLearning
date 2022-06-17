package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
   static int fibo(int n){
        if (n<2)
            return n;
        return fibo(n-1)+fibo(n-2);
   }
}
