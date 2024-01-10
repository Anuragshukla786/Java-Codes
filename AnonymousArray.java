class Anonymous
{
    int add(int num[])
    {
        int result=0;
       for(int a :num)
       {
            result=result +a;
       }
           return result;
    }
}
public class AnonymousArray {
    public static void main(String[] args) {
        Anonymous obj= new Anonymous();
        //Create Anonymous Array in this step

        int result=obj.add( new int[]{2, 3, 4});
        System.out.println(result);

    }
}
