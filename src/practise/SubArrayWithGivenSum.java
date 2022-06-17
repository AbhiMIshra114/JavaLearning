package practise;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        System.out.println(subarraySum(arr,5,12));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> ans = new ArrayList<>(2);
        for(int i = 0; i<n;i++){
            for(int j = i; j<n-1; j++){
                if(arr[i]+arr[j+1] == s) {
                    ans.add(i);
                    ans.add(j+1);
                }
            }
        }
        return ans;
    }
}
