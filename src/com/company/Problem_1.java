package com.company;

/** Write a program that takes a string of characters and returns a compressed version of the string as described below.
 Identify the contiguous occurrences of each character and prepend this number to the character.  */

public class Problem_1 {

        static void printOccurence(String s)
        {
            for (int i = 0; i < s.length(); i++) {

                int count = 1;
                while (i + 1 < s.length() && s.charAt(i)== s.charAt(i + 1)) {
                    i++;
                    count++;
                }
                System.out.print(""+count + ""+s.charAt(i));
            }
            System.out.println();
        }

        public static void main(String args[])
        {
            printOccurence("aabbcde" );
            printOccurence("wwwbbbw" );
        }
    }

