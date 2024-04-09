class complex {
    double real, imag;

    complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    complex() {
        real = 0;
        imag = 0;
    }

    complex add(complex c) {
        return new complex(this.real + c.real, this.imag + c.imag);
    }

    complex subtract(complex c) {
        return new complex(this.real - c.real, this.imag - c.imag);
    }

    complex multiply(complex c) {
        return new complex(this.real * c.real - this.imag * c.imag, this.real * c.imag + this.imag * c.real);
    }

    complex divide(complex c) {
        double denominator = c.real * c.real + c.imag * c.imag;
        return new complex((this.real * c.real + this.imag * c.imag) / denominator,
                (this.imag * c.real - this.real * c.imag) / denominator);
    }

    public static void main(String args[]) {
        complex c1 = new complex(3.5, 5.5);
        complex c2 = new complex(4.5, 6.5);

        complex sum = c1.add(c2);
        System.out.println("Addition - Real: " + sum.real + ", Imaginary: " + sum.imag);

        complex difference = c1.subtract(c2);
        System.out.println("Subtraction - Real: " + difference.real + ", Imaginary: " + difference.imag);

        complex product = c1.multiply(c2);
        System.out.println("Multiplication - Real: " + product.real + ", Imaginary: " + product.imag);

        complex quotient = c1.divide(c2);
        System.out.println("Division - Real: " + quotient.real + ", Imaginary: " + quotient.imag);
    }
}
