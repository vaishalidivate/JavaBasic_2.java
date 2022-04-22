package com.company;

/** Write a program to remove the duplicate elements and return the new array */

public class Arrays_18 {
    public static void main(String[] args) {

        int arr[]={5,8,6,4,9,8,2,3};

        for (int i=0; i<arr.length; i++){
            if (arr[i]==arr.length){
                for (int j=i; j<arr.length-1; j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        for (int i=0; i<arr.length-2; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
