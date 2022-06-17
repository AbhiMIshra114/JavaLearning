package com.company;

public class MoveX {
    public static void main(String[] args) {
        System.out.println(moveX("xxxabc","",0,0));
    }
    static String moveX(String s,String ns,int idx,int count){
        if (idx==s.length()){
            for(int i = 0; i < count; i++){
                ns=ns+'x';
            }
            return ns;
//            System.out.println(ns);
        }
        char currChar = s.charAt(idx);
        if (currChar!='x'){
            ns=ns+currChar;
        }else {
            count++;
        }
        return moveX(s,ns,idx+1,count);
    }
}
