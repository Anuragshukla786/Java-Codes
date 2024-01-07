import java.util.*;
public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        
        char operator;
        Double num1 ,num2,result;

        //Create an object of Scanner class
        Scanner sc=new Scanner(System.in);

        //Ask  User to enter operator
        System.out.println("Choose an operator: +, -, *, /, % ");
        operator = sc.next().charAt(0);

        System.out.println("Enter first Number:");
         num1= sc.nextDouble();

        System.out.println("Enter Second Number:"); 
        num2=sc.nextDouble();

        switch(operator)
        {
            case '+':
            result=num1+num2;
            System.out.println(num1 + "+" + num2 + "=" + result);
                break;

            case '-':
             result=num1-num2;
            System.out.println(num1 + "-" + num2 + "=" + result);
            break;

            case '*':
             result=num1*num2;
            System.out.println(num1 + "*" + num2 + "=" + result);
            break;

            case '/':
             result=num1/num2;
            System.out.println(num1 + "/" + num2 + "=" + result);
            break;

            case '%':
            result=num1%num2;
            System.out.println(num1 + "%" + num2 + "=" + result);
            break;


            default:
            System.out.println("invalid operator");
            break;

        }
        sc.close();
    }
    
}
