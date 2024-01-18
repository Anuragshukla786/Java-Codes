//Inner class Declaring  member class or static class
//We are use only this inner class concept in Lambda expression
class D
{
    public int add(int a,int b)
    {
        return a+b;
    }

    //inner class -declare member class
    class Y
    {
        public double add( double a,double b)
        {
            return a+b;
        }
    }
    //inner class - Declare Static class
     static class Z
    {
        public  String add(String name,String value)
        {
            return name.concat(value);
        }
    }

}
public class InnerClassConcept {
    public static void main(String[] args) {
        // Create a object of outer class
        D obj=new D(); //outer classes of object
        System.out.println( obj.add(12,12));

        D.Y obj1=obj.new Y(); //Member class of object using outer class of object create
        System.out.println(obj1.add(1.2,1.3));

          D.Z obj2 =new D.Z(); //Static class object
         System.out.println(obj2.add("Anurag","Shukla"));


    }
}
