//handling and ducking the Exception
class Phone
{
    public  void redmi() throws  Exception
    {
        iPhone();
    }
    public  void iPhone()throws  Exception
    {
        int num1=8;
        int num2=0;
        int result=num1/num2;
        System.out.println(result);
    }
}
public class DuckingAndHandlingException {
    public static void main(String[] args) {
    Phone obj=new Phone();
    //We are solve the exception because sometime we are create multiple method and in all method
        //Exception are occur and We are call all object in try block of main method
    try {
        obj.redmi();
    }
    catch (Exception e)
    {
        System.out.println("Error");
    }

    }

}
