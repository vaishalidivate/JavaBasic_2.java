package com.company;

/** Write a function to reverse an array of integer values */

public class Arrays_9 {
    static void revArr(int arr[]){
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};

       revArr(arr);
    }
}
