//
public class LaunchStatic {

    static int age;

    static {
        age=18;
        System.out.println("Static block  are first Execute  program Loading Ke time");
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println("Main Method Baad Me Execute hoga");
    }
}
