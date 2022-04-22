package com.company;

/** Write a program to palindrome or not. */

 public class Loops_10 {
    public static void main(String[] args) {
        int num=121;
        int sum=0, res;
        int num2=num;

        while(num>0){
            res=(sum*10)+(num%10);
           sum=res;
            num=num/10;
        }
        if(num2==sum)
            System.out.println("palindrome");
        else
            System.out.println("not-palindrome");
    }
}
