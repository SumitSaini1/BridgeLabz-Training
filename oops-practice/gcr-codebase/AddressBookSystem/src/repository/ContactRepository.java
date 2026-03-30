package repository;

import java.util.ArrayList;
import java.util.HashMap;

import models.Contact;

public class ContactRepository {
	
	// Use Case 1
	// add a new contact
	public void addContact(ArrayList<Contact> contacts,Contact contact) {
		contacts.add(contact);
	}

	

	public boolean deletePersonContact(ArrayList<Contact> contacts,String firstName, String lastName) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getFirstName().equalsIgnoreCase(firstName)
					&& contacts.get(i).getLastName().equalsIgnoreCase(lastName)) {
				contacts.remove(i);
				return true;
			}
		}
		return false;
	}

}


