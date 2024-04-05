public class complex {
    double real, img;

    complex(double real, double img) {
        this.real = real;
        this.img = img;
    }
    complex(){
        real = 0;
        img = 0;
    }

    void add(complex c1, complex c2) {
        real = c1.real + c2.real;
        img = c1.img + c2.img;

        System.out.println("Addition - Real: " + real + ", Imaginary: " + img);
    }
    void subtract(complex c1, complex c2) {
        real = c1.real - c2.real;
        img = c1.img - c2.img;

        System.out.println("Subtraction - Real: " + real + ", Imaginary: " + img);
    }
    
    void multiply(complex c1, complex c2) {
        real = c1.real * c2.real - c1.img * c2.img;
        img = c1.real * c2.img + c1.img * c2.real;

        System.out.println("Multiplication - Real: " + real + ", Imaginary: " + img);
    }

    void divide(complex c1, complex c2) {
        double denominator = c2.real * c2.real + c2.img * c2.img;
        real = (c1.real * c2.real + c1.img * c2.img) / denominator;
        img = (c1.img * c2.real - c1.real * c2.img) / denominator;

        System.out.println("Division - Real: " + real + ", Imaginary: " + img);
    }
    public static void main(String args[]) {
        complex c1 = new complex(3.5, 5.5);
        complex c2 = new complex(4.5, 6.5);
        complex temp = new complex();
        temp.add(c1, c2);
        temp.subtract(c1, c2);
        temp.multiply(c1, c2);
        temp.divide(c1, c2);
    }
}
