public class Pangram2 {
    public static void main(String[] args) {
        boolean flag = false;
        String s1 = "Abc def GhI j klm no p q  ST uv W x Y z";

        s1 = s1.replace(" ", "");
        s1 = s1.toUpperCase();

        char ch[] = s1.toCharArray();

        int arr[] = new int[26];
        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 65]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("it is not pangram");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("it is pangram");
        }
    }
}

