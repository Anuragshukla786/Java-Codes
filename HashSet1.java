import java.util.HashSet;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] args) {

        HashSet obj=new HashSet();
        obj.add(100);
        obj.add(50);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        obj.add(75);//Duplicates is not Alllowed
          obj.add("Anu");// Homogeneous data can be  stored in this collection data structure
        System.out.println(obj);


    }
}
