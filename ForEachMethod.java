import java.util.*;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {

//        List<Integer> list1=new ArrayList<Integer>();
//        list1.add(2);
//        list1.add(4);
//        list1.add(6);
//        list1.add(8);
//        list1.add(10);
//        System.out.println(list1);

        //We are use Collection using Arrays.asList() this method This method is present in List Interface
        List<Integer> list2= Arrays.asList(2,4,6,8,10);
        System.out.println(list2);

        //loop are not a efficient  way to access object But This is extrnally Implementation
//        for(Integer i:list2)
//        {
//            System.out.println(i);
//        }

        //Efficient Way is perform internally implementation in collection
        //We are use a forEach() Method



       // list2.forEach(n-> System.out.println(n));



        //ye method internally expect krega ki hum implementation de
        //In java some Inbuilt functional interface are present
        //Functional intreface in which only one abstract method or abstract method ki implementation nhi hoti

        //We have one inbuilt interface Consumer and we give the implementation of this interface
        //in foreach method.

        //We give the implementation of consumer interface to create a Anonymous inner class


        //First Way to give implementation
//        Consumer<Integer> cons=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer)
//            {
//                System.out.println(integer);
//            }
//        };
//        list2.forEach(cons);
        //output2
        //4
        //6
        //8
        //10

        //2nd Way to give implementation

//        Consumer<Integer> cons=(Integer integer)->
//        {
//            System.out.println(integer);
//        };
//
//        list2.forEach(cons);
        //output
        //2
        //4
        //6
        //8
        //10

        //3rd way Give Implementation of Consumer interface using lambda Expression
//        Consumer<Integer> cons=integer -> System.out.println(integer)
//
//        list2.forEach(cons);
//


        //4th way
        list2.forEach(i -> System.out.println(i));
        //output
        //2
        //4
        //6
        //8
        //10





    }
}
