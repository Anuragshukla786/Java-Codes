interface Computer
{
   void compileCode();

}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("He got 5 Error, faster");
    }
}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("He got 5 Error");
    }
}
class Developer
{
    public void buildApp()
    {
        System.out.println(" Developer Build The New Application");
    }
}
public class InterfaceWithMultipleInheritance {
    public static void main(String[] args) {

        Computer obj=new Desktop();
        obj.compileCode();
        Computer obj1=new Laptop();
        obj1.compileCode();
        Developer d=new Developer();
        d.buildApp();


    }
}
