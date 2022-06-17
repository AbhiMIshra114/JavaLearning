package com.company;

public class ReverseString {
    public static void main(String[] args) {
        String s = "abcd";
//        System.out.println(s.substring(0,s.length()-1));
        rev(s,s.length()-1);
    }

    static void rev(String s,int idx){
        if(idx == -1)
            return ;
        System.out.print(s.charAt(idx));
        rev(s,idx-1);

    }
}
