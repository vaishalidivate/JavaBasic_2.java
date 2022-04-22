package com.company;

/** Print gender (Male/Female) program according to given M/F using switch */

public class Loops_12 {
    public static void main(String[] args) {
        char gender = 'm';

        switch(gender){
            case 'm':
                System.out.println("male");
                break;
            case 'f':
                System.out.println("female");
                break;
            default:
                System.out.println("valid");
                break;

        }
    }
}
