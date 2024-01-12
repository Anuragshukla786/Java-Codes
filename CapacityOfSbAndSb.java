public class CapacityOfSbAndSb {
    public static void main(String[] args) {
 //gAlways capacity is increment by +1 multipy by 2
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("anuragshuklaamit");
        System.out.println(sb.capacity());
        sb.append("S");
        System.out.println(sb.capacity());

        //StringBuffer it creates an Empty string with the Specified initial Capacity
        StringBuffer sb1=new StringBuffer(19);
        System.out.println(sb1.capacity());//19

        StringBuffer sb2=new StringBuffer("Anurag");
        System.out.println(sb2.capacity());
        //Method Chaining

        StringBuffer sb3=new StringBuffer();
        sb3.append("anurag").insert(6,"Shukla").reverse().append("Ji").delete(0,4).reverse();
        System.out.println(sb3);

        //



    }
}
