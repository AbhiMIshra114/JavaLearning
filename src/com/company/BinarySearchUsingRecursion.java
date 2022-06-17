package com.company;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = {3,5,6,9,10,23,34};
        int target = 23;
        System.out.println(search(array,target,0, array.length-1));
    }
    static int search(int[] arr, int target ,int start , int end){
        if (start>end)
            return -1;
        int mid = start + (end - start);
        if (arr[mid]==target)
            return mid;
        if (target>arr[mid])
            return search(arr, target,mid+1,end);
        return search(arr,target,start,mid-1);
    }
}
