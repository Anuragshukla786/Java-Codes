public class MutableString {
    public static void main(String[] args) {
    // using StringBuffer Mutable string
        StringBuffer sb=new StringBuffer("virat");
        System.out.println(sb);
        sb.append("kohli");
        System.out.println(sb);

        //Using StringBuilder
        StringBuilder sb1=new StringBuilder("Anurag");
        System.out.println(sb1);
        sb1.append("Shukla");
        System.out.println(sb1);



    }
}
