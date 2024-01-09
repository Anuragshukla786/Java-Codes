//Working of Instance Variable
public class Test {
    int a ;
    String name ;

    public static void main(String[] args) {
        //declare the variable
        //create the object

       // int num=9;//Primitive variable wo hote hai
        //jo kisi value ko refer krte hai
        Test obj=new Test();//Refrence variable wo hote hai jo kisi object ko 
        //refer krte hai
        obj.name="Anurag";
       
        System.out.println(obj.a);
        System.out.println(obj.name);

        Test obj2=new Test();

        System.out.println(obj2.a);
        System.out.println(obj2.name);
        
        
    }
    
}
