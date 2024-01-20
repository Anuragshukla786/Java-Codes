class Test1
{
    int x,y;
    Test1()
    {
        x=10;
        y=20;

    }
}
public class ShallowObjectCopy {
    public static void main(String[] args) {
        Test1 obj=new Test1();
        System.out.println(obj.x +" " +obj.y);

        Test1 obj1=obj;
        obj1.x=100;
        System.out.println(obj.x +" "+obj.y);
        System.out.println(obj1.x +" "+obj1.y);

    }
}
