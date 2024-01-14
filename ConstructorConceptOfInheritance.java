class Brother
{
    public int a;
    public  int b;

    public Brother()
    {
        this(12,13);
        System.out.println("Default Parent class Constructor");
    }
    public Brother(int x,int y)
    {
        super();
        System.out.println("Parent class Parametrized Constructor");
        a=x;
        b=y;
    }
}
class Sister extends Brother
{
    public int m;
    public int n;
    public Sister()
    {
        super(12,12);
        System.out.println("Default constructor of child class");
    }
    public Sister(int x ,int y)
    {
        super();
        System.out.println("Parametrized Constructor of child class");
        m=x;
        n=y;
    }
}
public class ConstructorConceptOfInheritance {
    public static void main(String[] args) {
        Sister s1=new Sister();


    }
}
