package com.company;

/** Write a program to print even number between 10 and 100 using while */

public class Loops_6 {
    public static void main(String[] args) {
        int i=10;
        int num=100;

           while (i<=num) {
               if(i%2==0)
               System.out.println(i);
               i++;
           }

    }
}
