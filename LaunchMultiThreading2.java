public class LaunchMultiThreading2 {
    public static void main(String[] args) {
        System.out.println("main Thread");
        System.out.println("Before changing of thread name:");
        String name=Thread.currentThread().getName();
        System.out.println("The Current Thread is:"+name);

        int priority=Thread.currentThread().getPriority();
        System.out.println("Priority of Current Thread is: "+priority);

        //We can change the priority and name of the thread
        System.out.println("After changing name of thread:");
        Thread t=Thread.currentThread();
        t.setName("Anurag");//Set new name of the thread
        t.setPriority(2);//Set The priority of Thread
    }
}
