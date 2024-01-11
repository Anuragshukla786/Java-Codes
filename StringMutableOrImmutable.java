public class StringMutableOrImmutable {
    public static void main(String[] args) {

        //immutable String In which every time create new Object
        String brand1="Anurag";
        System.out.println(brand1);
        brand1.concat("Shukla");
        System.out.println(brand1);

        //immutable String In which Changes are in Same of Object

        StringBuffer brand2= new StringBuffer("Anurag");
        System.out.println(brand2);

        brand2.append("Shukla");
        System.out.println(brand2);


    }
}
