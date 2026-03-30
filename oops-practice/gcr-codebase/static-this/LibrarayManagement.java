class Book{
    String title; 
    String author;  
    final int isbn;
    static String libraryName="Modern Library";
    Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        
    }

    void bookDetails(){
        System.out.println("-------------Welcome to Modern Library-----------------------------");
        
        System.out.println("Title:"+title+"\nAuthor:"+author+"\nISBN:"+isbn+"\nLibraryName:"+libraryName);
    }
    static void displayLibraryName(){

        System.out.println("Library Name:"+ libraryName);

    }




}

public class LibrarayManagement {
    public static void main(String[] args) {
        Book b=new Book("Effective Java","Joshua Bloch",12656448);
        b.bookDetails();
        
    }
   
    
}
