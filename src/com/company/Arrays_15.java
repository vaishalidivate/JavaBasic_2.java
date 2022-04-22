package com.company;

/**  Write a method to find number of even number and odd numbers in an array */

public class Arrays_15 {
    public static void main(String[] args) {
        int a[]={5,8,6,4,3,7,2,9,11};
        int count=0, count1=0;
        // int res=0, res1=0;

        for (int i=0; i<a.length; i++){
            if (a[i]%2==0){
                //res=a[i];
                count++;
            }
            else{
                 //res1=a[i];
                 count1++;
            }
        }
        System.out.println("Even numbers are "+count+" "+"Odd numbers are "+count1);
    }
}
