package com.company;


import java.util.Arrays;

public class FlipImage {

    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        for (int[] arr : image) {
            revArray(arr);
        }

        for(int i = 0; i < image.length; i++){
            for (int j = 0; j < image.length; j++){
                int temp;
                if (image[i][j] == 0){
                    temp = 1;
                }else {
                    temp = 0;
                }
                image[i][j] = temp;
            }
        }

        for (int[] arr :
                image) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static void revArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}
