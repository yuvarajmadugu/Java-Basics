import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter a number between 1 to 50");
        int num = sc.nextInt();
        while (num < 1 || num > 50) {
            System.out.println("Invalid number enterd\n please enter a valid number: ");
            num = sc.nextInt();
        }
        System.out.println("you entered a number "+ num+ " ,and this is a valid number");      */

//do-while loop:
        /*int i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=5);  */

//to create a simple calculator:
        /*Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n*******************************");
            System.out.println("Welcome to Simple Calculator\uD83E\uDDEE");
            System.out.println("*******************************\n");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.println("Enter your choice(1-6)");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter 2 numbers");
                    int num1=sc.nextInt();
                    int num2=sc.nextInt();
                    System.out.println("Addition of "+num1+" "+num2+" is "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Enter 2 numbers");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    if(num2==0){
                        System.out.println("undefined entry9");
                    }
                    System.out.println("Subtrraction of "+num1+" "+num2+" is "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Enter 2 numbers");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    System.out.println("Multiplication of "+num1+" "+num2+" is "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Enter 2 numbers");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    System.out.println("Division of "+num1+" "+num2+" is "+(num1/num2));
                    break;
                case 5:
                    System.out.println("Enter 2 numbers");
                    num1=sc.nextInt();
                    num2=sc.nextInt();
                    System.out.println("Modulus of "+num1+" "+num2+" is "+(num1%num2));
                    break;
                case 6:
                    System.out.println("Exit calculator");
                default:
                    System.out.println("Entered invalid choice,try again");
            }
        }while(choice!=6);  */

//to enter password
        final String correctPassword="yuviacc09";
        Scanner sc=new Scanner(System.in);
        String password;
        do {
            System.out.println("enter password");
            password=sc.nextLine();
            if (!password.equals(correctPassword)){
                System.out.println("Invalid password,try again..");
            }
        }while (!(password.equals(correctPassword)));
        System.out.println("Access Granted");
    }
}