public class ConCatenationOfString {
    public static void main(String[] args) {

//        String s1="Anurag";
//        s1=s1.concat("Shukla");
//        System.out.println(s1);

        String s1="pwjava";
        String s2=s1.concat("Skills");
        String s3=new String("pwjava");
        s3=s3.concat("skills");//Hum jab bhi koi inbuilt method ya refrence ka se krte hai to object of string
        //Heap area me hi  bnti hai
          System.out.println(s1);
          System.out.println(s2);
           System.out.println(s3);

        //ConCatenation Using + Operator
        String b1="Anurag";
        String b2= "Anurag"+"Shukla";
        String b3="Anurag"+"Shukla"+"Amit";
        String b4 = b1 + b2;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
