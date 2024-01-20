class Car
{
    private  Engine eng;

    public  Car(Engine eng)
    {
        this.eng=eng;
    }
    public void start()
    {
        eng.startEngine();
    }

    public void drive() {
    }
}
class Engine
{
    public void startEngine()
    {
        System.out.println("Car is Starting");
    }
}
public class DependencyInjection {
    public static void main(String[] args) {
        Engine e=new Engine();
        Car c=new Car(e);
        c.start();


    }
}
