import java.util.Scanner;

// Book details class
class BookDetails{
    // instance variables
    private String title;
    private String author;
    private int price;
    
    // parameterized constructor
    BookDetails(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    // Non parameterized constructor
    BookDetails(){
        title="The BusinessPride";
        author="Mr.Wilson";
        price=3000;
    }
    // display result 
    void display(){
        System.out.println("Title:" + title+ "\n Author"+ author + "\n Price:" + price);
        System.out.println("-----------------------------------------------------------");
    }

    
}
// public class 
public class Book {
    public static void main(String[] args) {
        // create object 1.
        BookDetails book=new BookDetails();
        // call method using object 
        book.display();
         // create object 2.
        BookDetails book1=new BookDetails("The BusinessPride", "Mr.Wils",30);
        book1.display();
        
    }
   

    
}

