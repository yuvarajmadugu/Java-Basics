public class forEachLoop {
    public static void main(String[] args) {
//Method 1:
//        Employee[] emp=new Employee[5];
//        emp[0] = new Employee();
//        emp[0].empname="yuvi";
//        emp[0].salary=659484.23;
//        emp[0].display();

//Method 2:
        String[] names={"uv","raj","yuvv"};
        double[] salary={554.25,894.6,655.65};
        System.out.println(names[1]);
        System.out.println(salary[1]);
        Employee[] emp= {new Employee(),new Employee(),new Employee()};

        //forEachloop: // enhanced loops
        int[] numbers={1,2,3,4,5};
        for (int num:numbers){
            System.out.println(num);
        }
    }
}
class Employee{
    String empname;
    double salary;

    void display(){
        System.out.println("Employee name: "+empname+", "+"Employee salary: "+salary);
    }
}