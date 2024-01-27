import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {

        PriorityQueue obj=new PriorityQueue();
        obj.add(100);
        obj.add(50);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        obj.add(75);
      //  obj.add("anu");
        obj.add(125);
        obj.add(175);
        System.out.println(obj);

        //output [25, 50, 125, 100, 75, 150, 175]


    }
}
