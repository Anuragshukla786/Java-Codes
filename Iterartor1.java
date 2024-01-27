import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Iterartor1 {
    public static void main(String[] args) {
//Iterator is used collection of all Classes
        ArrayList obj=new ArrayList();
        obj.add(100);
        obj.add(50);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        System.out.println(obj);

        //But using for loop   It not a efficient way to  perform iterator
      //  for(int i=0;i<obj.size();i++)
      //  {
       //     Object itr=obj.get(i);
      //      System.out.println(itr);
       // }

        //Enhance or loop

       //  for(Object a:obj)
      //  {
      //      System.out.println(a);
      //  }


        //good Approach fetching data is is Using Iterator

        Iterator itr=obj.iterator();
        while(itr.hasNext())
        {
         //   Iterator it=(Iterator) itr.next(); //downcasting  of iterator
            System.out.println(itr.next());
        }

     //   ListIterator itr1=obj.listIterator();
     //   while(itr1.hasPrevious())
       // {
            //   Iterator it=(Iterator) itr.next(); //downcasting  of iterator
       //     System.out.println(itr1.previous());

       // }


    }

}
