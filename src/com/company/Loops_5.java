package com.company;

/** Write a program to print largest number among three numbers */

public class Loops_5 {
    public static void main(String[] args) {
        int x=20, y=65, z=12;

        if(x>y && x>z)
            System.out.println("X is largest among three");
        else if(y>x && y>z)
            System.out.println("y is largest number among three");
        else
            System.out.println("z is largest number among three");
    }
}
