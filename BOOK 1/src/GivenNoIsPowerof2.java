import java.util.Scanner;

public class GivenNoIsPowerof2 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.:");
        num=sc.nextInt();
        int result=num&(num-1);
        if(result==0){
            System.out.println("yes its power of 2");
        } else {
            System.out.println("non-power of 2");
        }
    }
}
