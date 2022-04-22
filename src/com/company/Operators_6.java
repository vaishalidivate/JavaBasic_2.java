package com.company;
/** Program for relational operators (<,<==, >, >==) */

public class Operators_6 {
    public static void main(String[] args) {
        int a=7, b=6;

        if(a<b)
            System.out.println(b);
        else if(a<b && a==b)
            System.out.println(a);
        else if(a>b)
            System.out.println(a);
        else if(a>b && a==b)
            System.out.println(a);
    }
}
