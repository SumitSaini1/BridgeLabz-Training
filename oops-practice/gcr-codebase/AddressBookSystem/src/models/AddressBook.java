package models;
import java.util.List;
import java.util.ArrayList;
public class AddressBook {
    private String name;
    private ArrayList<Contact> contacts;
    public AddressBook(String name){
        this.name=name;
        this.contacts=new ArrayList<>();
    }

    public String getAddressBookName(){
        return name;
    }
    public ArrayList<Contact> getContacts(){
        return contacts;
    }

    
}
