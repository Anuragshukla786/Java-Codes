class Car4 implements  Runnable
{
    public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName()+"Has Entered The parking lot");
            Thread.sleep(2000);
           synchronized (this)
            {
                System.out.println(Thread.currentThread().getName() + "Got into car to Drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Started To Drive The Car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Come Back And Park The Car");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some error");
        }
    }
}
public class MultiThreadingSynchronize {
    public static void main(String[] args) {
        Car4 c=new Car4();

        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();



    }
}

