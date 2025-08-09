public class IntergerDemo {
//    byte rollno=22;
//    long ph=619_946_165_548_155_567_8L;
//    int n=2047483649;
//    int c=-2147483648-1;
//    byte minValue=Byte.M
//
//    void display(){
//        System.out.println(c);
//    }
//
//    public static void main(String[] args) {
//        IntergerDemo obj=new IntergerDemo();
//        System.out.println(obj.rollno);
//        obj.display();
//    }


    //    short minValue=Short.MIN_VALUE;
//    short maxValue=Short.MAX_VALUE;
//    short a=(short)(maxValue+1);
//    short b=(short)(minValue-1);
//
//    void display(){
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    public static void main(String[] args) {
//        IntergerDemo obj=new IntergerDemo();
//        obj.display();
//    }
    int minValue=Integer.MAX_VALUE;
    int maxValue=Integer.MIN_VALUE;
    byte day=15;
    short year=2023;
    int cityPopulation=8500000;
    long starsInMilkyway=1000000000000000000L;
    long BigNo = 10000000000L;
    int backToSmall = (int) BigNo;
    void display() {
        System.out.println("day "+day);
        System.out.println("year "+year);
        System.out.println("cityPopulation "+cityPopulation);
        System.out.println("starsInMilkyway "+starsInMilkyway);
        System.out.println("BigNo "+BigNo);
        System.out.println("backToSmall "+backToSmall);
        System.out.println("int minValue "+minValue);
        System.out.println("int maxValue "+maxValue);
    }
    public static void main(String[] args) {
        IntergerDemo obj=new IntergerDemo();
        obj.display();
    }
}
