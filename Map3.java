import java.util.*;
class Student4
{
    private String name;
    private int age;
    private String city;

    public Student4( String name, int age, String city )
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getCity()
    {
        return  city;
    }
    public String toString()
    {
        return name +" "+age +" "+ city;
    }
}
public class Map3 {
    public static void main(String[] args) {

        Student4 obj1=new Student4("Anurag",20,"Jalandhar");
        Student4 obj2=new Student4("Anu   ",   21,"Punjab");
        Student4 obj3=new Student4("Amit  ",  22,"UttarPradesh");

        HashMap hm=new HashMap();
        hm.put(1,obj1);
        hm.put(2,obj2);
        hm.put(3,obj3);

        System.out.println(hm);

        Set entrySet=hm.entrySet();
        Iterator itr=entrySet.iterator();
        while(itr.hasNext())
        {
            Map.Entry data=(Map.Entry)itr.next();
            System.out.println(data.getKey()+" :"+data.getValue());
        }

        //he gives the only address of a values because are not a override a method of a
        //object class toString() method We are overide method in Student Class
        //{1=Student4@7b23ec81, 2=Student4@6acbcfc0, 3=Student4@5f184fc6}


    }
}
