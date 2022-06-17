package com.company;

import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        System.out.println(diceThrowRet("",4));
    }
    static void diceThrow(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++){
            diceThrow(p + i,target-i);
        }
    }
    static ArrayList<String> diceThrowRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++){
            list.addAll(diceThrowRet(p + i,target-i));
        }
        return list;
    }
}
