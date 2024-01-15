//clas final
class Dog // Declare  Class Is Final We cannot Inherit in Child Class
{
  final   public void Animal() //We are declare method is Final It is Participate on Inheritance
            //But can't override in Child class
    {
        System.out.println("THis is animal");
    }
}
class PuppyDog extends Dog
{

}
public class FinalKeyWord {
    public static void main(String[] args) {
        PuppyDog pd=new PuppyDog();
        pd.Animal();

    }
}
