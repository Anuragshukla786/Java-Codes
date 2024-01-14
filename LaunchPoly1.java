class AeroPlane1
{
    public  void takeOff()
    {
        System.out.println("Aeroplane is Taking off");
    }
    public  void fly()
    {
        System.out.println( "Aeroplane is now going for a fly");
    }
}
class CargoPlane1 extends AeroPlane1
{
    public  void takeOff()
    {
        System.out.println("CargoPlane1 is Taking off");
    }
    public  void fly()
    {
        System.out.println( "CargoPlane1 flies on middle height");
    }
}
class PassengerPlane2 extends AeroPlane1
{
    public  void takeOff()
    {
        System.out.println("PassengerPlane is Taking off");
    }
    public  void fly()
    {
        System.out.println( "PassengerPlane Flies on lower height");
    }
}
public class LaunchPoly1 {
    public static void main(String[] args) {
        CargoPlane1 cp=new CargoPlane1();
        PassengerPlane2 pp=new PassengerPlane2();
        AeroPlane1 ref;//we are create Parent class of reference variable
        ref=cp;
        ref.fly();
        ref.takeOff();
     //using one Parent class object access all child class's a method
        System.out.println("----------------------------------------------------");
        ref=pp;
        ref.fly();
        ref.takeOff();



    }
}
