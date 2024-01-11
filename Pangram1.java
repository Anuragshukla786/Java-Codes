public class Pangram1 {
    public static void main(String[] args) {

        boolean flag = false;
        String s1 = "The Quick Brown Fox Jumps Over lazy Dog";
        // String s2="";

        s1 = s1.replace(" ", "");//Remove White Space
        s1 = s1.toUpperCase();//Convert in Upper Case

        char ch[] = s1.toCharArray(); //create a character array in which store all Alphabets

        //Create one blank integer Array Store The all Alphabet after find Pangram

        int arr1[] = new int[26];

        for (int i = 0; i < ch.length; i++) {
            arr1[ch[i] - 65]++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                System.out.println("it is  not pangram");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("it is pangram");
        }
    }
}

