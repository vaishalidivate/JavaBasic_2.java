package com.company;

/** Create a sub class for an abstract class. Create an object in the child class for the
 abstract class and access the non-abstract methods */

abstract  class Shape {
    void circle() {

        System.out.println("Hi");
    }
    void rect() {
        System.out.println("Hi");
    }
}
 class Size extends Shape {

}
public class Abstract_2 {

    public static void main(String[] args) {
        Shape s=new Size();
        s.circle();
        s.rect();
    }
}
