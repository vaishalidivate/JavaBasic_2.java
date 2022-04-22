package com.company;

/**..................................................................
 A, B and C are classes

 A is a super class. B is a sub class of A. C is a sub class of B.

 Create three methods in each class, 2 methods are specific to each class and third
 method (override method) should be in all three Classes A, B and C

 Create a class with main method. Create an object for each class A, B and C in main
 method and call every method of each class using its own object/instance.

 Call an overridden method with super class reference to B and C class’s objects
 Runtime Polymorphism with Data Members/Instance variables, Repeat the above
 process only for data member .......................................................................*/

public class Inheritance {
    static class A{
        void addNum(){
            System.out.println("HI");
        }
        void subNum(){
            System.out.println("Hello");
        }
        void avg(){
            System.out.println("Average");
        }
    }
    static class B extends A{
        void mulNum(){
            System.out.println("Good");
        }
        void divNum(){
            System.out.println("Best");
        }
        void avg(){
            System.out.println("Average");
        }
    }
    static class C extends B{
        void modNum(){
            System.out.println("Morning");
        }
        void logNum(){
            System.out.println("Night");
        }
        void avg(){
            System.out.println("Average");
        }
    }
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        C c1=new C();

        a1.addNum();
        a1.subNum();
        a1.avg();

        b1.mulNum();
        b1.divNum();
        b1.avg();

        c1.modNum();
        c1.logNum();
        c1.avg();

        B ab=new C();
        ab.avg();

    }
}
