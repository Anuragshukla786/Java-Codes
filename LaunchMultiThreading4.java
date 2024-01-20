import java.util.Scanner;

class Calculation extends  Thread
{
    public void run()
    {
        System.out.println("Calculation Task Started");
        //First Activity Perform
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter First Number:");
        int num1=sc.nextInt();

        System.out.println("Please Enter Second Number:");
        int num2=sc.nextInt();

        int result=num1+num2;
        System.out.println(result);
        System.out.println("Calculation Task Ended");

        System.out.println("********************************************");

    }
}
class Star extends Thread
{
    public void run()
    {
        //Second task Is Started
        try {
            Thread.sleep(5000);
            System.out.println("Printing * Task Started");
        }
        catch (Exception e)
        {
            System.out.println("Some problem");
        }
        for(int i=0;i<1;i++)
        {
            System.out.println("Focus is Important to masters any Skills");
        }
        System.out.println("Printing * Task Ended");
        System.out.println("*********************************************");
    }
}
public class LaunchMultiThreading4 {
    public static void main(String[] args) {
        Calculation c=new Calculation();
        c.start();
        Star s=new Star();
        s.start();

    }
}
