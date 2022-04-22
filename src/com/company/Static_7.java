package com.company;

/** Call static methods and instance methods in main method */

public class Static_7 {

    //  Static Methods
    static void stat1(){}
    static void stat2(){}

    // Instance Methods
    void inst1(){}
    void inst2(){}

    public static void main(String[] args) {
        stat1();
        stat2();
        Static_7 s=new Static_7();
        s.inst1();
        s.inst1();
    }
}
