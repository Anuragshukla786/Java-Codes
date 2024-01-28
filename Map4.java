import java.util.*;
class Employs
{
    private String name;
    private int  age;

    public Employs(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return  age;
    }
   //override to string method this method is present in a object class
    public  String toString()
    {
        return name +" ";
    }
    //after invoke garbage collector it is call the finalize method internally to a object class
    // and We are Override this method
//    @Deprecated
//    public void finalize()
//    {
//        System.out.println("Cleanup work by garbage collector before deAllocating memory from heap");
//    }
    //Yes it could be used in wrong way (like save an object from garbage
    // collecting [only one time though] or try to close some native resources within it
    // [it's better than don't close at all though]) as well as many other methods could be used wrongly

}
public class Map4 {
    public static void main(String[] args) {

        Employs e=new Employs("Anurag",21);

        HashMap hm=new HashMap();
        hm.put(e,"Anu");
        System.out.println(hm);

        e=null; //We are initialize the value of reference of Employe object is null

        System.gc();//We are invoke garbage collection using this Method
        //We are invoke  Garbage collection method it is call internally method finalize() method this method
        //is present in a object class it helps the cleanup of the garbage collector
        System.out.println(hm);
        System.out.println("last line");

    }
}
