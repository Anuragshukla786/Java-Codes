import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
    public static void main(String[] args) {

        List obj=new LinkedList();
        obj.add(12);
        obj.add(13);
        obj.add(15);
        obj.add(16);
        System.out.println(obj);

        System.out.println( obj.indexOf(13));
        System.out.println( obj.get(2));
        System.out.println( obj.lastIndexOf(15)) ;

        System.out.println("**************************************************");
        Deque obj1=new LinkedList();
        obj1.add(12);
        obj1.add(13);
        obj1.add(15);
        obj1.add(16);
        System.out.println(obj1);
        System.out.println(obj1.getFirst());
        System.out.println(obj1.getLast());
        obj1.push(12);
       // obj1.pop();

    }
}
