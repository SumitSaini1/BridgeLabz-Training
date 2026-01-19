package service;

import models.Contact;
import repository.ContactRepository;

public class AddressBookService {
	ContactRepository repo = new ContactRepository();

	// // Input Validation input names
	public boolean validateFirstName(String firstName) {
		if (firstName == null || firstName.trim().isEmpty()) {
			return false;
		}
		return true;

	}

	public boolean validateLastName(String lastName) {
		if (lastName == null || lastName.trim().isEmpty()) {
			return false;

		}
		return true;

	}

	// input validation
	public boolean validatePhoneNumber(String phoneNumber) {
		if (phoneNumber != null && phoneNumber.matches("\\d{10}")) {
			return true;
		}
		return false;

	}

	// Add Conatct UC 2
	public boolean addContacts(String firstName, String lastName, String address,
			String city, String state, String zip,
			String phoneNumber, String email) {

		if (!validateFirstName(firstName) || !validateLastName(lastName)) {
			return false;
		} else if (!validatePhoneNumber(phoneNumber)) {
			return false;
		}

		// Duplicate Check
		for (Contact c : repo.getAllContacts()) {
			if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {
				return false;
			}
		}

		Contact contact = new Contact(firstName, lastName, address,
				city, state, zip,
				phoneNumber, email);
		// store contact
		repo.addContact(contact);
		return true;

	}

	// Edit Contact By Name (UC 3)
	public boolean editContactByName(String firstName, String lastName, String fieldToEdit, String newValue) {

		if (!validateFirstName(firstName) || !validateLastName(lastName)) {
			return false;
		}
		if (repo.getAllContacts().isEmpty()) {
			return false;
		}
		for (Contact c : repo.getAllContacts()) {
			if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {

				switch (fieldToEdit) {

					case "firstName":
						c.setFirstName(newValue);
						break;

					case "lastName":
						c.setLastName(newValue);
						break;

					case "address":
						c.setAddress(newValue);
						break;

					case "city":
						c.setCity(newValue);
						break;

					case "state":
						c.setState(newValue);
						break;

					case "zip":
						c.setZip(newValue);
						break;

					case "phone":
						c.setPhoneNumber(newValue);
						break;

					case "email":
						c.setEmail(newValue);
						break;

					default:
						return false;
				}
				return true;

			}
		}
		return false;

	}

	// Use Case (UC)4
	public boolean deletePersonContact(String firstName,String lastName){
		if (!validateFirstName(firstName) || !validateLastName(lastName)) {
			return false;
		}
		if(repo.getAllContacts().isEmpty()){
			return false;
		}
		
		boolean result=repo.deletePersonContact(firstName,lastName);
		return result;


		
	}

	public void displayContacts() {
		if (repo.getAllContacts().isEmpty()) {
			System.out.println("No contacts found");
			return;
		}
		for (Contact c : repo.getAllContacts()) {
			System.out.println(c);
		}
	}

}
