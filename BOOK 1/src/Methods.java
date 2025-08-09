import java.util.Scanner;

public class Methods {
//without return type and arguments
    /*static void addition(){
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1= sc.nextInt();
        System.out.println("Enter number 2:");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("Output of num1 and num2 is:"+sum);
    }*/

//with return type and no arguments
    /*static int addition(){
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1= sc.nextInt();
        System.out.println("Enter number 2:");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("sum is:"+sum);
        return sum;
    }*/

//with return type and arguments
    /*static int addition(int a, int b){

    int sum=a+b;
    return sum;*/

// can pass variable names into parameters in main method

//without return type and with argument
    /*static void addition(int a, int b){

    int sum=a+b;
        System.out.println(sum);
    return ; */

//return type enclosed within method,  no output
    /*static void findSquareroot(int num){
        if(num<0){
            System.out.println("Cant find a square root of a negative number");
            return;
        }
        //this method can be used when num1/num2 is created when num2==0
        System.out.println(Math.sqrt(num));
    }*/

//sting is used in return type with multiple return
    /*static String GreetMessage(){
        boolean isMorning=true;
        if(isMorning){
            System.out.println("Hare Krishna... Good Morning");
        }else{
            return " ShubRatri..., Hope you had a nice day ";
        }
        return "";
    }*/

//using a method while creating a method is possible
    static double addition(double a, double b) {
        int sum =(int)(a+b);
        return sum;
    }
    static double average(double a, double b){
        double c=addition(a,b);
        return c/2;
    }

    public static void main(String[] args) {
       // addition();

       // System.out.println(addition());

       //System.out.println(addition(2,3));

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number 1:");
//        int num1= sc.nextInt();
//        System.out.println("Enter number 2:");
//        int num2=sc.nextInt();
//        addition(num1,num2);

        //findSquareroot(25);

        //String result=GreetMessage();
        //System.out.println(result);

        System.out.println(addition(1,2));
        System.out.println(average(2,3));
    }
}
