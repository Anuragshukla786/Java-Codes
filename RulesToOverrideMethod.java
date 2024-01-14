//Never decrease the visibility of a method
//Not a change return type of method
// In a parent class in which a  parameter passed we are not a pass parameter in child class
//this method is make a specialized Method
class Animal1
{
    public void eat()
    {
        System.out.println("animal eat daily chicken");
    }

}
class Tiger2 extends  Animal2
{
   public  void eat()
    {
        System.out.println("Tiger hunts the animal and eat ");
    }
}
public class RulesToOverrideMethod
{
    public static void main(String[] args) {
        Tiger2 t=new Tiger2();
        t.eat();

    }
}
