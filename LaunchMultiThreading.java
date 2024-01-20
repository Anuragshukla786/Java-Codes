import java.util.Scanner;

public class LaunchMultiThreading {
    public static void main(String[] args)
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

        //Second task Is Started
        System.out.println("Printing * Task Started");
        for(int i=0;i<4;i++)
        {
            System.out.println("*");
        }
        System.out.println("Printing * Task Ended");
        System.out.println("*********************************************");

        //Third Task iS Started
        System.out.println("Displaying important message Task");
        for(int i=0;i<3;i++)
        {
            System.out.println("*");
        }
        System.out.println("Displaying import message task ended");
        System.out.println("***********************************************");

    }
}
