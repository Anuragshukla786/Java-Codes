class AeroPlane2
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
class CargoPlane2 extends AeroPlane2
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
class PassengerPlane3 extends AeroPlane2
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
class FighterPlane extends AeroPlane2
{
    public  void takeOff()
    {
        System.out.println("FighterPlane is Taking off");
    }
    public  void fly()
    {
        System.out.println( "FighterPlane Flies on Top of the Height");
    }
}
class Airport
{
    public void poly(AeroPlane2 ref)
    {
        ref.fly();
        ref.takeOff();
        System.out.println("------------------------------");
    }
}
public class LaunchPoly2 {
    public static void main(String[] args) {
        CargoPlane2 cp=new CargoPlane2();
        PassengerPlane3 pp=new PassengerPlane3();
        FighterPlane fp=new FighterPlane();
        Airport ar=new Airport();
        ar.poly(cp);
        ar.poly(pp);
        ar.poly(fp);






    }
}
