import java.util.Scanner;

public class controlstatements2 {
    public static void main(String[] args) {
        //if, if-else,else-if

       /* int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("invalid marks ");
        }

        else {
          if (marks >= 90) {
                System.out.println("A Grade");
          } else if (marks >= 80) {
                System.out.println("B grade");
          } else if (marks >= 70) {
                System.out.println("C grade");
          } else if (marks >= 60) {
                System.out.println("D grade");
          } else {
                System.out.println("E grade");
          }
        }     */

       /* int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter choice value");
        c=sc.nextInt();
        System.out.println("enter a value");
        a=sc.nextInt();
        System.out.println("enter b value");
        b=sc.nextInt();
        if(c==1){
            int sum=a+b;
            System.out.println(sum);
        }else if (c==2){
            int sub=a-b;
            System.out.println(sub);
        }else if (c==3){
            int mult=a*b;
            System.out.println(mult);
        }else if (c==4){
            int div=a/b;
            System.out.println(div);
        }else {
            int mod=a%b;
            System.out.println(mod);
        }  */


        // nested if
        int age;
        boolean isCitizen;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("are you from India");
        isCitizen=sc.nextBoolean();
        if(age>=18){
            if(isCitizen){
                System.out.println("you can vote");
            } else {
                System.out.println("apply for citizenship");
            }
        }else {
            System.out.println("Cant vote ");
        }

    }
}