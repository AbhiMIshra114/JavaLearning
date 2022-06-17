package com.company;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        System.out.println(subSeqReturn("","aaa"));
        System.out.println();
    }
    static void subSeq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }
    static ArrayList<String> subSeqReturn(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqReturn(p+ch,up.substring(1));
        ArrayList<String> right = subSeqReturn(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
