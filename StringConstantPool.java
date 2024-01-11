public class StringConstantPool {
    public static void main(String[] args) {

        // object are create in a region Of a Heap Area string constant Pool

        String s1="Anurag";
        System.out.println(s1);
        String s2="Anurag";
        System.out.println(s2==s1);

        //Object are crete in a heap area and refer to different object
        String s3= new String("Anurag");
        System.out.println(s2==s3);
        String s4= new String("Anurag");
        System.out.println(s1==s4);




    }
}
