import java.util.Scanner;

class area_values {
    double a;
    double b;
    double area;

    area_values(double a, double b) {
        this.a = a;
        this.b = b;
    }
}

class arTriangle extends area_values {
    arTriangle(double a, double b) {
        super(a, b); // Call superclass constructor
    }

    void calculate_ar() {
        area = (1.0 / 2) * a * b;
        System.out.println("Area of triangle: " + area);
    }
}

class arRectangle extends area_values {
    arRectangle(double a, double b) {
        super(a, b); // Call superclass constructor
    }

    void calculate_ar_rec() {
        area = a * b;
        System.out.println("Area of rectangle: " + area);
    }
}

public class hierarchical_inheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();

        arTriangle a1 = new arTriangle(a,b); 
        a1.calculate_ar();

        arRectangle a2 = new arRectangle(a,b);
        a2.calculate_ar_rec();
    }
}
