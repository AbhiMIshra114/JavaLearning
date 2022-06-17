package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPad {
    public static void main(String[] args) {

//        keyPad("23",0,"");
//        System.out.println();
        System.out.println(padRet("","23"));
    }

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keyPad(String str, int idx, String combination){
        if (idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i<mapping.length();i++){
            keyPad(str,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3;i++){
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }
    }
    public static ArrayList<String> padRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3;i++){
            char ch = (char) ('a' + i);
            list.addAll(padRet(p+ch,up.substring(1)));
        }
        return list;
    }
}
