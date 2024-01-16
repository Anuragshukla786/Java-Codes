// We are use a concept Of interface to achieve a concept of Multiple Inheritance
interface  A
{
    int num=7;// In concept of Interface variable are already public static final

    void disp();// Methods are in a interface by default  abstract or public
}
interface  X //hum ek interface ko dusre interface ke inherit kr skte hai using extend keyword
{
    void abc();
}
//If we create an interface then we will have to define the method written
// inside it in the implements class or we can say that we will have to override it.
class B implements  A,X
{
    public  void disp()
    {
        System.out.println("In disp");
    }
    public  void abc()
    {
        System.out.println("In abc");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        //We are not a Create  Object of Interface
        //But we are use a reference  Of A interface
        System.out.println(A.num); // num variable is  Static  So We can Access Name of Interface
        B obj=new B();
        obj.abc();
        obj.disp();

    }
}
