package com.company;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        revArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void revArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}
