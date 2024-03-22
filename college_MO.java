class About{
    static int rank;
    String name;
    
    //Method Overloading
    void disp(int r,String name){
        this.name = name;
        rank = r;

        System.out.println("Name: "+name);
        System.out.println("Rank: "+rank);
    }
    void disp(){
        rank = 4;
        System.out.println("Name: "+name);
        System.out.println("Rank: "+rank);
    }
}

public class college_MO {
    public static void main(String args[]){
        About clg1 = new About();

        clg1.disp(10, "AISSMS");
        clg1.name = "Pccoe";
        clg1.disp();

    }
}


