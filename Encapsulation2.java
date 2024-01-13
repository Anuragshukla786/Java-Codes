class Demo{

    private int age;
    private String name;

    public  void setAge(int age)
    {
        this.age=age;
    }
    public  int getAge()
    {
        return age;
    }

    public  void  setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {

        return name;
    }

    public void showData()
    {
        System.out.println(name +" "+age);
    }
}
public class Encapsulation2 {
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Demo obj2=new Demo();
        obj1.setAge(12);
        obj2.setAge(13);
        obj1.setName("anurag");
        obj2.setName("Shukla");

        int stud1Age=obj1.getAge();
        System.out.println(stud1Age);
        int stud2Age=obj2.getAge();
        System.out.println(stud1Age);



    }
}
