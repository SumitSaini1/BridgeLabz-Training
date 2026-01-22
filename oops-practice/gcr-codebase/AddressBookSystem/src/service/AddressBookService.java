package service;

import models.Contact;
import models.AddressBook;

import repository.AddressBookRepository;
import repository.ContactRepository;

public class AddressBookService {
	ContactRepository contactRepo = new ContactRepository();
	AddressBookRepository bookRepo = new AddressBookRepository();

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

	// UC-6

	// add Address Book
	public boolean createAddressBook(String name) {
		boolean result = bookRepo.addAddressBook(name);
		if (result) {
			return true;
		}
		return false;
	}

	// Add Conatct UC 2
	public boolean addContacts(String bookName, String firstName, String lastName, String address,
			String city, String state, String zip,
			String phoneNumber, String email) {

		if (!validateFirstName(firstName) || !validateLastName(lastName)) {
			return false;
		} else if (!validatePhoneNumber(phoneNumber)) {
			return false;
		}
		AddressBook book = bookRepo.getAddressBook(bookName);
		if (book == null) {
			System.out.println("Address Book does not exist");
			return false;
		}
	

		
		Contact contact = new Contact(firstName, lastName, address,
				city, state, zip,
				phoneNumber, email);
		
		// UC(7)
		if (book.getContacts().contains(contact)) {
			System.out.println("Duplicate Contact Found!");
			return false;
		}
		// store contact

		contactRepo.addContact(book.getContacts(), contact);
		return true;

	}

	// Edit Contact By Name (UC 3)
	public boolean editContactByName(String bookName, String firstName, String lastName, String fieldToEdit,
			String newValue) {

		if (!validateFirstName(firstName) || !validateLastName(lastName)) {
			return false;
		}
		AddressBook book = bookRepo.getAddressBook(bookName);
		if (book == null || book.getContacts().isEmpty()) {
			return false;
		}
		for (Contact c : book.getContacts()) {
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
	public boolean deletePersonContact(String bookName, String firstName, String lastName) {
		if (!validateFirstName(firstName) || !validateLastName(lastName)) {
			return false;
		}
		AddressBook book = bookRepo.getAddressBook(bookName);
		if (book == null || book.getContacts().isEmpty()) {
			return false;
		}

		boolean result = contactRepo.deletePersonContact(book.getContacts(), firstName, lastName);
		return result;

	}

		
	public void searchPersonByCity(String city) {
		boolean found = false;
	
		for (AddressBook book : bookRepo.getAllBooks().values()) {
			for (Contact contact : book.getContacts()) {
				if (contact.getCity().equalsIgnoreCase(city)) {
					System.out.println("Address Book: " + book.getAddressBookName());
					System.out.println(contact);
					found = true;
				}
			}
		}
	
		if (!found) {
			System.out.println("No person found in city: " + city);
		}
	}

	public void displayContacts(String bookName) {
		AddressBook book = bookRepo.getAddressBook(bookName);
		if (book == null || book.getContacts().isEmpty()) {
			System.out.println("No contacts found");
			return;
		}
		for (Contact c : book.getContacts()) {
			System.out.println(c);
		}
	}

	
	

}
