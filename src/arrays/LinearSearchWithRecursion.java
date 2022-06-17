package arrays;

import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,5,8};
        System.out.println(linearSearch(arr,8,0));;
        System.out.println(indexOf(arr,5,0));
        findAllIndex(arr,5,0);
        System.out.println(list);
    }
    static boolean linearSearch(int[] arr, int target, int index){
        if (index==arr.length){
            return false;
        }
        if (arr[index]==target)
            return true;
        return linearSearch(arr,target,index+1);

    }
    static int indexOf(int[] arr, int target, int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==target)
            return index;
        return indexOf(arr,target,index+1);

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index==arr.length){
            return;
        }
        if (arr[index]==target)
            list.add(index);
        findAllIndex(arr,target,index+1);

    }
}
