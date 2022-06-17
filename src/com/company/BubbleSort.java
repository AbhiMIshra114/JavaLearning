package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr, int n, int i){
        if (n==0)
            return;
        if (n>i){
            if (arr[i] > arr[i+1]){
                  // swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            bubbleSort(arr,n,i+1);
        } else {
            bubbleSort(arr,n-1,0);
        }
    }
}
