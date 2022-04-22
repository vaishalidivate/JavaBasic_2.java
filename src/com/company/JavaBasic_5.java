package com.company;

/** Define the local and Global variables with the same name and print both variables and
understand the scope of the variables */

class JavaBasic_5{

    public static int local() {
        int sum1 = 45;
        return sum1;
    }
    public static void main(String[] args) {
        int sum1=12;
        System.out.println(local());
        System.out.println(sum1);
       }
}
