public class TypeCasting {
    public static void main(String[] args) {
       // implicit TypeCasting Because  compiler change 
       //by itself 
        int a=45;
        double b;
        b=a;
        System.out.println(b);

        // Explicit typecasting This casting is perform by
        //a develoer
        double  num1=4.55;
        int num2;
        num2=(int)num1;
        System.out.println(num2);

        // Always integer divide by integer Answer will be
        //Integer
        int n1=12;
        int n2=5;
        float res=n1/n2;
        System.out.println(res);

    }
    
}
