//We are achieve lambda Expression only for a Function Interface
interface Car2
{
    //Function interface in which only one abstract method is used
    void drive();
}
public class LambdaExpression1 {
    public static void main(String[] args) {
        //Zero parameter Lambda expression
        Car2 obj=()-> System.out.println("Driving");
        obj.drive();

    }
}
