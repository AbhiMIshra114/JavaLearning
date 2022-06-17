package com.company;

public class SkipACharacter {
    public static void main(String[] args) {
        String s = "baccad";
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i)!='a') ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }
    static void skip(String s , String ans,int i ){

    }
}
