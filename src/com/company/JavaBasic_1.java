package com.company;

/** How to create a class, object, method and its signature */

public class JavaBasic_1 {

      int add(int a, int b){
        int c=a+b;
          return c;
    }

    public static void main(String[] args) {
        JavaBasic_1 java=new JavaBasic_1();
        System.out.println(java.add(5,2));
        System.out.println(java.add(5,3));

    }
}
