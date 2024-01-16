interface  Animal3
{
    void dog();
    //Feature of java 8 is We can define a Methods in a interface But using
    //Default or static Keyword

    //But we called a default method creating a object in a main method
   default   void puppyDog()
    {
        System.out.println("Puppy Dog drink the milk");
    }
  // Static method is call in a main class Directly  Because we dont create a object of
    //Static method or class  Jvm called directly Without Create object
    static void  beeping()
    {
        System.out.println("Puppy dog is Crying");
    }
}
class  Elephant implements Animal3
{
    //But we have to override the abstract method of interface in a child class.
    public  void dog()
    {
        System.out.println("Dog is Barking");
    }
}
public class java8Features {
    public static void main(String[] args) {
        Animal3 obj=new Elephant();
        Animal3.beeping(); //We are call static method using
        obj.dog();
        obj.puppyDog();


    }
}
