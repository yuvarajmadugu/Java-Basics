import java.util.Scanner;

public class EvenorOddUsingBitwiseopr {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        num = sc.nextInt();
        int result = num & 1;
        if (result % 2 == 0) {
            System.out.println("even no.");
        } else {
            System.out.println("odd no.");
        }
    }
}