class Publication
{
    String title;
    int price;
    int copies;
    public static int total;
    
    Publication(String t,int a)
    {
        title=t;
        price=a;
        copies=0;
    }
    
    void saleCopy()
    {
        total=total+(copies*price);
    }
}

class Book extends Publication
{
    String author;
    
    Book(String t,int a,String aut)
    {
        super(t,a);
        author=aut;
    }
    
    void orderCopies(int qt)
    {
        copies=copies+qt;
        System.out.println("orderCopies : "+copies);
    }
    
}

class Magazine extends Publication
{
    int orderqt;
    int currentissue;
    
    Magazine(String t,int a,int ci)
    {
        super(t,a);
        currentissue=ci;
        orderqt=0;
    }
    
    void receiveissue()
    {
        System.out.println("receiveissue : "+currentissue);
    }
    
}

class main1
{
    public static void main(String args[])
    {
        Book b1 =new Book("Maths",250,"Manik");
        Book b2 =new Book("Maths",100,"Manik");
        
        Magazine m1=new Magazine("English mag",350,50);
  
        b1.orderCopies(50);
        
        b2.orderCopies(40);
        
        b1.orderCopies(10);
        
        b1.saleCopy();
        b2.saleCopy();
        
        b1.orderCopies(10);
        
        Publication.total=0;
        b1.saleCopy();
        b2.saleCopy();
        
        System.out.println("Total sale of publication is : "+Publication.total);
    }
}