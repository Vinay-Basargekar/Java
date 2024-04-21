import java.util.Scanner;

abstract class Shape{
    double a;
    double b;

    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
    }
    abstract void compute_area();
}

class Triangle extends Shape{
    void compute_area(){
        double ar = (1.0/2)* a * b;
        System.out.println("Area of Triangle: "+ ar);
    }
}

class Rectangle extends Triangle{
    void compute_area(){
        double ar1 = a * b;
        System.out.println("Area of Rectangle: "+ ar1);
    }
}

public class Area {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        t.input();
        t.compute_area();
        r.input();
        r.compute_area();
    }
}
