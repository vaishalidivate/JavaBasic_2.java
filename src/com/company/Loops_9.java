package com.company;
import java.util.*;
/** Write a program to find the prime or not. */

 public class Loops_9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();

        if (num <= 1)
            System.out.println("not");
        else if (num == 2)
            System.out.println("yes");
        else if (num % 2 == 0)
            System.out.println("not");
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                System.out.println("not");
        }
        System.out.println("yes");
    }
}
//     static boolean isPrime(int num){
//         if(num<=1)
//             return false;
//         else if(num==2)
//             return true;
//         else if(num%2==0)
//             return false;
//         for(int i=3; i<=Math.sqrt(num);i++){
//             if(num%i==0)
//                 return false;
//         }
//         return true;
//     }
//
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter number");
//        int num=s.nextInt();
//
//        if(isPrime(num))
//            System.out.println("true");
//        else
//            System.out.println("false");
//  }
//}