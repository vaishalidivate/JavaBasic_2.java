package com.company;

/** Print all the static, instance variables in main method */

public class Static_6 {
    // Static variables
    static int a=5;
    static long b=123456789;

    // Instance Variables
    int c=2;
    int d=6;


    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);

        Static_6 s=new Static_6();
        System.out.println(s.c);
        System.out.println(s.d);
    }
}
