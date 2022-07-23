package searching;

public class BinarySearch {
    public static void main(String[] args) {
         int[] arr =  {1,2,3,4,5,6};
         int target = 5;

         System.out.println(bs(arr,target));
    }

    private static int bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return 0;
    }

}
