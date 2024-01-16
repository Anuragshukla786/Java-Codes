class Overload
{
    int  add( int a ,int b)
    {
        return a+b;
    }
    int  add(int a,int b,int c)
    {
        return  a+b+c;
    }
    double add(double a,double b,int c)
    {
        return a+b+c;
    }
}
public class MethodOverloading2 {
    public static void main(String[] args) {
        Overload ov=new Overload();
        System.out.println( ov.add(12.1,2.3,2));
        System.out.println( ov.add(12,56,7));
        System.out.println(  ov.add(12,34));



    }

}
