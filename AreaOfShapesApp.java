import java.util.Scanner;

abstract class Shape {
    float area;

    abstract public void input();

    abstract public void compute();

    public void disp() {
        System.out.println("The Area  is :" + area);
    }
}

class Rectangle1 extends Shape {
    float length;
    float breadth;

    public void input() {
        System.out.println("Calculate area of Rectangle:");
        Scanner sc = new Scanner(System.in);
        System.out.println("LengthOf rectangle:");
        length = sc.nextFloat();
        System.out.println("Breadth of rectangle:");
        breadth = sc.nextFloat();
    }

    public void compute() {
        area = length * breadth;
    }


}

//Find Are of Square
class Square1 extends Shape {
    float length;

    public void input() {
        System.out.println("Calculate area of Square:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Length Of Square:");
        length = sc.nextFloat();

    }

    public void compute() {
        area = length * length;
    }

}

//Find Area of circle
class Circle1 extends Shape {
    float radius;

    public void input() {
        System.out.println("Calculate area of Circle:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius  of Circle:");
        radius = sc.nextFloat();

    }

    public void compute() {
        area = 3.14f * radius * radius;
    }
}

class Geometry {
    public void poly(Shape ref) {
        ref.input();
        ref.compute();
        ref.disp();
    }
}

public class AreaOfShapesApp {
    public static void main(String[] args) {

        Rectangle1 rec = new Rectangle1();
        Circle1 cr = new Circle1();
        Square1 sq = new Square1();
        Geometry ppm = new Geometry();

        ppm.poly(rec);
        ppm.poly(cr);
        ppm.poly(sq);

    }
}
