package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // date of 5 students {roll,name,marks}
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        Student Abhi = new Student();
        Abhi.roll = 13;
        Abhi.name = "Abhisekh Mishra";
        Abhi.marks = 79.6f;
        System.out.println(Abhi.roll);
        System.out.println(Abhi.name);
        System.out.println(Abhi.marks);


    }
}
class Student{
    int roll;
    String name;
    float marks;
}
