class Demo1
{
    //Static Variable
    static int a;
    static int b;

    //Instance variable
    int m;
    int n;
//Static Block
    static
    {
        a=20;
        b=30;
        System.out.println("Control in Static Block");
    }
    //Initialization Block
    {
        m=100;
        n=200;
        System.out.println("Cotrol in non static Block");
    }
    //Static Method
    static  void disp1()
    {
        System.out.println("value of Static Variable is:"+a);
        System.out.println("value of Static Variable is:"+b);
    }
     void disp2(){
        System.out.println("value of  instance is:"+m);
        System.out.println("value of  instance is:"+n);
    }
}
public class LaunchStatic3 {
    public static void main(String[] args) {

        Demo1 d=new Demo1();
        Demo1.disp1();
        d.disp2();
        
    }
}
