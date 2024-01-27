import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Map1 {
    public static void main(String[] args) {

        HashMap hm=new HashMap();
        //we are used A put method to insert a object in a collection
        hm.put(1,"Anurag");
        hm.put(2,"Shukla");
        hm.put(3,"Amit");
        hm.put(4,"Ankit");
        System.out.println(hm);
        System.out.println("*******************");

        HashMap hm1=new HashMap();
        //we are used A put method to insert a object in a collection

        //But these keys and values are not a printed in a same order
        //We are printed in a same order We are used a linkedHashMap
        hm1.put("Mannu","Anurag");
        hm1.put("Nitish","Nikhil");
        hm1.put("Anurag","Nikhil");
        hm1.put("Rupesh","Ankit");
        System.out.println(hm1);
        System.out.println("*******************************");
        LinkedHashMap hm2=new LinkedHashMap();
        hm2.put("Mannu","Anurag");
        hm2.put("Nitish","Nikhil");
        hm2.put("Anurag","Nikhil");
        hm2.put("Rupesh","Ankit");
        System.out.println(hm2);
        //we are add all hm1 hm2 using putAll Method
       hm2.putAll(hm1);
        System.out.println(hm2);
    }

}
