class Employee {
    int emp_id; 
    String address; 
    String mail_id; 
    String mobile_no;

    Employee(int emp_id, String address, String mail_id, String mobile_no){
        this.emp_id = emp_id;
        this.address = address;
        this.mail_id = mail_id;
        this.mobile_no = mobile_no;
    }
}

class Prof extends Employee {
    double basic_pay;

    Prof(int emp_id, String address, String mail_id, String mobile_no, double basic_pay){
        super(emp_id, address, mail_id, mobile_no);
        this.basic_pay = basic_pay;
    }
    
    public double calGrossSal(){
        double da = 0.97 * basic_pay;
        double hra = 0.10 * basic_pay;
        double pf = 0.12 * basic_pay;
        double staff_fund = 0.001 * basic_pay;
        double totalPay = (basic_pay + da) - (hra + pf + staff_fund);

        return totalPay;
    }

    public double netPay(){
        double gross = calGrossSal();
        double pf = 0.12 * basic_pay;

        return gross - pf;
    }
}

class AssoProf extends Prof {
    double basic_pay;

    AssoProf(int emp_id, String address, String mail_id, String mobile_no, double basic_pay){
        super(emp_id, address, mail_id, mobile_no,basic_pay);
    }
}

class AssProf extends Prof {
    double basic_pay;

    AssProf(int emp_id, String address, String mail_id, String mobile_no, double basic_pay){
        super(emp_id, address, mail_id, mobile_no,basic_pay);
    }
}

public class emp {
    public static void main(String[] args) {
        Prof professor = new Prof(1001, "123 Main St", "prof@example.com", "1234567890", 50000.0);
        AssoProf associateProfessor = new AssoProf(1002, "456 Elm St", "assocprof@example.com", "9876543210", 40000.0);
        AssProf assistantProfessor = new AssProf(1003, "789 Oak St", "asstprof@example.com", "5678901234", 30000.0);

        System.out.println("Professor's Gross Salary : ₹" + professor.calGrossSal());
        System.out.println("Professor's Net Salary : ₹" + professor.netPay());

        System.out.println("Associate Professor's Gross Salary : ₹" + AssProf.calGrossSal());
        System.out.println("Associate Professor's Net Salary : ₹" + AssProf.netPay);

        System.out.println("Assistant Professor's Gross Salary : ₹" + assistantProfessor.calculateGrossSalary());
System.out.println("Assistant Professor's Net Salary : ₹" + assistantProfessor.calculateNetSalary());
    }
}
