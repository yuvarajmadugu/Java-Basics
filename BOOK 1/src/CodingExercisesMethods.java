public class CodingExercisesMethods {
// 1) create a method to print multiplication table of given number:
    static void multiplicationTable(int num){
            if(num<0){
                System.out.println("invalid input please re-enter the num");
            }else{
                for (int i=1; i<=10; i++){
                    System.out.println(num+" * "+i+" = "+ num*i);
                }
            }
    }

//2) create a method ro check the num is prime or not
    static void isPrime(int num){
        if (num<=1){
            System.out.println(num+" is not prime");
        } for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                System.out.println(num+" is not prime");
                return;
            }
        }
        System.out.println(num+" is prime");
    }

//3) calculate area and circumference of circle write a method that takes radius as parameter & printd area and circumference
    static void AreaAndCircumference(double radius){
        double area=Math.PI*radius*radius;
        double circumference=2*Math.PI*radius;
        System.out.println("Area = " +area);
        System.out.println("Circumference = "+circumference);
    }

//4)create method that takes a user's name as parameter &print greet msg
//[add a parameter for time of day to customize greeting]
    static void greetMsg(String name, String timeOfDay){
        System.out.println("Hare Krishn "+name+" Good "+timeOfDay);
    }

//5)Create method calculate (int quality, double price, boolean isMember) that calculate total price based on quality with 15% discount if customer is Member
    static double calPrice(int quality, double price, boolean isMember){
        double totalPrice= quality*price;
        if (isMember){
            totalPrice-=totalPrice*0.15;
        }
        return totalPrice;
    }

//6) create a method that takes user's age as parameter &print if user us eligible to vote
    static boolean isEligibleToVote(int age){
        if(age<18){
            return false;
        }return true;
    }

//7) cal grade and display name and grade by taking as parameters
    static void displayGrade(String name, char grade){
        System.out.println(name+" got grade "+ grade);
    }
    static char calGrade(int score){
        if(score>=90 && score<=100){
            return 'A';
        }else if(score>=80 && score<=89){
            return 'B';
        }else if(score>=70 && score<=79){
            return 'B';
        }else if(score>=60 && score<=69){
            return 'B';
        }else if(score>=50 && score<=59){
            return 'B';
        }else{
            return 'F';
        }
    }

    public static void main(String[] args) {
        //1) multiplicationTable(-4);

        //2)isPrime(5);

        //3) AreaAndCircumference(7.5);

        //4) greetMsg("yuvi", "morning");

        //5) double result=calPrice(3,120.56,true);
        //   System.out.println(result);

        //6)Boolean result=isEligibleToVote(19);
        //  System.out.println(result);

        char grade=calGrade(97);
        displayGrade("yuvi", grade);

    }
}