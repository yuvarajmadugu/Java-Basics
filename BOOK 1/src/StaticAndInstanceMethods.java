public class StaticAndInstanceMethods {
    //static methods:
//    static String name="uv";
//    static int empId=97;
//    static void greet(){
//        System.out.println("hi "+name);
//    }
//    static void display(){
//        greet();
//        System.out.println("your emp id is "+empId);
//    }
//
//    static int square(int num){
//        return num*num;
//    }
//
//    static String reverse(String str){
//        return new StringBuilder().reverse().toString();
//    }
//
//    static String uppercase(String str){
//        return str.toUpperCase();
//    }


    //instance methods:
    String empname;
    int empid;
    void setinfo(String name, int id){
        empname=name;
        empid=id;
    }
    void getinfo(){
        System.out.println("Hi "+empname);
        System.out.println("your id "+empid);
    }
    void updatename(String name){
        empname=name;
    }

    public static void main(String[] args) {
        //static methods:
//        display();
//        System.out.println(square(5));
//        System.out.println(reverse("yuvi"));
//        System.out.println(uppercase("yuvaraj"));

        //instance methods:
        StaticAndInstanceMethods obj=new StaticAndInstanceMethods();
        obj.setinfo("yuvi", 97);
        obj.getinfo();
//        obj.setinfo("ram", 59);
//        obj.getinfo();
        obj.updatename("yesh");
        obj.getinfo();
    }
}
