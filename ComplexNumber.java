public class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber() {
        this.real = 0.5;
        this.imaginary = 0.5;
    }

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(ComplexNumber c2) {
        double realResult = this.real + c2.real;
        double imaginaryResult = this.imaginary + c2.imaginary;
        System.out.println("Addition: " + realResult + " + " + imaginaryResult + "i");
    }

    void subtract(ComplexNumber c2) {
        double realResult = this.real - c2.real;
        double imaginaryResult = this.imaginary - c2.imaginary;
        System.out.println("Subtraction: " + realResult + " + " + imaginaryResult + "i");
    }

    void multiply(ComplexNumber c2) {
        double realResult = this.real * c2.real - this.imaginary * c2.imaginary;
        double imaginaryResult = this.real * c2.imaginary + this.imaginary * c2.real;
        System.out.println("Multiplication: " + realResult + " + " + imaginaryResult + "i");
    }

    void divide(ComplexNumber c2) {
        double denominator = c2.real * c2.real + c2.imaginary * c2.imaginary;
        double realResult = (this.real * c2.real + this.imaginary * c2.imaginary) / denominator;
        double imaginaryResult = (this.imaginary * c2.real - this.real * c2.imaginary) / denominator;
        System.out.println("Division: " + realResult + " + " + imaginaryResult + "i");
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber c2 = new ComplexNumber();

        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);
        c1.divide(c2);
    }
}
