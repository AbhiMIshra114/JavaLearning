package com.company;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
        }
        int ans = Integer.parseInt(s) + 1;
        System.out.println(ans);
       String newAns = String.valueOf(ans);
        int[] final_ans = new int[newAns.length()];
        for(int i = 0; i<final_ans.length;i++){
            final_ans[i] = newAns.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(final_ans));

    }
    static boolean isAnagram(String s, String t){
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }

}
