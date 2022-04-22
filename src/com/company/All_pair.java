package com.company;

import java.util.Scanner;

public class All_pair {

    public static int Allpair(int input1){
        int count=0, res=0;
        int up=input1-1;
        int i, j;

        for(i=1,j=up; i<input1 || j>i; i++,j--){
            //for(int j=up; j>i; j--) {
            if ((i + j) == input1) {
                count++;
            }
            res = count;

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        System.out.println(Allpair(N));
    }
}
