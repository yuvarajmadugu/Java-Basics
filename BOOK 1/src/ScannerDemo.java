import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("whats your name");
        String name = sc.nextLine();

        System.out.println("whats your age");
        int age = sc.nextInt();

        System.out.println("ne peru" +name+"ne taram theeram" +age);
    }
}
