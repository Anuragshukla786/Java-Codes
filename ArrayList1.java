import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList a1=new ArrayList();

        a1.add(122);
        a1.add("Anurag");
        a1.add("Shukla");

        System.out.println(a1);

        System.out.println("*******************");

        ArrayList a2=new ArrayList();

        a2.add("3");
        a2.add(1.2);
        a2.add('a');

        a2.addAll(a1);
        System.out.println(a2);

        System.out.println("*********************");

        ArrayList a3=new ArrayList();

        a3.add("Ankit Shukla");
        a3.addAll(a2);
        System.out.println(a3);


        //Apply Methods
        System.out.println( a1.contains("Anurag"));
        System.out.println(a1.indexOf(122));
        System.out.println(a2.size());
        a2.ensureCapacity(10);

        a2.trimToSize();
        a2.clear();





    }
}
