import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithFinally {
    public static void main(String[] args) {
        int n=0;
        //But in java8 new feature is we are close the resource using try block
        try(  Scanner sc=new Scanner(System.in))
        {
            n=sc.nextInt();

        }
        catch (InputMismatchException e)
        {
            System.out.println("error");
        }
//        finally
//        { //We are use finally block to close resource and any open file and Scanner class
//            //close in finally block
//            sc.close();
//        }

    }
}
