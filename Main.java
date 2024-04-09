//Design and develop inheritance for a given case study, identify objects and relationships and implement inheritance wherever applicable. Employee class with Emp name, Emp id, Address, Mail_id, and Mobile_no as members. Inherit the classes Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10% of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net salary

class Employee {
    String emp_name;
    int emp_id;
    String address;
    String email_id;
    long mob_no;
    double basicPay;

    public Employee(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.address = address;
        this.email_id = email_id;
        this.mob_no = mob_no;
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.1 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double Salary = grossSalary - pf - staffClubFund;

        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + email_id);
        System.out.println("Mobile No: " + mob_no);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff Club Fund: " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + Salary);
    }

}

class Programmer extends Employee {
    public Programmer(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        super(emp_name, emp_id, address, email_id, mob_no, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nProgrammer Pay Slip:");
        super.generatePaySlip();
    }
}

class AssistantProfessor extends Employee {
    public AssistantProfessor(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        super(emp_name, emp_id, address, email_id, mob_no, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nAssistant Professor Pay Slip:");
        super.generatePaySlip();
    }
}

class AssociateProfessor extends Employee {
    public AssociateProfessor(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        super(emp_name, emp_id, address, email_id, mob_no, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nAssociate Professor Pay Slip:");
        super.generatePaySlip();
    }
}

class Professor extends Employee {
    public Professor(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        super(emp_name, emp_id, address, email_id, mob_no, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nProfessor Pay Slip:");
        super.generatePaySlip();
    }
}

public class Main {
    public static void main(String args[]) {
        Programmer programmer = new Programmer("Rahul", 1, "Pune", "rahul@example.com", 1234567890, 50000.0);
        AssistantProfessor assistantProfessor = new AssistantProfessor("Suresh", 2, "Mumbai", "suresh@example.com", 1456789230, 60000.0);
        AssociateProfessor associateProfessor = new AssociateProfessor("Geeta", 3, "Pune", "geeta@example.com", 1236789450, 70000.0);
        Professor professor = new Professor("Sita", 4, "Mumbai", "sita@example.com", 1234589670, 80000.0);

        programmer.generatePaySlip();
        assistantProfessor.generatePaySlip();
        associateProfessor.generatePaySlip();
        professor.generatePaySlip();
    }
}

