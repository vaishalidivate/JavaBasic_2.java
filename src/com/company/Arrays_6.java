package com.company;

/** Write a function to copy an array to another array */

public class Arrays_6 {

     static void copyArr(int a1[]) {
         int c=a1.length;
         int b[]=new int[c];

         for (int i=0; i<a1.length; i++){
             System.out.print(" "+a1[i]);
         }
         System.out.println();
         for (int i=0; i<a1.length; i++){
             b[i]=a1[i];
           System.out.println(b[i]);
         }
//         System.out.println();
//         for (int i=0; i<c; i++){
//             System.out.print (" " +b[i]);
//         }
     }

    public static void main(String[] args) {
        int a[]= {16, 5, 6, 11, 88};
        copyArr(a);
    }
}
