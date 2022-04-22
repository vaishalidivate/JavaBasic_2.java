package com.company;

/**  Write a method to remove duplicate elements from an array */

public class Arrays_12 {

    static void remDup(int a[]) {

        for (int i=0; i<a.length; i++){
            if (a[i]==a.length){
                System.out.println("Element fount at " +i);
                for (int j=i; j<a.length-1; j++){
                    a[j]=a[j+1];
                }
                // break;
            }
        }
    }
    public static void main(String[] args) {

        int arr[]={5,8,6,4,9,8,2,3};

        remDup(arr);

        for (int i=0; i<arr.length-2; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
