import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {

       TreeSet obj=new TreeSet();
        obj.add(100);
        obj.add(50);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        obj.add(75);//Duplicates is not Alllowed
      //  obj.add("Anu");// Homogeneous data cant stored
        System.out.println(obj);

        //Some fucntion Worked
        System.out.println( obj.higher(50));
        System.out.println( obj.lower(50));
        System.out.println( obj.ceiling(50));
        System.out.println(obj.floor(50));


    }
}
