package sorting;

import java.util.Arrays;
// this is code is not working
public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        inPlaceMergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void inPlaceMergeSort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }
        int mid = s + (e - s)/2;
        inPlaceMergeSort(arr,s,mid);
        inPlaceMergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }
    static void merge(int[] arr, int s, int mid, int e){
        int[] merged = new int[e-s+1];
        int i = s;
        int j = mid + 1;
        int x = 0;
        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]){
                merged[x++] = arr[i++];
            } else{
                merged[x++] = arr[j++];
            }
        }
        while (i<=mid){
            merged[x++] = arr[i++];
        }
        while (j<=e){
            merged[x++] = arr[j++];
        }
        for (int k = 0; k < merged.length; k++) {
            arr[k] = merged[k];
        }
    }
}
