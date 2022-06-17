package com.company;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        removeDuplicates("abbccdaa",0,"");
    }
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString){
        if (idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (!map[currChar - 'a']) {
            newString += currChar;
            map[currChar - 'a'] = true;
        }
        removeDuplicates(str,idx+1,newString);
    }
}
