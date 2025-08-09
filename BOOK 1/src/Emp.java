public class Emp {
    String name;
    int age;
    double salary;

    void display() {
        System.out.println("Employee name is " + name + " employee is " + age + " years old " + " amount credited is " + salary);
    }
}
class EmpMain
{
    public static void main(String[] args){
        Emp e1 = new Emp();
        e1.name = "John";
        e1.age = 25;
        e1.salary = 50.78;
        e1.display();
    }
}

