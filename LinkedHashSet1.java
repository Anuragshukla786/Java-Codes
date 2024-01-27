import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet obj=new LinkedHashSet();
        obj.add(100);
        obj.add(50);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        obj.add(75);//Duplicates is not Alllowed
         obj.add("Anu");// Homogeneous data can be  stored in This Data Structure
        System.out.println(obj);
    }
}
