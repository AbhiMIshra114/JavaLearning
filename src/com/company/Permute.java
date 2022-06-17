package com.company;

public class Permute {
    public static void main(String[] args) {
        permute("abc","");
    }
    static void permute(String str, String permutation){

        if (str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
//            permutation+=newStr;
            permute(newStr,permutation+currChar);
        }
    }
}
