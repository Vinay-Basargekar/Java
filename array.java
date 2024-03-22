public class array {
    int rank;
    String name;

    void dispClg(){
        System.out.println(name);
        System.out.println(rank);
    }
    public static void main(String[] args) {
        array arr1[] = new array[2];

        arr1[1] = new array();
        arr1[1].rank = 1;
        arr1[1].name ="AISSMS";
        arr1[1].dispClg();
    }
}
