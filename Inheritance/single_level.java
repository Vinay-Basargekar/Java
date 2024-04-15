//Super class
class emp{
    String emp_name;

    void accept(String e){
        emp_name = e;
    }
    void disp(){
        System.out.println(emp_name);
    }
}

//sub class
class student extends emp{
    String name;
    int rollNo;

    void accept1(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    void disp1(){
        System.out.println(name);
        System.out.println(rollNo);
    }
}

public class single_level{
    public static void main(String args[]){
        student stu1 = new student();

        stu1.accept("Vinay");
        stu1.disp();
    }
}
