package com.company;

public class FirstAndLast {
    public static void main(String[] args) {
        findOccurrence('a',"abaach",0);
    }
    public static int first = -1;
    public static int last = -1;
    public static void findOccurrence(char element,String str, int idx){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (str.charAt(idx)==element){
            if (first==-1)
                first=idx;
            else
                last=idx;
        }
        findOccurrence(element,str,idx+1);
    }
}
