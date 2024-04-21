import java.util.Scanner;

public class student1 {

    String name;
    int roll_no;

    student1(String name,int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    void display(){
        System.out.println(name);
        System.out.println(roll_no);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array of student
        student1 stu[] = new student1[5];

        for(int i= 0 ; i < 2 ; i++){
            System.out.println("Enter details of student: ");
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter roll number: ");
            int roll_no = sc.nextInt();
            sc.nextLine();

            stu[i] = new student1(name,roll_no);
        }

        for(int i=0 ; i<2 ; i++){
            stu[i].display();
        }
    }
}
