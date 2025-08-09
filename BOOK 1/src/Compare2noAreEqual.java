import java.util.Scanner;

public class Compare2noAreEqual {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        num1= sc.nextInt();
        System.out.println("enter num2");
        num2=sc.nextInt();
//        if(num1-num2==0){
//            System.out.println("no. is equal");
//        } else {
//            System.out.println("Not equal");
//        }

        if((num1^num2)==0){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
