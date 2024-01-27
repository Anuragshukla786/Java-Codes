import kotlin.collections.ArrayDeque;

import java.util.LinkedList;
import java.util.List;

public class ArrayDeque1 {
    public static void main(String[] args) {

         ArrayDeque obj=new ArrayDeque();
        obj.add(12);
        obj.add(13);
        obj.add(13);
        obj.add(15);
        obj.add(16);
        System.out.println(obj);

        obj.addFirst(100);
        obj.addLast(100);
        System.out.println(obj);



    }
}
