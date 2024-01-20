//Different States of Thread
class Demo7 implements  Runnable
{
    public void run() //Thread is in Running State
    {
        System.out.println("Child class Thread Executing");
        try
        {
            Thread.sleep(2000);//Thread is Waiting State
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
        System.out.println("Child class Thread Task Done");//Thread's Task Is Completed Now
        //he is Going on Dead state
    }
}
public class LaunchMultiThreading6 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Demo7 d=new Demo7();
        Thread t=new Thread(d);// Thread is create new State
        t.start();//Thread is Runnable State



    }
}
