class Student1
{
    private int age;
    private String name;

    Student1()
    {
     this(12,"Anurag");
        age=12;
        name="Anu";
        System.out.println("Default Constructor");
    }
    Student1(int age)//Single Parameterized Constructor
    {
        this();
        System.out.println("One Parametrized Constructor");
        this.age=age;
        name="Karan";

    }
    Student1(int age, String name)//Double Parametrized Constructor
    {
        this.age=age;
        this.name=name;
        System.out.println("Double Parametrized Constructor");
    }
    void disp()
    {
        System.out.println(age);
        System.out.println(name);

    }

}
public class ThisAndSuperMethod {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.disp();
        Student1 s2=new Student1(18);
        s2.disp();

        Student1 s3=new Student1(14,"Shukla");
        s3.disp();

    }
}
