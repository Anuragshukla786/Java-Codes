public class ImmutabilityOfStringUsingSbAndSb {
    public static void main(String[] args) {

//        final int a=30;
//         a=20;
//        System.out.println(a);

       StringBuffer s1=new StringBuffer("Virat");
        s1.append("kohli");
       // System.out.println(s1);
        s1=new StringBuffer("Anurag");
        System.out.println(s1);

      }

}
