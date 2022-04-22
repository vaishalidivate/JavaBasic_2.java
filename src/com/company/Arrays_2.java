package com.company;

/* Write a function to calculate the average value of an array of integers */

public class Arrays_2 {

    static void arrAvg(int arr[]) {
        int sum=0;
        int avg=0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg = sum / arr.length;
        }
        System.out.println(avg);
    }

    public static void main(String[] args) {
        int arr[]={ 100, 10, 20, 15,65};
        arrAvg(arr);
    }
}
