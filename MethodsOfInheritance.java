//Important Methods in Inheritance
class Aeroplane {
    void takeOff()//Overridden Method
    {
        System.out.println("Aeroplane is taking Off");
    }

    void fly()//overridden method in Inheritance
    {
        System.out.println("Aeroplane is Flying");
    }
}

class CargoPlane extends Aeroplane {
    void fly() //override Method
    {
        System.out.println("CargoPlane Flying at lower height");
    }

    public void carryGoods()//Specialized method
    {
        System.out.println("Cargo plane carries goods");
    }
}

class PassengerPlane extends Aeroplane {
    public void fly() //override Method
    {
        System.out.println("PassengerPlane Flying at medium Height");
    }
    public void carries()
    {
        System.out.println("Carries student");
    }

}

public class MethodsOfInheritance {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.carryGoods();

        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.takeOff();
        pp.carries();


    }
}
