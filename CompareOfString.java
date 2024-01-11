public class CompareOfString {
    public static void main(String[] args) {

        String s1="Anurag";

        String s2=new String("Anurag");
        String s3=new String("ANURAG");

        //compare using == operator
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equalsIgnoreCase(s3));

    }
}
