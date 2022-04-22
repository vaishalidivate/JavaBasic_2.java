package com.company;

/** Create an instance for the child class in child class and call abstract methods */

abstract class Shape3 {
    abstract void square();
    abstract void triangle();
}

class Shape4 extends Shape3 {
    void square(){
        System.out.println("Good Morning");
    }
    void triangle(){
        System.out.println("Good Afternoon");
    }
}
public class Abstract_3 {
    public static void main(String[] args) {
        Shape3 s=new Shape4();
        s.square();
        s.triangle();
    }
}
