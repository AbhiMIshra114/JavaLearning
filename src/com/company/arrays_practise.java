package com.company;

import java.util.Scanner;

public class arrays_practise {
    public static void main(String[] args) {
        int[] arr = {34,2,12,56,78,3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target ");
        int target = sc.nextInt();
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " is present in the array");
                b = true;
                break;
            }
        }
        if (!b){
            System.out.println(target + " is not present");
        }
    }
}
