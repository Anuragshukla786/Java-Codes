//Single level Inheritance
class Animal
{
    void sleep()
    {
        System.out.println("Animal need Sleep");
    }
}
class Tiger extends Animal
{

}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Lion t=new Lion();
        t.sleep();

    }
}
