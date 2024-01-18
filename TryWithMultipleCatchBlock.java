public class TryWithMultipleCatchBlock {
    public static void main(String[] args) {
        int a=6;
        int b=2;
        int result=0;
        int value[]={2,3,4,5,6};
        String name=null;

        try
        {
            result=a/b;
            System.out.println(value[7]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divisible by Zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong..");
        }
    }
}
