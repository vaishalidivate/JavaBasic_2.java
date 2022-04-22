package com.company;
import java.util.Scanner;

/** Write a function to remove a specific element from an array */

public class Arrays_5 {

    static void delEle(int a[], int b){

        for (int i=0; i<a.length; i++) {
            if (b==a[i]) {
                for (int j=i; j<a.length-1; j++) {
                    a[j] = a[j + 1];
                }
               break;
            }
        }
    }

    public static void main(String[] args) {

        int[] a={100, 10, 20, 15, 1, 80};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter element you want to delete");
        int b=s.nextInt();

        delEle(a,b);

        for (int i=0; i<a.length-1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
