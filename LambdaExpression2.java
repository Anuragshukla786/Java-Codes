interface  Calc1
{
    void value(int avg ,int ts);
}
public class LambdaExpression2 {
    public static void main(String[] args) {
        Calc1 obj= (int avg,int ts) -> {
            System.out.println("Driving..." + avg +":"+ts);
        };
        obj.value(12,12);


    }
}
