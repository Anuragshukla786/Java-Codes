//Abstraction Perform in inheritance
 abstract class AeroPlane5
{
    //Abstraction has no body and definition
  abstract   public void takeOff();

     abstract public void fly();

     //We are create method with Definition We are not a achieve  100% of Abstraction
    public void landing()//Method with body in abstract class
    {
        System.out.println("AeroPlane  is Landing ");
    }
}
class CargoPlane4 extends  AeroPlane5
{
    public void takeOff() //Override method
    {
        System.out.println("CargoPlane is Taking off");
    }
    public void fly() //override Method
    {
        System.out.println("CargoPlane is flying top of the height");
    }
    public void alert() //This is Specialize Method Because It is only present in child class
    {
        System.out.println("Alert...");
    }
}
class PassengerPlane5 extends  AeroPlane5
{
    public void takeOff()
    {
        System.out.println("PassengerPlane is Taking off");
    }
    public void fly()
    {
        System.out.println("PassengerPlane is flying Middle of the height");
    }
}
public class LaunchAbstract1 {
    public static void main(String[] args) {
        AeroPlane5 ref1=new CargoPlane4();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();
        ((CargoPlane4) ref1).alert();
        AeroPlane5 ref2=new PassengerPlane5();
        ref2.takeOff();
        ref2.fly();
        ref2.landing();


    }
}
