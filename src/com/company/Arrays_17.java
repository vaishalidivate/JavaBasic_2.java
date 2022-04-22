package com.company;

import java.util.Scanner;

/** Write a method to verify if the array contains two specified elements(12,23) */

public class Arrays_17 {
    public static void main(String[] args) {
        int a[]={5,8,6,4,23,7,12,9};

        Scanner s=new Scanner(System.in);
        System.out.println("Enter first Element");
        int b=s.nextInt();
        System.out.println("Enter Second Element");
        int c=s.nextInt();

        for (int i=0; i<a.length; i++){
            if (a[i]==b || a[i]==c)
                System.out.println("Elements present in array "+a[i]);

        }
    }
}
