public class complex1 {
    double real,img;

    complex1(){
        real = 1;
        img = 1;
    }
    complex1(double real,double img){
        this.real = real;
        this.img = img;
    }

    void add(complex1 c){
        double realResult = this.real+c.real;
        double imaginaryResult = this.img+c.img;
        System.out.println(realResult +"+ "+ imaginaryResult+"i");
    }

    public static void main(String args[]){
        complex1  c = new complex1();
        complex1 c1 = new complex1(2,2);

        c.add(c1);
    }
}
