//Dependency Injection ,How to Dependent object inject in a Target Object class
class Student3 //Target class
{
    private Heart h; //Reference  of a Dependent object class
    public Student3(Heart h )//Constructor Injection of Target class
    {
        this.h=h;
    }
     public  void  setH( Heart h) //Setter Injection
     {
         this.h=h;
     }
    public void call() //Create a method and call a Dependent class s Method using Reference
    {
        h.heartBreak();
    }
}
class  Heart // Dependent class
{
    public void heartBreak()
    {
        System.out.println(" Heart Is Breaking");
    }
}
public class DependencyInjection1 {
    public static void main(String[] args) {
        Heart h=new Heart();
        Student3 s=new Student3(h);
         s.call();
        s.setH(h);

    }
}
