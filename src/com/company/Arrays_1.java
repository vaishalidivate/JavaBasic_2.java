package com.company;

/** Write a function to add integer values of an array */

public class Arrays_1 {
    static int arrSum(int arr[])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum= sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr={100, 10, 20, 15, 1};
        System.out.println(arrSum(arr));
    }
}
