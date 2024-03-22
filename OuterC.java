class OuterC {
    String name;
    int Rank;

    OuterC(String s,int i){
        name = s;
        Rank = i;
    }

    class Inner {
        public void display() {
            System.out.println("Inside the inner class");
            System.out.println("Name of Topper: " + name);
            System.out.println("AIR: " + Rank);
        }
    }

    public static void main(String[] args) {
        OuterC out[] = new OuterC[2];
        out[1] = new OuterC("Shraddha",1);
        
        OuterC.Inner in = out[1].new Inner();
        in.display();
    }
}
