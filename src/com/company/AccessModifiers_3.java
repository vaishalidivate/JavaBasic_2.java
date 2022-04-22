package com.company;

/** Create a class with PROTECTED fields and methods. Access these fields and methods
 from any other class in the same package.
 Also, Access the PROTECTED fields and methods from child class located in a different
 package
 Access the PROTECTED fields and methods from any class in different package */

class B {

    protected static int a = 1;
    protected static int b = 2;

    protected void func1() {
        System.out.println(a + b);
    }

    protected void func2() {
    }
}

    public class AccessModifiers_3 {
    public static void main(String[] args) {
        B p=new B();
        p.func1();
        p.func2();
        System.out.println(p.a);
        System.out.println(p.b);
    }
}
