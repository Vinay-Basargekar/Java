// Abstract class Test
abstract class Test {
    int no_of_que;

    Test() {
        no_of_que = 0;
    }

    abstract void display();
    void accept(int num) {
        no_of_que = num;
    }
}

public class abstractClass extends Test {

    // Overriding the abstract method
    void display() {
        System.out.println("Number of questions: " + no_of_que);
    }
    public static void main(String[] args) {
        abstractClass a1 = new abstractClass();


        a1.accept(25);
        a1.display();
    }
}