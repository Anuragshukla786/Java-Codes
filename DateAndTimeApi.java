//We are use before java8  use  Date class   it is present in a jvava's Two packages
// util packages ,sql package is used to we are perform any database activity we are useed this package

import java.lang.reflect.Array;
import java.util.ArrayList;

//import java.util.Date; we are import here and in a class
public class DateAndTimeApi {
    public static void main(String[] args) {

        java.util.Date dt=new java.util.Date();
        System.out.println(dt);
        //We are pass Any package in a class
//        java.util.ArrayList a1=new java.util.ArrayList<>();
//        System.out.println(a1);

        long time= dt.getTime();
        java.sql.Date a2=new java.sql.Date(time);
        System.out.println(a2);

        //But we are perform these all are in jav8 withiut using new operator


    }
}
