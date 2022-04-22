package com.company;

import java.util.Scanner;

/**  Program for multiple if else statement(largest number in 10,20 and 30)  */

public class Loops_13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        //        int a=10, b=20, c=30;

        if (a>b && a>c)
            System.out.println(a+" is largest number");
        else if(b>a && b>c)
            System.out.println(b+" is largest number");
        else if(c>a && c>b)
            System.out.println(c+" is largest number");
    }
}
