class Student {
    //this Private variables We can only Access this class Not a outside the class
    //without using reference
    private int age;
    private String name;


    public void setAge(int age) {
        //Same Name of variable are Outside the Method and in side the class
        //and Same name of variable inside the method

        this.age = age;    //We are are assign Instance Variable to local variable

        // this is problem in java we are also known as this problem is
        //shadowing problem
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }


    public void showData() {
        System.out.println(name + " " + age);
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student d = new Student();
        d.setAge(12);
        d.setName("Shukla");
        d.showData();
        Student d2 = new Student();
        d2.setAge(25);
        d2.setName("Anurag");
        d2.showData();
        int stud1Age=d.getAge();
        System.out.println(stud1Age);

    }
}
