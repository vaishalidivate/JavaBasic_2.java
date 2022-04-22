package com.company;

/** Programs on Logical AND,OR operator and Logical NOT */

public class Operators_5 {
    public static void main(String[] args) {
        int a=100, b=20, c=15;

        if(a>b || c>a){
            System.out.println(b);
        }
        else if(b<=a || c<=a){
            System.out.println(a);
        }
        else
            System.out.println(c);

        if(a>b && c>b){
            System.out.println(b);
        }
        else if(b>c && c<a){
            System.out.println(a);
        }
        else
            System.out.println(c);

        if(a!=b){
            System.out.println(a+c);

        }
    }
}
