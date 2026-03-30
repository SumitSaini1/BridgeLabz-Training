package repository;

import java.util.ArrayList;
import java.util.HashMap;

import models.Contact;
import models.AddressBook;
// UC 6
public class AddressBookRepository {
    HashMap<String,AddressBook> books=new HashMap<>();
    
    // create new AddressBook
    public boolean addAddressBook(String name){
        if(books.containsKey(name)){
            return false;
        }
        books.put(name,new AddressBook(name));
        return true;
    }

    // get address book by name 
    public AddressBook getAddressBook(String name){
        return books.get(name);

    }
    public HashMap<String, AddressBook> getAllBooks() {
        return books;
    }


}
