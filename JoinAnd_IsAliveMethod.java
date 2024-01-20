class Brother1 implements  Runnable
{
    public void run()
    {
        try{
            for(int i=0;i<2;i++)
            {
                System.out.println("Focus is important");
                Thread.sleep(3000);
            }

        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
    }
}
public class JoinAnd_IsAliveMethod {
    public static void main(String[] args) throws  Exception
    {
        System.out.println("Main Thread");
        Brother1 b=new Brother1();
        Thread t=new Thread(b);
        System.out.println(t.isAlive());

        t.start();
        System.out.println( t.isAlive());
        t.join();
     
        System.out.println("Mai thread finished The Work");
    }
}
