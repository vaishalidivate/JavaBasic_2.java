package com.company;

/** Print static variables in Instance methods */

public class Static_3 {
    // Static variables
    static int a=5;
    static long b=123456789;

    // Instance Methods
    void inst1(){
        System.out.println(a);
    }
    void inst2(){
        System.out.println(b);
    }

    public static void main(String[] args) {
        Static_3 s=new Static_3();
        s.inst1();
        s.inst2();
    }
}
