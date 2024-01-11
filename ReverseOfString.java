import java.util.Scanner;
public class ReverseOfString {
    public static void main(String[] args) {
        String s1;
        String s2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Before Reversing of String :");
        s1=sc.nextLine();

        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        System.out.println("After Reversing of String :"+s2);
    }
}
