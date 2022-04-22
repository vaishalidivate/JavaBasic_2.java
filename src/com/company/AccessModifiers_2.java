package com.company;

/** Create a class with DEFAULT fields and methods. Access these fields and methods
 from any other class in the same package */

class A {
    static void DefMeth(){
        System.out.println("HI");
    }
        static int hours=3;
        static int minutes=47;
}


public class AccessModifiers_2 {
    public static void main(String[] args) {
        A a1=new A();
        A.DefMeth();
        System.out.println(A.hours);
    }
}
