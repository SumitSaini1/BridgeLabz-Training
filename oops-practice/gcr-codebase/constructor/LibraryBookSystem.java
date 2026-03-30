
public class LibraryBookSystem {
    // instance variables
    private String title;
    private String author;
    private int price;
    private boolean availability=true;

    // constructor 
    LibraryBookSystem(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    void borrowBook(){
        if(availability){
            System.out.println("The Educator is borrowed successfully.");
            availability=false;
        }else{
            System.out.println("Ops! Book not currently available");
        }


    }
    public static void main(String[] args) {
        LibraryBookSystem l1=new LibraryBookSystem("The Educator", "Mr.Wilson", 3000);
        l1.borrowBook();
        LibraryBookSystem l2=new LibraryBookSystem("The Educator", "Mr.Wilson", 3000);
        l2.borrowBook();
    }


}
