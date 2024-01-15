//We create a Simple Application Of find Area of rectangle Area of Square and Area of
//Circle

import java.util.Scanner;

//Find are of Rectangle
class Rectangle
{
    float length;
    float breadth;
    float area;

    public void input()
    {
        System.out.println("Calculate area of Rectangle:");
        Scanner sc=new Scanner(System.in);
        System.out.println("LengthOf rectangle:");
         length=sc.nextFloat();
        System.out.println("Breadth of rectangle:");
         breadth=sc.nextFloat();
    }
    public void compute()
    {
      area=length*breadth;
    }
    public void disp()
    {
        System.out.println("Area of Rectangle is:" +area);
    }

}
//Find Are of Square
class Square
{
    float length;
    float area;

    public void input()
    {
        System.out.println("Calculate area of Square:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Length Of Square:");
        length=sc.nextFloat();

    }
    public void compute()
    {
        area=length*length;
    }
    public void disp()
    {
        System.out.println("Area of Square is:" +area);
    }
}
//Find Area of circle
class Circle
{
    float radius;
    float area;

    public void input()
    {
        System.out.println("Calculate area of Circle:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius  of Circle:");
        radius=sc.nextFloat();

    }
    public void compute()
    {
        area=3.14f*radius*radius;
    }
    public void disp()
    {
        System.out.println("Area of Circle is:" +area);
    }

}
public class LaunchApp {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();
        Square sq=new Square();
        sq.input();
        sq.compute();
        sq.disp();
        Circle cr=new Circle();
        cr.input();
        cr.compute();
        cr.disp();



    }
}
