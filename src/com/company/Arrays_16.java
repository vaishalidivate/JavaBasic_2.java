package com.company;

/**  Write a function to get the difference of largest and smallest value */

public class Arrays_16 {

    static void differ(int a[]) {

        int min=a[0], max=a[0];

        for (int i=0; i<a.length; i++){
            if(a[i]<min) {
                min=a[i];
            }
        }
        System.out.println(min);

        for (int i=0; i<a.length; i++){
            if (a[i]>max) {
                max = a[i];
            }
        }
        System.out.println(max);

        int res=max-min;
        System.out.println("The difference between min max is - "+res);
    }
    public static void main(String[] args) {
        int b[]={5,8,6,4,9,7,2,3};

        differ(b);
    }
}
