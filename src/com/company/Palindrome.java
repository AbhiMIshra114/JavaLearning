package com.company;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("levelw"));
    }
    static boolean checkPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
