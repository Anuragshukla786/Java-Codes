import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class CollectionClass {
    public static void main(String[] args) {

        ArrayList obj=new ArrayList();
        obj.add(100);
        obj.add(50);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        System.out.println(obj);
        System.out.println("****************************************");
        //using collection Class Sort the data
        Collections.sort(obj);
        System.out.println(obj);
        System.out.println("****************************************");
        //We are apply collections in a string
        ArrayList<String> obj1=new ArrayList<String>();
        obj1.add("Anurag");
        obj1.add("Shukla");
        obj1.add("Amit");
        System.out.println(obj1);
        System.out.println("****************************************");
        Collections.sort(obj1);
        System.out.println(obj1);
        System.out.println("****************************************");

        //we are find a index value using binarysearch() method

        ArrayList obj2=new ArrayList();
        obj2.add(100);
        obj2.add(50);
        obj2.add(150);
        obj2.add(25);
        obj2.add(25);
        obj2.add(75);
        System.out.println(obj2);
        System.out.println("****************************************");
        int index=Collections.binarySearch(obj2,20);
        System.out.println("Index is:"+index);
        System.out.println("****************************************");
        //We are rotate a vaue according to give a index
        Collections.rotate(obj2,2);
        System.out.println(obj2);
        System.out.println("****************************************");
        //We are sufle a value in descending order
        Collections.shuffle(obj2);
        System.out.println(obj2);
        System.out.println("****************************************");
        //We are find  a frequency of oa Duplicate object
        Collections.frequency(obj2,25)        ;
        System.out.println(obj2);
    }
}
