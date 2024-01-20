import java.util.*;
//This Exception is custom Exception
class MyException1 extends  Exception
{

}
class Facebook
 {
    String s1 = "Anurag";
    int a = 12345;
    String s2;
    int b;


    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username :");
        s2 = sc.nextLine();
        System.out.println("Enter Password :");
        b = sc.nextInt();
    }
    public void validation() throws MyException
    {
        if (s1.equalsIgnoreCase(s2) && a == b)
        {
            System.out.println("Welcome to your Account");
        } else {
            MyException m=new MyException();
            throw m;
        }
    }

 }
    class FbCompany
    {
       public void checking()
       {
           Facebook fb = new Facebook();
           fb.input();
           try
           {
               fb.validation();
           }
           catch (MyException e)
           {
               System.out.println("This is not  your Account......");
           }

       }
    }

    public class LoginAccount
    {
       public static void main(String[] args)
       {
            FbCompany fb1=new FbCompany();
             fb1.checking();
       }
   }