package com.company;

/** . Write a program to find the common values between two arrays */

public class Arrays_11 {

   static void common(int c[], int d[]){
        for (int i=0; i<c.length; i++){
            for (int j=0; j<d.length; j++){
                if (c[i]==d[j])
                    System.out.println("Common value is"+c[i]+"at index "+i+" in a and in b "+"at"+j);
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1, 2, 3, 4, 5};
        int b[]={6, 7, 8, 9, 3};

        common(a,b);
    }
}
