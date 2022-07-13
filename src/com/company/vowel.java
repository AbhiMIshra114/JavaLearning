package com.company;

import java.util.Locale;
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String c = sc.nextLine();
        String s = c.toLowerCase(Locale.ROOT);
        if (c.charAt(0) == 'a' || c.charAt(0) == 'e' || c.charAt(0) == 'i' || c.charAt(0) == 'o' || c.charAt(0) == 'u') System.out.println("true");
        else System.out.println("false");

    }
}
