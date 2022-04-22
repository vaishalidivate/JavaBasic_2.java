package com.company;

/** Write a method for increment and decrement operators(++, --) */

public class Operators_2 {
     static void increment(){
        int a = 0;
       a++;
         System.out.println(a);
    }
    static void decrement(){
        int a = 0;
        a--;
        System.out.println(a);
    }
    public static void main(String[] args) {
        increment();
        decrement();
    }
}
