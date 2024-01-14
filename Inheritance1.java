class Human
{
    private String name;
    int age;

    Human()
    {
        System.out.println("Human class constructor");
    }
    void sleep()
    {
        age=18;
        System.out.println("Humans Needs to good sleep");
        System.out.println(age);
    }
}
class Student2 extends Human
{
//    Human() //every class in which one default constructor is created after creating objct
//    {
//        //super();//Super Method always call parent class of constructor

//    }
    public void disp()
    {
        System.out.println("The age is:"+age);
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        s1.sleep();
        s1.disp();
    }
}
