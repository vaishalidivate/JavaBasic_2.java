package com.company;

/** Print instance variables in static methods */

public class Static_2 {

    // Instance Variables
    int c=2;
    int d=6;

    //  Static Methods
    static void stat1(){
       // System.out.println(c + " "+ d);
    }
    static void stat2(){}

    public static void main(String[] args) {
        Static_2 s=new Static_2();
        stat1();
        stat2();
        System.out.println(s.c);
        System.out.println(s.d);
    }
}
