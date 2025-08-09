public class Advancedpatterns {
    public static void main(String[] args) {

//to print
//1
//12
//123
//1234
//12345
        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

//to print
//12345
//1234
//123
//12
//1
        /*int n=5;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

              //or

        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

//to print
//1
//22
//333
//4444
//55555
        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }*/

//to print
//    1
//   21
//  321
// 4321
//54321
        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }*/

//to print
//1        1
//12      12
//123    123
//1234  1234
//1234512345
        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

//to print
//    1
//   1 2
//  1 2 3
// 1 2 3 4
//1 2 3 4 5
        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

//to print
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5
        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

//to print
//    1
//   2 3
//  3 4 5
// 4 5 6 7
//5 6 7 8 9

        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<2*i; j++){
                System.out.print(j+" ");
            }
            System.out.println();  */

               //or

            /*int n=5;
            for (int i=1; i<=n; i++){
                for (int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                int num=i;
                for (int j=1; j<=i; j++){
                    System.out.print(num+" ");
                    num++;
                }
                System.out.println();
        }*/

//to print
//5 5 5 5 5
// 4 4 4 4
//  3 3 3
//   2 2
//    1
        /*int n=5;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/


//to print
//  54321
//   4321
//    321
//     21
//      1
        /*int n=5;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }*/

//to print
//      7
//     6 7
//    5 6 7
//   4 5 6 7
//  3 4 5 6 7
// 2 3 4 5 6 7
//1 2 3 4 5 6 7
        /*int n=7;
        for (int i=n; i>=1; i--){
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/


//to print
//1
//10
//101
//1010
//10101
        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (j%2==0){
                    System.out.print("0");
                }else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }*/

//to print
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
        /*int num=1;
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/

//to print
//A
//BC
//DEF
//GHIJ
//KLMNO
        /*int n=5;
        char  ch='A';
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }*/

//to print
//A
//A B
//A B C
//A B C D
//A B C D E
        /*int n=5;
        for (int i=1; i<=n; i++){
            char  ch='A';
            for (int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }*/

//to print
//555555555
//544444445
//543333345
//543222345
//543212345
//543222345
//543333345
//544444445
//555555555
        /*int n=5;
        for (int i=0; i<2*n-1; i++){
            for (int j=0; j<2*n-1; j++){
                System.out.print(n-(Math.min(Math.min(j, (2*n-2)-j), (Math.min(i, (2*n-2)-i))))+" ");
            }
            System.out.println();
        }*/

//to print
//A
//B B
//C C C
//D D D D
//E E E E E
        /*int n=5;
        char  ch='A';
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }*/

//to print
//A B C D E
//A B C D
//A B C
//A B
//A
        /*int n=5;
        for (int i=n; i>=1; i--){
            char  ch='A';
            for (int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }*/

//to print
//    A
//   A B
//  A B C
// A B C D
//A B C D E
        /*int n=5;
        for (int i=n; i>=1; i--){
            char ch='A';
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();*/


               //or


            /*int n=5;
            for (int i=1; i<=n; i++){
                char ch='A';
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for (int j=1; j<=i; j++){
                    System.out.print(ch+ " ");
                    ch++;
                }
                System.out.println();
            }*/

//to print
//A
//BC
//DEF
//GHIJ
//KLMNO
        /*int n=5;
        char ch='A';
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }*/

//to print
//    A
//   ABA
//  ABCBA
// ABCDCBA
//ABCDEDCBA
        /*int n=5;
        for (int i=1; i<=n; i++){
            char ch='A';
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            for (int j=2; j<=i; j++){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }*/


        //or


        /*int n=5;
        for (int i=1; i<=n; i++) {
            char ch = 'A';
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print(ch);
                if (j<=(2*i-1)/2) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }*/
    }
}