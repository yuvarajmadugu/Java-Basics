import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
//        int a=7;
//        int b=a+3*6;
//        System.out.println(b);


      /*  float radius;
        final double PI = 3.14;
        System.out.println("enter the radius of the circle");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
        double area = PI*radius*radius;
        double circumference = 2*PI*radius;
        System.out.println("the area of the circle is "+area);
        System.out.println("the circumference of the circle is "+circumference);*/


      /*  int a,b,c;
        System.out.println("Enter a");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter b");
        Scanner sc1 = new Scanner(System.in);
        b=sc1.nextInt();
        System.out.println("Enter c");
        Scanner sc2 = new Scanner(System.in);
        c=sc2.nextInt();
        int max=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(max);*/


        float height;
        float weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in meters: ");
        height = sc.nextFloat();
        System.out.println("Enter the weight in kilograms: ");
        weight = sc.nextFloat();
        float BMI=weight / (height*height);
        System.out.println("BMI is "+BMI);

    }
}
