import java.util.Scanner;

public class College {

    // Instance variables
    int rank;
    String name;

    // Static variable
    static int totalColleges = 0;

    // Default constructor
    College() {
        this("ABC", 0);
    }

    // Parameterized constructor
    College(String name, int rank) {
        this.name = name;
        this.rank = rank;
        totalColleges++;
    }

    // Constructor overloading - signature different
    College(String name) {
        this("name", 0);
    }

    // Static method
    public static int getTotalColleges() {
        return totalColleges;
    }

    // Method to display college details
    void disp() {
        System.out.println("\nName of college: " + name);
        System.out.println("Rank of college: " + rank);
    }

    // Method overloading - passing arguments
    void disp(String customName, int customRank) {
        System.out.println("\nName of college: " + customName);
        System.out.println("Rank of college: " + customRank);
    }

    // Method overloading - types of arguments
    void disp(double customRank) {
        System.out.println("\nCollege Name: " + this.name);
        System.out.println("Rank of college: " + customRank);
    }

    // Inner class within College
    static class Inner {
        void display() {
            System.out.println("\nInside the inner class");
            // System.out.println("Name : " + name);
            // System.out.println("Rank : " + rank);
            System.out.println(totalColleges);
        }
    }

    // Passing object as argument
    void compareRank(College otherCollege) {
        if (this.rank < otherCollege.rank) {
            System.out.println(this.name + " has a higher rank than " + otherCollege.name);
        } else if (this.rank > otherCollege.rank) {
            System.out.println(otherCollege.name + " has a higher rank than " + this.name);
        } else {
            System.out.println(this.name + " and " + otherCollege.name + " have the same rank");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Create an array of College objects
        College clg[] = new College[2];

        // Take input from user for two colleges
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for College " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Rank: ");
            int rank = sc.nextInt();
            sc.nextLine(); 
            clg[i] = new College(name, rank);
        }

        // Display details 
        for (int i = 0; i < 2; i++) {
            System.out.println("\nCollege " + (i + 1) + " Details:");
            clg[i].disp();
        }

        // passing object as argument
        if (clg.length >= 2) {
            System.out.println("\nComparing ranks:");
            clg[0].compareRank(clg[1]);
        }

        // Demonstrate method overloading with disp() method
        System.out.println("\nMethod Overloading : ");
        clg[0].disp();
        clg[1].disp("PICT", 5); 
        clg[1].disp(100.0);

        // Constructor overloading
        System.out.println("\nConstructor Overloading : ");
        College college4 = new College(); 
        college4.disp();
        College college5 = new College("XYZ College");
        college5.disp();

        // Using non-static inner class
        // College.Inner in = clg[0].new Inner();
        // in.display();
        
        //Static inner class
        Inner in = new Inner();
        in.display();

        // Call static function
        System.out.println("\nTotal Colleges: " + College.getTotalColleges());

        sc.close();
    }
}
