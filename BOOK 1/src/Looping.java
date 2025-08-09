import java.util.Scanner;
public class Looping {
    public static void main(String[] args) {

//sum of n natural no.s:
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);  */

//factorial of numbers:
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int num=sc.nextInt();
        int factorial=1;
        if(num<0){
            System.out.println("Invalid number");
        } else{
            for(int i=num;i>=1;i--){
                 factorial=factorial*i;
            }
            System.out.println(factorial);
        }        */

//multiplication table of a num:
        /*Scanner sc = new Scanner(System.in);
        System.out.println("which table you want?");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=num*i;
            System.out.println(num + "*" + i + "=" + sum);
        }   */

//sum of even numbers between 1 to N
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int num=sc.nextInt();
        int even=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                even+=i;
            }
        }
        System.out.println("sum of even numbers between 1 to " +num+ " is "+ even);   */

//check if the entered no is prime or not
        /*Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num<1){
            System.out.println("Not a prime");
        }else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    System.out.println("Not a prime");
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("Prime number");
            }
        }
          Scanner.close();   */

//Palindrome no.:
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. you want to check");
        int num= sc.nextInt();
        int originalno=num;
        int reversedno=0;
        for(;num!=0; num/=10){ //num=num/10;
            int reminder=num%10;
            reversedno=reversedno*10 + reminder;
        }
        if(originalno==reversedno){
            System.out.println("the entered no.is a palindrome");
        }   */

//sum of digits entered:
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int sumofDigits=0;
        for (; num!=0; num/=10) {
            int remainder = num % 10;
            sumofDigits=sumofDigits+remainder;
        }
        System.out.println(sumofDigits);  */

//count digits in a number:
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int count=0;
        int originalno = num;
        if(num==0){
            count=1;
        }else {
            for (; num != 0; num /= 10) {
                int remainder = num % 10;
                count++;
            }
            System.out.println(originalno + " has " + count + " digits");
        }   */

//Print the entered numbers in reverse:
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num= sc.nextInt();
        for(int i=num;i>0;i--){
            System.out.println(i);
        }

//reverse the number given
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int originalno=num;
        int reversedno=0;
        for(;num!=0; num/=10){
            int reminder=num%10;
            reversedno=reversedno*10+reminder;
        }
        System.out.println(reversedno);  */

//to find first n fibonacci no:
        /*Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n :");
        int num=sc.nextInt();
        int t1=0,t2=1,nextterm=0;
        if(num<0){
            System.out.println("enter a valid number");
        } else if (num==1) {
            System.out.println("The fibonacci number is:"+t1);
        }else {
            System.out.print("The fibonacci series is: " + t1 + " " + t2);
            for (int i = 3; i <= num; i++) {
                nextterm = t1 + t2;
                System.out.print(" " + nextterm);
                t1 = t2;
                t2 = nextterm;
                System.out.println("\nThe "+num+"th fibonacci number is "+nextterm);
            }
        }   */


//calculating power of a number:
        /*Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        System.out.print("enter the power value: ");
        int power=sc.nextInt();
        int result=1;
        for (int i=1;i<=power;i++){
            result=result*num;
        }
        System.out.println(power+" to the power of "+num+" is: "+ result); */

//FizzBuzz program:(multiple of 3=fizz, multiple of 5=buzz, multiple of both=fizzbuzz
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            } else if (i%5==0) {
                System.out.println("buzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }   */
    }
}