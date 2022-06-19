package com.company;

public class MultiplyTwoString {
    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "23";
        long i = Integer.parseInt(s1);
        long j = Integer.parseInt(s2);
        String ans = Integer.toString((int) (i*j));
        System.out.println(ans);
    }

}
