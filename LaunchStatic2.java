public class LaunchStatic2 {

        static int age;//first execute

        static {//second
            age=18;
            System.out.println("Static block  are first Execute  program Loading Ke time");
            System.out.println(age);
        }
        static  void disp()//
        {
            System.out.println("Static  Disp method main ke bad execute hoga jab call karenge");
        }
        public static void main(String[] args) {
            System.out.println("Main Method Baad Me Execute hoga");
            LaunchStatic2.disp();
        }
    }

