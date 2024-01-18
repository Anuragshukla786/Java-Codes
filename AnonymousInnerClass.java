//We are create Anonymous  inner class
interface Car1
{
    void drive();
}
//We have need one time use any interface class we are Anonymous inner class
//class  Audi implements  Car1
//{
//    public  void drive()
//    {
//        System.out.println("Drive...");
//    }
//}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Car1 obj=new Car1()
        {
            public void drive()
            {
                System.out.println("Driving...");
            }
        };
        obj.drive(); //we call the method override in Anonymous inner class
    }
}
