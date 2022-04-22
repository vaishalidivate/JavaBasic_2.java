package com.company;

/** Call instance methods in static method */

public class Static_4 {

    //  Static Methods
    static void stat1(){
        // inst1();
    }
    static void stat2(){
        // inst2();
    }

    // Instance Methods
    void inst1(){}
    void inst2(){}

    public static void main(String[] args) {
        Static_4 s=new Static_4();
        stat1();
        stat2();
        s.inst1();
        s.inst2();

    }
}
