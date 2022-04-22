package com.company;

/** Write a function to find the minimum and maximum value of an array */

//import java.util.Scanner;

public class Arrays_8 {

    static void minMax(int arr[]) {
        int max=arr[0];
        int min=arr[0];
        //Minimum value
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("Minimum value of array "+min);
        // Maximum value
        for (int i=1; i<arr.length; i++){
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Maximum value of array "+max);
    }
    public static void main(String[] args) {
        int arr[]={5,8,6,4,9,7,2,3};

        minMax(arr);

    }
}





