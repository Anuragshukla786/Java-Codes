class Demo3
{
    private int a;
    private String name;

    Demo3()
    {
        System.out.println("Default Constructor is Called");
        a=12;
        name="Anurag";
    }

    Demo3(int a)//Single Parametrized Constructor
    {
        this.a=a;
         name="Shukla";
    }
    Demo3(String name, int a)
    {
        this.a=a;
        this.name=name;
    }
    public void disp()
    {
        System.out.println(a);
        System.out.println(name);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Demo3 d=new Demo3();
        d.disp();

        Demo3 d1=new Demo3(10);
        d1.disp();

        Demo3 d2=new Demo3("Karan", 3);
        d2.disp();

    }
}
