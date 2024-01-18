public class ExceptionHandling1 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int result=0;
        try
        {//in this block we write a critical or logical Statement Jha Exception AA skte hai
            result=a/b;
        }

        //ye block exception ko catch krega and after exception occur what we are
            //What do we have to print after the exception is locked? We will write
            // //it inside the catch block to be visible to the user.
        catch (Exception e)
        {
            System.out.println("Error:....."+e);
        }
        System.out.println("Bye");
    }
}
