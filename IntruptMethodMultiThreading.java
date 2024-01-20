class Earth implements  Runnable
{
    public  void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Focus is Important");
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread is Interrupt");
            }
        }
    }
}
public class IntruptMethodMultiThreading {
    public static void main(String[] args) {

        System.out.println("Main Thread");
        Earth e=new Earth();
        Thread t=new Thread(e);
        t.start();
        t.interrupt();


    }
}
