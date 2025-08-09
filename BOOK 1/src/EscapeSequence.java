import java.util.Scanner;

public class EscapeSequence {
    public static void main(String[] args) {
        //escape sequence
        // System.out.println("Line1\nLine2\t\"Quted\"\nLine3\t\\Path");

        System.out.println("welcome to user name generator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstname = sc.nextLine();
        System.out.println("Enter last name: ");
        String lastname = sc.nextLine();
        System.out.println("your user name can be somthing like:\t"+ firstname + " " + lastname);
    }
}
