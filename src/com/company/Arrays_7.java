package com.company;

/* Write a function to insert an element at a specific position in the array */

import java.util.Scanner;

public class Arrays_7 {
    static void changeArr(int arr[], int a, int b){
     for(int i = 0; i<arr.length;i++)

    {
        if (a == i) {
            arr[i] = b;
        }
    }
        for(int i = 0;i<arr.length;i++)

    {
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
        int arr[]={15, 25, 31, 12, 88};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Position");
        int a=s.nextInt();
        System.out.println("Enter Value");
        int b=s.nextInt();

        changeArr(arr,a,b);
    }
}
