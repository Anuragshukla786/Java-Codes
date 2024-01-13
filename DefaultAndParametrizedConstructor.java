import javax.xml.namespace.QName;

class Demo2
{
    private  int a;
    private String name;

    Demo2()//Default constructor
    {

    }
     public Demo2(int a ,String name)//Parametrized Constructor
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
public class DefaultAndParametrizedConstructor {
    public static void main(String[] args) {
        Demo2 d1=new Demo2();
        d1.disp();
        Demo2 d2=new Demo2(10,"Anurag");
        d2.disp();


    }
}
