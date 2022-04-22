package com.company;

/** Write a function to find the duplicate values of an array */

public class Arrays_10 {

    static void dup(int a[]){
        for (int i=0; i<a.length; i++){
            if (a[i]==a.length)
                System.out.println("Found Duplicate at location "+i);
        }
    }
    public static void main(String[] args) {
        int arr[]={ 4, 5, 6, 2, 5, 4};

       dup(arr);
    }
}
