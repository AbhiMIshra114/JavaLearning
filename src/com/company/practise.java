package com.company;

import java.util.ArrayList;
import java.util.List;

class practise {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(1);
        candles.add(2);
        candles.add(3);
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<candles.size();i++){
            if(candles.get(i) > max) max = candles.get(i);
        }
        for(int i = 0 ; i<candles.size();i++){
            if(candles.get(i)==max) ans++;
        }
        System.out.println(ans);
        int a= 23;
        String c = "";
        c+=a;
        System.out.println(c);
    }
}