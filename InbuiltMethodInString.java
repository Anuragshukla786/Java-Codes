public class InbuiltMethodInString {
    public static void main(String[] args) {

        String str="Anurag Shukla Amit Shukla";
        System.out.println(str);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.toString());
        System.out.println(str.length());
        System.out.println(str.charAt(4));

        int length=str.length();

        System.out.println(str.substring(3,8));
     System.out.println(str.indexOf("t"));
      System.out.println(str.lastIndexOf("l"));
   }
}
