import java.util.*;

public class student2{

    String name;
    int roll;

    student2(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

    void disp(){
        System.out.println(name);
        System.out.println(roll);
    }
    public static void main(String[] args) {
        student2 s[] = new student2[5];
        Scanner sc = new Scanner(System.in);


        for(int i=0 ; i<2 ; i++){
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter roll: ");
            int roll = sc.nextInt();
            sc.nextLine();

            s[i] = new student2(name,roll);
        }

        for(int i=0 ; i<2 ; i++){
            s[i].disp();
        }
    }
}