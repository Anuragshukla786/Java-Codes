
class Demo4
{
    void disp()
    {

        System.out.println("Display parent class Demo4");
    }
}
class  Demo5 extends  Demo4
{

}
class  Demo6 extends Demo5
{

}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Demo6 d=new Demo6();
        d.disp();

    }
}
