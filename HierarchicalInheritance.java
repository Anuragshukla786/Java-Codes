//HierarchicalInheritance
class Animal2
{
    void sleep()
    {
        System.out.println("Animals need Good Sleep");
    }
}
class Monkey extends  Animal2
{

}
class Lion extends Animal2
{

}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Lion l=new Lion();
        l.sleep();

    }
}
