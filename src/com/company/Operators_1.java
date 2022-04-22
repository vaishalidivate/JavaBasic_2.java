package com.company;

/** Write a function for arithmetic operators(+,-,*,/) */

public class Operators_1 {
    static void arithmetic(int a, int b){

        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println(" "+sum+" "+sub+" "+mul+" "+div+" ");
    }
    public static void main(String[] args) {
    arithmetic(10,2);
    }
}
