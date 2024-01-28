import java.util.ArrayList;

public class Generics1 {
    public static void main(String[] args) {

        //We are worked with array with typesafty
        String ar[]=  new String[10];
        ar[0]="Anurag";
        ar[1]="Shukla";
     //   ar[2]=12;// we are give a value integer type it gives the runtime error
        String name1=ar[0];
        String name2=ar[1];

        //We are achieve typesafty  Using generics  in collection

        ArrayList<String> al=new ArrayList<String>(); //We are define a type of date ij a genrics
            al.add("Anurag");
            al.add("Shukla");
           // al.add(10);//it gives the compile time error because we are store a value String type
        System.out.println(al);





    }
}
