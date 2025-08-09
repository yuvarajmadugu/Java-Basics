import java.util.Scanner;

public class CodingExcisesLoops {
    public static void main(String[] args) {
// Wap to print check wheather the no.is a perfect number
            //perfect number=if 6(divisble by:1 2 3) if we add divisors(1+2+3=6)
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to check:");
        int num=sc.nextInt();
        int sum=0;
        if(num<0){
            System.out.println("invalid number entered");
        }else {
            System.out.println("the proper divisors of " + num + " are:");
            for (int i=1; i<=num/2; i++) {
                if(num%i==0) {
                    System.out.print(i + " ");
                    sum+=i;
                }
            }
            if (sum==num) {
                System.out.println("\n"+num+" is a perfect number");
            } else {
                System.out.println("\n"+num+" isn't a perfect number");
            }
        }   */

//to find GCD of 2 numbers:
        /*Scanner sc=new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1=sc.nextInt();
        System.out.print("enter num2: ");
        int num2=sc.nextInt();
        int gcd=1;
        //euclidean method:
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.println(num1);   */

//        int min=num1 < num2 ? num1 : num2;
//        for (int i=min;i>=1;i--){
//            if(num1%i==0 && num2%i==0){
//                gcd=i;
//                break;
//            }
//        }
//        System.out.println("the gcd of "+num1+" and "+num2+" is: "+gcd);

//to find lcm of 2numbers:
        //euclidean method:
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter num2: ");
        int num2=sc.nextInt();
        //method by using euclidean or gcd
        int a=num1;
        int b=num2;
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.println("the lcm of "+a+" and "+b+" is: "+(a*b)/num1);     */
//       general method:
//        int max = num1>num2 ? num1 : num2;
//        int lcm=max;
//        while (true){
//            if(lcm%num1==0 && lcm%num2==0){
//                break;
//            }
//            lcm=lcm+max;
//        }
//        System.out.println(lcm);

//to count no.of divisors:
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
//        int count=0;
//        for(int i=1; i<=Math.sqrt(num);i++){
//            if(num%i==0){
//                if(num==i){
//                    count++;
//                }else{
//                    count+=2;
//                }
//            }
//        }
//        System.out.print("count of divisors are "+count+"\n");



        int count=1;
        for (int i=1;i<=num/2;i++){
            if(num%i==0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.print("\ncount of divisors are "+count);
    }
}
