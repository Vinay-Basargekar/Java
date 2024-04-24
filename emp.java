class Employee{
    int emp_id;
    String emp_name;
    int MobileNumber;
    String address;
    String mail;

    double basicPay;

    Employee(int emp_id,String emp_name,int MobileNumber,String address,String mail,double basicPay){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.MobileNumber = MobileNumber;
        this.address = address;
        this.mail = mail;
        this.basicPay = basicPay;
    }

    void GeneratePaySlip(){
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClub = 0.01 * basicPay;
        double grossPay = basicPay + da + hra;
        double netPay = grossPay - pf - staffClub;

        System.out.println("Employee Name: "+emp_name);
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Gross Pay: "+grossPay);
        System.out.println("Net Pay: "+netPay);
    }
}

class Programmer extends Employee{
    Programmer(int emp_id, String emp_name, int MobileNumber, String address, String mail, double basicPay) {
        super(emp_id, emp_name, MobileNumber, address, mail, basicPay);
    }
    public void GeneratePaySlip(){
        System.out.println("\nProgrammer Pay Slip:");
        super.GeneratePaySlip();
    }
}

class AssistantProf extends Employee{
    AssistantProf(int emp_id, String emp_name, int MobileNumber, String address, String mail, double basicPay) {
        super(emp_id, emp_name, MobileNumber, address, mail, basicPay);
    }
    public void GeneratePaySlip(){
        System.out.println("\nAssistant Professor Pay Slip:");
        super.GeneratePaySlip();
    }
}

class AssociateProf extends Employee{
    AssociateProf(int emp_id, String emp_name, int MobileNumber, String address, String mail, double basicPay) {
        super(emp_id, emp_name, MobileNumber, address, mail, basicPay);
    }
    public void GeneratePaySlip(){
        System.out.println("\nAssociate Professor Pay Slip:");
        super.GeneratePaySlip();
    }
}

class emp{
    public static void main(String[] args) {
        Programmer p = new Programmer(1,"Rahul",1234567890,"Bangalore","Rahul@12.com",50000);
        AssistantProf a = new AssistantProf(2,"Raj",1234567890,"Bangalore","Raj@21.in",60000);
        AssociateProf ap = new AssociateProf(3,"Ravi",1234567890,"Bangalore","Ravi@.com",70000);

        p.GeneratePaySlip();
        a.GeneratePaySlip();
        ap.GeneratePaySlip();
    }

}
