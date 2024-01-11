// Split te Space of A string And reverse a String
public class ReverseOfString3 {
    public static void main(String[] args) {

        String s1="Anurag Shukla";
        String s2 ="";

        String arr[]=s1.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            s2=s2+arr[i]+" ";
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
