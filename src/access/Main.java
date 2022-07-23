package access;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        A obj = new A(23,"Abhi");
//        obj.setNum(34);
//        obj.getNum();
//        int n = obj.num;
//        System.out.println(obj.getClass());
//        int[][] arr = new int[4][4];
        int[] num = {1,2,0,9};

        int k = 34;
        String s = "";
        for(int element : num) s+=element;
        int n = Integer.parseInt(s) + k;
        String ans = "";
        ans+=n;
        ArrayList<Integer> out = new ArrayList<>(ans.length());
        for(int i = 0; i < num.length; i++){
            out.add(ans.charAt(i) - '0');
        }
//        System.out.println(Arrays.toString(out));
        char[] c = {'a','b'};
        String  ns = c.toString();
        System.out.println(ns);
    }
}
