import  java.util.*;
class Farmer
{
    int  pa;//Principal amount
    float td;//time duration
    static float ri;//rate of interest
    float si;//simple interest

    static {
        ri=8.5f;
    }

    void input ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mention The Amount required:");
        pa=sc.nextInt();
        System.out.println("Please mention The time Duration:");
        td=sc.nextFloat();

    }
    void compute()
    {
        si=(pa*ri*td)/100f;
    }

    void disp()
    {
        System.out.println("SI is :"+si);
    }

}
public class LaunchFarmerLoanProgram {
    public static void main(String[] args) {
        Farmer f1=new Farmer();
        f1.input();;
        f1.compute();
        f1.disp();

        Farmer f2=new Farmer();
        f2.input();;
        f2.compute();
        f2.disp();


    }
}
