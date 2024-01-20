//How to Create a Thread
//In java One Default interface are present. In This Interface one Default method Is present Runnable method
//Interface's all Method are bydefaut Public or abstract
class MyThread extends  Thread//We are extend Thread Class and its all features  Are inherit in MyThread class
{
  public void run()
    {
        System.out.println( "Child Thread");
    }
}
public class LaunchMultiThreading3 {
    public static void main(String[] args) {
        MyThread1 t=new MyThread1();
        t.start();// Start method is Using for  Start a thread

    }
}
