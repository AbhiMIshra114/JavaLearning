package com.company;

import java.util.Arrays;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
//        System.out.println(isSorted(arr,1));
//        System.out.println(isSorted(arr,1));
    }

    static boolean isSorted(int[] arr, int idx){

        if (idx==arr.length-1)
            return true;
        if (arr[idx]<arr[idx+1]){
            return  isSorted(arr,idx+1);
        }else{
            return false;
        }
    }
}
