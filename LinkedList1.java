import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList obj=new LinkedList();

        obj.add(12);
        obj.add("Anurag");
        obj.add('A');
        System.out.println(obj);

        LinkedList obj1=new LinkedList();

        obj1.add("Anurag");
        obj1.add("Shukla");

        System.out.println(obj1);

        LinkedList a1=new LinkedList();
        System.out.println(a1.addAll(obj1));


    }
}
