package com.company;

import org.w3c.dom.ls.LSOutput;

/** Print the fields/instance members of the current class using this and without using object */

public class ThisSuper_1 {
    static class ThisClass {
        static int a = 5;
        boolean b = true;
        long c = 25;
       static void func(){
           //System.out.println(this.a);
       }
    }
    public static void main(String[] args) {
      ThisClass.func();
    }
}
