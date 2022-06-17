package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1,8,0,2};
        int[] arr2 = {34,12,32,67};
        Arrays.sort(arr);
        Arrays.sort(arr2);
//        merge(arr,arr2);
        System.out.println(Arrays.toString(merge(arr,arr2)));

    }
    static int[] merge(int[] first, int[] second) {
        int[] mergedArray = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergedArray[k] = first[i];
                i++;
            } else {
                mergedArray[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mergedArray[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mergedArray[k] = second[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
