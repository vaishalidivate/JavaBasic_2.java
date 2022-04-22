package com.company;

import java.util.Scanner;

/** Program to check whether a number is EVEN or ODD using switch */

public class Loops_11 {
    public static void main(String[] args) {
        //int num=15;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int num=s.nextInt();

        switch(num){
            case 1:
                System.out.println("even");
                break;
            case 12:
                System.out.println("even");
                break;
            case 15:
                System.out.println("odd");
                break;
            default:
                System.out.println("nothing");
        }
    }
}
