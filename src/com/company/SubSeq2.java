package com.company;

import java.util.HashSet;

public class SubSeq2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subSeq2("","aaab",set);
    }
    static void subSeq2(String p, String up, HashSet<String> set){
        if (up.isEmpty()){
            if (!set.contains(p)) {
                System.out.println(p);
                set.add(p);
            }
            return;
        }
        char currChar = up.charAt(0);
        subSeq2(p+currChar,up.substring(1),set);
        subSeq2(p,up.substring(1),set);
    }
}
