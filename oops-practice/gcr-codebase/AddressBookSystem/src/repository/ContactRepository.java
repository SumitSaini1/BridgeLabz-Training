package repository;
import java.util.ArrayList;
import models.Contact;

public class ContactRepository {
	private ArrayList<Contact> contacts=new ArrayList<>();
	// Use Case 1 
	// add a new contact
	public void addContact(Contact contact) {
	    contacts.add(contact);
	}

	public ArrayList<Contact> getAllContacts(){
		return contacts;
	}

	public boolean deletePersonContact(String firstName,String lastName){
		for(int i=0;i<contacts.size();i++){
			if(contacts.get(i).getFirstName().equalsIgnoreCase(firstName) && contacts.get(i).getLastName().equalsIgnoreCase(lastName)){
				contacts.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
	
	
	

}
