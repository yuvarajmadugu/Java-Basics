public class Patterns {
    public static void main(String[] args) {
//to print    *
//            **
//            ***
//            ****
//            *****
        /*for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

//n*n multiplication table using for loop:
        /*for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.print(i*j+"  ");
            }
            System.out.println();
        }*/

//n*n multiplication table using while loop:
        /*int i=1;
        while (i<=10){
            int j=1;
            while (j<=10){
                System.out.print(i*j+"  ");
                j++;
            }
            System.out.println();
            i++;
        }*/

//n*n multiplication table using for do-while loop:
        /*int i=1;
        do {
            int j=1;
            do {
                System.out.print(i*j+"  ");
                j++;
            }while (j<=10);
            System.out.println();
            i++;
        }while (i<=10);   */

//consider as fig 1 & 2
//to print a *****                 *
//           ****                 **
//           ***       and       ***
//           **                 ****
//           *                 *****

        /*int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*"); //sout2(" "); sout1=fig1 and sout2=fig2
            }
            for (int j=1;j<=i;j++){
                System.out.print(" "); //sout2("*"); sout1=fig1 and sout2=fig2

                            //to print triangle: { sout 1=(" ") [sout 2=(" *"); or sout 2=("* ");] }
            }
            System.out.println();
        }*/

// to print a *****
//            ****
//            ***
//            **
//            *
        // Method 2:
        /*int n=5;
        for(int i=1; i<=n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//to print      *****
//               ****
//                ***
//                 **
//                  *
        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=n; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/

//print:          *
//                **
//                ***
//                ****
//                *****
//                ****
//                ***
//                **
//                *
         //int n=5;
         /*for(int i=1;i<=5;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }      */
//same upper patter within single loop:
        /*int n=5;
        for (int i=1;i<=2*n-1;i++){
            int noofstars=i;
            if (i>n){
                noofstars=2*n-i;
            }
            for (int j=1;j<=noofstars;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//to print a     *
//              ***
//             *****
//            *******
//           *********
        /*int n=5;
        for(int i=1;i<=n;i++){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//to print
//*********
// *******
//  *****
//   ***
//    *
        /*int n=5;
        for(int i=n;i>=1;i--){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//to print
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
        /*int n=5;
        for(int i=1;i<=5;i++){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//to print
//*****
//*   *
//*   *
//*   *
//*****
        /*int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

//to print
//*
//**
//* *
//*  *
//*****

        /*int n=5;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                if (i==n || j==1 || i==j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

//to print
//    *
//   * *
//  * * *
// * * * *
//* * * * *
        /*int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }/*

//to print
//* * * * *
// * * * *
//  * * *
//   * *
//    *
        /*int n=5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

// to print
//                *****
//                ****
//                ***
//                **
//                *
        /*for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

// to print
//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *
        /*int n=5;
        for(int i=1; i<=2*n-1; i++){
//            int NoOfStars=i;
//            if(i>n){
//                i=2*n-i;
//            }
            int noOfStars=(i>n)? 2*n-i: i;
            int noOfSpaces=n-noOfStars;
            for (int j=1; j<=noOfSpaces; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=noOfStars; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//to print
//*
//**
//***
//****
//*****
//****
//***
//**
//*
        /*int n=5;
        for (int i=1; i<=n; i++){
            //1st part stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            //1st part stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//to print
//*        *
//**      **
//***    ***
//****  ****
//**********
//****  ****
//***    ***
//**      **
//*        *
        //upperhalf:
        int n=5;
        for (int i=1; i<=n; i++){

//            by using ternary operator:
//            int stars=(i>n)? 2*n-i: i;
//            int spaces=2*n-2;

            //1st part stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //2nd part stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lowerhalf:
        for (int i=n-1; i>=1; i--){
            //1st part stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //2nd part stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
