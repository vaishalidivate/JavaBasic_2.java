package com.company;

/* Write a function to test if array contains a specific value */

import java.util.Scanner;

public class Arrays_4 {
    static void arrValue(int arr[], int a) {
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                System.out.println("Array contains a specified value " + arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={100, 10, 20, 15, 1};
        int a=sc.nextInt();
        arrValue(arr, a);
    }
}
