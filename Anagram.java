import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1="school Master";
        String s2="The Classroom";

        s1=s1.replace(" ","");
        s2=s2.replace(" ","");

        s1=s1.toUpperCase();
        s2=s2.toUpperCase();

        char[] arr1 =s1.toCharArray();
        char[] arr2 =s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("It is an Anagram");
        }
        else
        {
            System.out.println("it is Not an Anagram");
        }
    }
}
