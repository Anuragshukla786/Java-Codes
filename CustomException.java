//Throw the Custom Exception Jab hum khud se koi Exception Create krte hai tb Use throw krne ke liye
//throw keyword ka use krte hai
class MyException extends  Exception
{
    public  MyException()
    {
    }
    public MyException(String msg)
    {
        super(msg); // We are call Parent class of Constructor
    }
}
public class CustomException {
    public static void main(String[] args) {

       int a=8;
       int b=-2;

       try {
           if (b < 0) // Checked value is negative or not
           {
               //We are create own Exception and throw the Exception
               Exception obj=new MyException("Negative Number "); //Call the Exception Create by Developer
               throw  obj;
           }
           else {
               int result=a/b;
               System.out.println(result);
           }
       }
       catch(Exception e)
       {
           System.out.println("invalid no "+e);
       }

    }
}
