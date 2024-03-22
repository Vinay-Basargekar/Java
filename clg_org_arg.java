class clg_obj_arg {
    int rank;
    String name;

    void setClg(String name,int rank){
        this.name = name;
        this.rank = rank;
    }

    //object as argument
    void disp(clg_obj_arg clg){
        //called another function from object and passed the value
        this.setClg("AISSMS",1);
        System.out.println(name+rank);
    }
    public static void main(String[] args) {
        //created an object
        clg_obj_arg clg = new clg_obj_arg();

        //passed object as arg and called the function!
        clg.disp(clg);
    }
}
