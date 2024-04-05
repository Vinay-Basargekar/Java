import java.util.Scanner;

class student {
    int roll_no;
    String name;
    static Scanner sc = new Scanner(System.in);

    student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    static student accept() {
        System.out.println("Enter name of the student");
        String name = sc.nextLine();
        System.out.println("Enter roll no of the student");
        int roll_no = sc.nextInt();
        sc.nextLine();
        return new student(name, roll_no);
    }

    void disp() {
        System.out.println("name of the student: " + name);
        System.out.println("Roll no: " + roll_no);
    }

    public static void main(String args[]) {
        student stu[] = new student[5];

        for (int i = 0; i < 5; i++) {
            stu[i] = accept();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudents " + (i + 1) + " Details:");
            stu[i].disp();
        }
    }
}