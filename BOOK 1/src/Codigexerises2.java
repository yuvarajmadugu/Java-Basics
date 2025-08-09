import java.util.Scanner;

public class Codigexerises2 {
    static String Trafficlight(String Color){
        return switch (Color){
            case "Red"-> "Stop";
            case "Orange"-> "Get Ready";
            case "Green"-> "Goo";
            default -> "INVALID COLOR ENTERED";
        };
    }

    // traffic color :
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the color diplayed:");
        String colorentered=sc.nextLine();
        System.out.println(Trafficlight(colorentered));



//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no. of marks:");
//        int marks=sc.nextInt();
//        String result = switch(marks/10){
//            case 9,10 ->"A";
//            case 8->"B";
//            case 7->"C";
//            case 6->"D";
//            case 5->"E";
//            default -> "Invalid no";
//        };
//        System.out.println(result);


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter month:");
//        int month=sc.nextInt();
//        switch (month){
//            case 1,3,5,7,8,10,12 -> {
//                System.out.println("31 days");
//            }
//            case 4,6,9,11 -> {
//                System.out.println("30 days");
//            }
//            case 2 -> {
//                System.out.println("enter the year");
//                int year = sc.nextInt();
//                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//                    System.out.println("29 days");
//                } else {
//                    System.out.println("28 days");
//                }
//            }
//            default -> {
//                System.out.println("INVALID NO. ENTERED");
//            }
//        }

    }
}
