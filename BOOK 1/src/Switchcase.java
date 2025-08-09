public class Switchcase { //Time effiecency 0(1)
//    static int add(int a,int b){
//        return a+b;
//    }

    static String dayofweek(){
        return switch ("Monday") {
            case "Monday", "Tuesday", "Wednesday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekoff";
            default -> "invalid day";
        };
    }
    public static void main(String[] args) {
//        int sum=add(2,3);
//        System.out.println(sum);

         String result=dayofweek();
        System.out.println(result);



//        int choice;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter choice(1 to 7)");
//        choice=sc.nextInt();                        //choice=sc.next().charAt(0); //case 'M' (if char datatype)
//        switch (choice){ //(choice+1) is allowed
//            case 1: System.out.println("Monday");   //case 1+9 is allowed , 1+1 not allowed due to 2 is there no duplicate value
//                break;
//            case 2: System.out.println("Tuesday");   // case a is not allowed
//                break;
//            case 3: System.out.println("Wednesday");   // if final int a=1 is already declared, case a is allowed
//                break;
//            case 4: System.out.println("Thursday");// if sting choice then
//                break;
//            case 5: System.out.println("Friday");
//                break;
//            case 6: System.out.println("Saturday");
//                break;
//            case 7: System.out.println("Sunday");
//                break;
//            case 13: case 14: case 15: case 16: System.out.println("WeekDay");
//            break;
//            case 17: case 18: case 19: System.out.println("Weekend");
//            break;
//            default: System.out.println("Invalid no. Entered");
//        }


                // WRAPPER CLASS

//        char choice;
//        Scanner sc=new Scanner(System.in);
//        choice=sc.next().charAt(0);
//        Character wrapperdatatype= Character.valueOf(choice);
//        switch (wrapperdatatype){
//            case 13: case 14: case 15: case 16: System.out.println("WeekDay");
//            break;
//            case 17: case 18: case 19: System.out.println("Weekend");
//            break;
//            default: System.out.println("Invalid no. Entered");
//        }


//                //ENUM DATATYPE
//        enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}  //{Constants}
//        Day query= Day.Friday; //query is object of Day class
//        switch (query){
//            case Monday: case Tuesday: case Wednesday: case Thursday: System.out.println("weekday");
//                break;
//            case Friday: case Saturday: case Sunday: System.out.println("Weekend");
//            break;
//        }


//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter day no.");
//        int dayno=sc.nextInt();
//        String result = switch (dayno){
//            case 1,2,3,4,5->"Weekday";
//            case 6,7->"Weekend";
//            default -> "invalid no. enter";
//        };
//        System.out.println(result);

    }
}
