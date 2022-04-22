package com.company;

/** Create an instance for the child class in child class and call non-abstract method */

abstract class Shape5{
        void circle(){
            System.out.println("Hi");
        }
        void rect(){
            System.out.println("Hello");
        }
        Shape5(){
            System.out.println("Constructor");
        }
}
class Shape6 extends Shape5{
    Shape6(){
        System.out.println("Shape6 Constructor");
    }

}
public class Abstract_4 {
    public static void main(String[] args) {
        Shape5 s=new Shape6();
        s.circle();
        s.rect();
    }
}
