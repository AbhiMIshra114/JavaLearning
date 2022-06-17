package practise;

import java.util.Arrays;

public class RomanToInteger {
    public static void main(String[] args) {
        String c = "MCMXCIV";
        System.out.println(romanToInt(c));
    }
    static int romanToInt(String s) {
        int ans = convert(s.charAt(s.length()-1));
        for(int i = s.length()-2; i>=0; i-- ){
            if(convert(s.charAt(i))<convert(s.charAt(i+1))) ans-=convert(s.charAt(i));
            else ans+=convert(s.charAt(i));
        }
        return ans;
    }
    static int convert(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
