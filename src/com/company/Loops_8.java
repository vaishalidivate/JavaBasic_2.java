package com.company;


import java.util.*;

/** Write a program to find Armstrong number or no */

public class Loops_8 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int num, count = 0, rev=0;
        double res,sum=0;
        System.out.println("enter number");
        num = s.nextInt();
        int num2=num;

        while (num!= 0) {
            rev = (rev*10)+(num % 10);
            count++;
            num = num / 10;
        }
        while (rev != 0) {
            int digit= rev% 10;
            res = Math.pow(digit,count);
            rev= rev / 10;
            sum = sum + res;
        }
        if(num2==sum)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}






