// Identify commonalities and differences between Publication, Book and Magazine classes, Title, Price, Copies are common instance variables and saleCopy is common method. The differences are, Bookclass has author and order Copies(). Magazine Class has orderQty, Currentissue, receiveissue(). Write a program to find how many copies of the given books are ordered and display total sale of publication

class Publication{
    String titleString;
    double price;
    int copies;

    void saleCopy(int n){
        copies -= n;
    }
    public Publication(String titleString, double price, int copies){
        this.titleString = titleString;
        this.price = price;
        this.copies = copies;
    }
}

class Book extends Publication{
    String author;

    void orderCopies(int n){
        copies += n;
    }
    public Book(String titleString, double price, int copies, String author){
        super(titleString, price, copies);
        this.author = author;
    }
}

class Magazine extends Publication{
    int orderQty;
    int currentIssue;

    void receiveIssue(){
        System.out.println("Received issue: " + currentIssue);
        currentIssue++;
    }
    public Magazine(String titleString, double price, int copies, int orderQty, int currentIssue){
        super(titleString, price, copies);
        this.orderQty = orderQty;
        this.currentIssue = currentIssue;
    }
}

public class Bookclass {
    public static void main(String args[]){
        Book b1 = new Book("Vinay the great!", 100, 100, "Vinay");
        Magazine m1 = new Magazine("Champak", 50, 50, 50, 50);

        b1.orderCopies(10);
        m1.orderQty = 10;
        m1.receiveIssue();

        System.out.println("Total sale of publication: " + (b1.price * b1.copies + m1.price * m1.copies));
    }
}
