package com.company;

public class Pattern {
    public static void main(String[] args) {

//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
        int n=5;
        // First half
        for(int i=1; i<=n; i++) {
            //- 1st part
            for (int j = 1; j <= i; j++) {
                if(i==j || j==1 || i==1)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // Spaces
            int spaces=2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // 2nd part
            for(int j=1; j<=i; j++){
                if(i==j || j==1 || i==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        // Lower half
        for (int i=n; i>=1; i--){
            //- 1st part
            for (int j = 1; j <= i; j++) {
                if(i==j || j==1 || i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // Spaces
            int spaces=2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // 2nd part
            for(int j=1; j<=i; j++){
                if(i==j || j==1 || i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }

//        for(int i=1; i<=n; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if(j==1 || i==n || i==j)
//                System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
//            for (int i=1; i<=n; i++){
//
//                for (int j=1; j<=i; j++){
//                System.out.print("  ");
//            }
//            for (int j=n; j>=i; j--){
//                if(j==n || i==j)
//                System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if(j==1 || i==n || i==j)
//                System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
//            for (int i=n-1; i>=1; i--){
//                for (int j=1; j<=i; j++){
//                    if(j==1 || i==n || i==j)
//                        System.out.print("* ");
//                    else
//                        System.out.print("  ");
//                }
//            System.out.println();
//        }
//            *
//* *
//*   *
//*     *
//* * * * *
//*     *
//*   *
//* *
//*


        /*
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
            // int sum=i+j;
            // if(sum%2==0)
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
1
01
101
0101
10101
         */

        /* floyd's triangle

        int n=5;
        int number=1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
         */

        /*
        int n=5;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
12345
1234
123
12
1
         */


        /*
        int n=5;
         for(int i=1; i<=n; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(j);
             }
             System.out.println();
         }
         1
12
123
1234
12345
         */

        /*
        int n=4;

        for (int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         */

        /*
        int n=4;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        * * * *
* * *
* *
*

         */



        /*
        int n=4;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        /*
        int n=4;

        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         */


        /*
        int n=4;
        int m=5;

        for(int i=1; i<=n; i++){

            for( int j=1; j<=m; j++){
                if(i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */

    }
}
