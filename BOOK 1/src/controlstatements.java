import java.util.Scanner;

public class controlstatements{
    public static void main(String[] args) {
//        int age;
//        System.out.println("ENTER AGE");
//        Scanner sc = new Scanner(System.in);
//        age=sc.nextInt();
//
//        if(age>=19){
//            System.out.println("vote eligible");
//        }else {
//            System.out.println("not eligible");
//        }
//        System.out.println("outsideif");

       /* int num;
        Scanner numb=new Scanner(System.in);
        System.out.println("enter num");
        num=numb.nextInt();
        if(num>0){
            System.out.println("num is postive");
        } if(num==0){
            System.out.println("num is zero");
        } if(num%2==0){
            System.out.println("num is even");
        }
        System.out.println("outside if");  */


      /*  int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        a=sc.nextInt();
        System.out.println("enter b value");
        b=sc.nextInt();
        if(a>b){
            System.out.println("a is max");
        } else {
            System.out.println("b is max");
        }   */

// simple calculator using if else statements

        int a,b,choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for addition");
        System.out.println("Enter choice");
        choice=sc.nextInt();
        System.out.println("enter a val");
        a=sc.nextInt();
        System.out.println("enter b val");
        b=sc.nextInt();
        if(choice==1){
            int sum=a+b;
        System.out.println(sum);
        }else {
            int sub=a-b;
            System.out.println(sub);
        }
    }
}
