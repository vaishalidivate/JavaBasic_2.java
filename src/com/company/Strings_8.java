package com.company;

/** equalsIgnoreCase(), startsWith(), endsWith() and compareTo() */

public class Strings_8 {
    public static void main(String[] args) {

        String name = "JALA Technologies";

        System.out.println(name.equalsIgnoreCase("JALA Technologies"));
        System.out.println(name.startsWith("J"));
        System.out.println(name.endsWith("s"));
        System.out.println(name.compareTo("Technologies"));
    }
}
