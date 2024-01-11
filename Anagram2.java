//Anagram find using user input

import java.util.Arrays;
import java.util.Scanner;
public class Anagram2 {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Any first Word:");
        s1=sc.nextLine();

        System.out.println("Create Anagram to Using First  Word: ");
        s2=sc.nextLine();

        s1=s1.replace(" ","");
        s2=s2.replace(" ","");

        s1=s1.toUpperCase();
        s2=s2.toUpperCase();

        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("it is an anagram:");
        }
        else
        {
            System.out.println("It is not an anagram");
        }
    }
}
