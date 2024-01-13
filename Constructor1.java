class Boy
{
    private  int age;
    private String name;
//agr hum object creation ke time pe hi initialization krte hai to concept of constructor ka
    //use hota hai
    Boy(String name,int age)//parametrized constructor
    {
       this. name=name;
      this.  age=age;

    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return  age;
    }
}
public class Constructor1
{
    public static void main(String[] args) {
        Boy b1=new Boy("Anurag", 12);
        String name=b1.getName();
        System.out.println(name);

        int age=b1.getAge();
        System.out.println(age);




    }
}
