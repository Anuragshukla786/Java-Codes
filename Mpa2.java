import com.sun.jdi.Value;

import java.util.*;

public class Mpa2 {
    public static void main(String[] args) {

        //How to access data jo data Map ke Andr hai Using Map tYpe reference
        //and Hashmap Type object
        Map mp=new HashMap();
        mp.put(1,"Anurag");
        mp.put(2,"Shukla");
        mp.put(3,"Amit");
        mp.put(4,"Ankit");
        System.out.println(mp);
        //We are Access all data passing a key in a get() method
        System.out.println(mp.get(4));

        System.out.println("*****************************************");
        //We are access only keys from Collection To using keySet() Method
        //and use A iterator to move next object of a collection

        Set keySet=mp.keySet();
        Iterator itr=keySet.iterator();
            while(itr.hasNext())
            {
                //this approach is store a data in a object form
               // System.out.println(itr.next());
                //We are store a data in a Integer form We are  use a Integer type refrence
                //and down cast a object into integer
               Integer key=(Integer)itr.next();
                System.out.println(key);
            }

        System.out.println("****************************************");
            //we are access only Values passing in a collection  to using Values()
        //and use Collection type Interface Reference

        Collection values=mp.values();
            Iterator itr2=values.iterator();
            while(itr2.hasNext())
            {
               // System.out.println(itr2.next());

                //but we are store a value as a String in a collection
                String st=(String)itr2.next();
                System.out.println(st);
            }
        System.out.println("***************************************");

            //access all values and keys using entrySet() method
        Set  entrySet=mp.entrySet();
        //set is a refrence of a Set Interface
        Iterator itr3=entrySet.iterator();
        while (itr3.hasNext())
        {
           // System.out.println(itr3.next());
           Map.Entry data=(Map.Entry)itr3.next();
            System.out.println(data.getKey()+":"+data.getValue());
        }

    }
}
