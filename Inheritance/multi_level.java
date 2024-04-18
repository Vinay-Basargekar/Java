//superclass
class Account{
    String cust_name;
    int acc_no;

    void accept(String cust_name,int acc_no){
        this.cust_name = cust_name;
        this.acc_no = acc_no;
    }
}
//intermediate super class
class savingAcc extends Account{
    int saving_bal;
    int min_bal;

    void accept1(int s,int m){
        saving_bal = s;
        min_bal = m;
    }
}
//sub class
class account_details extends savingAcc{
    void disp(){
        System.out.println(cust_name + acc_no);
        System.out.println(saving_bal);
        System.out.println(min_bal);
    }
}


public class multi_level {
    public static void main(String args[]){
        account_details a1 = new account_details();
        a1.accept("vinay", 1000);
        a1.accept1(500,100);
        a1.disp();
    }
}
