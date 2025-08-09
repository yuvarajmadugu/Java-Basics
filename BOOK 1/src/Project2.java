import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        int choice;
        double bill=0;
        do {
            System.out.println("*******************************");
            System.out.println("\tWelcome to Coffee Cafe\t");
            System.out.println("*******************************");
            System.out.println("Choose your coffee: ");
            System.out.println("1) a - 200$");
            System.out.println("2) b - 250$");
            System.out.println("3) c - 300$");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice:(1 or 2 or 3)");
            choice = sc.nextInt();
            if (choice == 1) {
                {
                    bill = bill + 200;
                    System.out.println("Add whipping cream cost30$ (yes=1 / no=0)");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        bill = bill + 30;
                    }
                    System.out.println("Add Flavour shot(Vanilla=20(enter=1) / Hazlenut=25(enter 0)");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        bill = bill + 20;
                    } else {
                        bill = bill + 25;
                    }
                }
            }

            if (choice == 2) {
                {
                    bill = bill + 250;
                    System.out.println("Add whipping cream cost30$ (yes=1 / no=0)");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        bill = bill + 30;
                    }
                    System.out.println("Add Flavour shot(Vanilla=20(enter=1) / Hazlenut=25(enter 0)");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        bill = bill + 20;
                    } else {
                        bill = bill + 25;
                    }
                }
            }

            if (choice == 3) {
                {
                    bill = bill + 300;
                    System.out.println("Add whipping cream cost30$ (yes=1 / no=0)");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        bill = bill + 30;
                    }
                    System.out.println("Add Flavour shot(Vanilla=20(enter=1) / Hazlenut=25(enter 0)");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        bill = bill + 20;
                    } else {
                        bill = bill + 25;
                    }
                }
            }
            System.out.println("Total Bill: " + bill);
        }while(choice<1 || choice>3);
    }
}
