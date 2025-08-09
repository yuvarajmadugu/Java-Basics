public class StudentInfo {
    String name;
    int age;

    void display()
    {
        System.out.println("the name is " + name + " and age is " + age);
    }
}
class StudentMain
{
    public static void main(String[] args)
    {
        StudentInfo s1 = new StudentInfo();
        s1.name="uv";
        s1.age=18;
        s1.display();
    }
}

