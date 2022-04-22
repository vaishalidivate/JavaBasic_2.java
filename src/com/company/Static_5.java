package com.company;

/** Call static methods in instance methods */

public class Static_5 {

    //  Static Methods
    static void stat1(){}
    static void stat2(){}

    // Instance Methods
    void inst1(){
        stat1();
    }
    void inst2(){
        stat2();
    }

    public static void main(String[] args) {
        Static_5 s=new Static_5();
        s.inst1();
        s.inst2();
    }
}
