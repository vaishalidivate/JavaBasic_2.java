package com.company;

/**...........Create a class with PRIVATE fields, private method and a main method. Print the fields
 in main method. Call the private method in main method.

 Create a sub class and try to access the private fields and methods from sub class.............. */

public class AccessModifiers_1 {

    public static class Access {
        private static int x;
        private static int y;

        private static int addSum(int a, int b){
            int c=a+b;
            return c;
        }
    }
    public static void main(String[] args) {

        Access.x=10;
        Access.y=9;
        System.out.println(Access.x + " " + Access.y);
        System.out.println(Access.addSum(5,6));


    }
}
