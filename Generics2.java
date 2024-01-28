import java.util.*;
class Student6
{
    private  String name;
    private int age;
}
class Employs2
{
    private  String name;
    private int id;
}
public class Generics2 {
    public static void main(String[] args) {
        Student6 at=new Student6();
        Student6 at1=new Student6();

        Employs2 emp=new Employs2();

        ArrayList<Student6> a1=new ArrayList<Student6>();
          a1.add(at);
          a1.add(at1);
        System.out.println(a1);

         // a1.add(emp);



    }
}
