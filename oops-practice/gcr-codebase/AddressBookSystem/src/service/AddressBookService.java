package service;

import models.Contact;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import models.AddressBook;

import repository.AddressBookRepository;
import repository.ContactRepository;

public class AddressBookService {
	ContactRepository contactRepo = new ContactRepository();
	AddressBookRepository bookRepo = new AddressBookRepository();

	private HashMap<String, ArrayList<Contact>> cityDictionary = new HashMap<>();
	private HashMap<String, ArrayList<Contact>> stateDictionary = new HashMap<>();

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
		addToDictionary(contact);

		return true;

	}

	// view person by city; UC-9
	public void viewPersonByCity(String city) {
		ArrayList<Contact> contacts = cityDictionary.get(city.toLowerCase());
		if (contacts == null || contacts.isEmpty()) {
			System.out.println("No person found in the city " + city);
			return;

		}
		System.out.println("Person in city " + city);
		for (Contact c : contacts) {
			System.out.println(c);

		}
	}

	// view Person By State UC 9
	public void viewPersonByState(String state) {
		ArrayList<Contact> contacts = stateDictionary.get(state.toLowerCase());
		if (contacts == null || contacts.isEmpty()) {
			System.out.println("No person found in the state " + state);
			return;

		}
		System.out.println("Person in state " + state);
		for (Contact c : contacts) {
			System.out.println(c);

		}
	}

	// add count contact by city UC -10
	public void countPersonByCity(String city) {
		ArrayList<Contact> contacts = cityDictionary.get(city.toLowerCase());
		if (contacts == null || contacts.isEmpty()) {
			System.out.println("No person found in the city " + city);
			System.out.println("Count :0");
			return;

		}
		System.out.println("Total Person in city " + city + " " + contacts.size());

	}

	// add count contact by state UC -10
	public void countPersonByState(String state) {
		ArrayList<Contact> contacts = stateDictionary.get(state.toLowerCase());
		if (contacts == null || contacts.isEmpty()) {
			System.out.println("No person found in the state " + state);
			return;

		}
		System.out.println("Person in state " + state);
		System.out.println("Total Person in State" + state + " " + contacts.size());

	}

	// Sort adress Book By name UC -11
	public void sortContactBookByNameUsingStream(String bookName) {

		AddressBook book = bookRepo.getAddressBook(bookName);

		if (book == null || book.getContacts().isEmpty()) {
			System.out.println("No contacts found to sort");
			return;
		}

		book.getContacts().stream()
				.sorted(
						Comparator.comparing(Contact::getFirstName, String.CASE_INSENSITIVE_ORDER)
								.thenComparing(Contact::getLastName, String.CASE_INSENSITIVE_ORDER))
				.forEach(System.out::println);
	}

	// UC -12
	// sort by city UC -12
	public void sortContactsByCity(String bookName) {

		AddressBook book = bookRepo.getAddressBook(bookName);

		if (book == null || book.getContacts().isEmpty()) {
			System.out.println("No contacts found to sort");
			return;
		}

		book.getContacts().sort(
				Comparator.comparing(Contact::getCity, String.CASE_INSENSITIVE_ORDER)
						.thenComparing(Contact::getFirstName, String.CASE_INSENSITIVE_ORDER));

		System.out.println("Contacts Sorted By City:");
		book.getContacts().forEach(System.out::println);
	}

	// sort by state UC -12
	public void sortContactsByState(String bookName) {

		AddressBook book = bookRepo.getAddressBook(bookName);

		if (book == null || book.getContacts().isEmpty()) {
			System.out.println("No contacts found to sort");
			return;
		}

		book.getContacts().sort(
				Comparator.comparing(Contact::getState, String.CASE_INSENSITIVE_ORDER)
						.thenComparing(Contact::getFirstName, String.CASE_INSENSITIVE_ORDER));

		System.out.println("Contacts Sorted By State:");
		book.getContacts().forEach(System.out::println);
	}

	// Uc-13
	public void writeAddressBookToFile(String bookName) {

		AddressBook book = bookRepo.getAddressBook(bookName);

		if (book == null || book.getContacts().isEmpty()) {
			System.out.println("No contacts to write.");
			return;
		}

		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter(bookName + ".txt"))) {

			for (Contact c : book.getContacts()) {

				writer.write(
						c.getFirstName() + "," +
								c.getLastName() + "," +
								c.getAddress() + "," +
								c.getCity() + "," +
								c.getState() + "," +
								c.getZip() + "," +
								c.getPhoneNumber() + "," +
								c.getEmail());

				writer.newLine();
			}

			System.out.println("Address Book saved to file successfully.");

		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
	}

	// UC -13
	public void readAddressBookFromFile(String bookName) {

		AddressBook book = bookRepo.getAddressBook(bookName);

		if (book == null) {
			System.out.println("Address Book does not exist.");
			return;
		}

		try (BufferedReader reader = new BufferedReader(
				new FileReader(bookName + ".txt"))) {

			String line;

			while ((line = reader.readLine()) != null) {

				String[] data = line.split(",");

				if (data.length == 8) {

					Contact contact = new Contact(
							data[0], data[1], data[2],
							data[3], data[4], data[5],
							data[6], data[7]);

					book.getContacts().add(contact);
					addToDictionary(contact);

				}
			}

			System.out.println("Address Book loaded from file successfully.");

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

	// UC-14
	public void writeAddressBookToCSV(String bookName) {

		AddressBook book = bookRepo.getAddressBook(bookName);
	
		if (book == null || book.getContacts().isEmpty()) {
			System.out.println("No contacts to write.");
			return;
		}
	
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter(bookName + ".csv"))) {
	
			// Header Row
			writer.write("FirstName,LastName,Address,City,State,Zip,Phone,Email");
			writer.newLine();
	
			for (Contact c : book.getContacts()) {
	
				writer.write(String.join(",",
						c.getFirstName(),
						c.getLastName(),
						c.getAddress(),
						c.getCity(),
						c.getState(),
						c.getZip(),
						c.getPhoneNumber(),
						c.getEmail()));
	
				writer.newLine();
			}
	
			System.out.println("Address Book exported to CSV successfully.");
	
		} catch (IOException e) {
			System.out.println("Error writing CSV file: " + e.getMessage());
		}
	}
	

	// UC-14
	public void readAddressBookFromCSV(String bookName) {

		AddressBook book = bookRepo.getAddressBook(bookName);
	
		if (book == null) {
			System.out.println("Address Book does not exist.");
			return;
		}
	
		// Clear old data
		book.getContacts().clear();
		cityDictionary.clear();
		stateDictionary.clear();
	
		try (BufferedReader reader = new BufferedReader(
				new FileReader(bookName + ".csv"))) {
	
			String line;
			boolean isFirstLine = true;
	
			while ((line = reader.readLine()) != null) {
	
				// Skip header row
				if (isFirstLine) {
					isFirstLine = false;
					continue;
				}
	
				String[] data = line.split(",");
	
				if (data.length == 8) {
	
					Contact contact = new Contact(
							data[0].trim(),
							data[1].trim(),
							data[2].trim(),
							data[3].trim(),
							data[4].trim(),
							data[5].trim(),
							data[6].trim(),
							data[7].trim()
					);
	
					book.getContacts().add(contact);
	
					// VERY IMPORTANT → update dictionary
					addToDictionary(contact);
				}
			}
	
			System.out.println("Address Book imported from CSV successfully.");
	
		} catch (IOException e) {
			System.out.println("Error reading CSV file: " + e.getMessage());
		}
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

				String oldCity = c.getCity();
				String oldState = c.getState();

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
						removeFromDictionary(c);
						c.setCity(newValue);
						addToDictionary(c);
						break;

					case "state":
						removeFromDictionary(c);
						c.setState(newValue);
						addToDictionary(c);
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

	// Add contact to dictionary
	private void addToDictionary(Contact contact) {
		cityDictionary
				.computeIfAbsent(contact.getCity().toLowerCase(), k -> new ArrayList<>())
				.add(contact);

		stateDictionary
				.computeIfAbsent(contact.getState().toLowerCase(), k -> new ArrayList<>())
				.add(contact);
	}

	// Remove contact from dictionary
	private void removeFromDictionary(Contact contact) {
		ArrayList<Contact> cityList = cityDictionary.get(contact.getCity().toLowerCase());
		if (cityList != null) {
			cityList.remove(contact);
			if (cityList.isEmpty()) {
				cityDictionary.remove(contact.getCity().toLowerCase());
			}
		}

		ArrayList<Contact> stateList = stateDictionary.get(contact.getState().toLowerCase());
		if (stateList != null) {
			stateList.remove(contact);
			if (stateList.isEmpty()) {
				stateDictionary.remove(contact.getState().toLowerCase());
			}
		}
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
	
		var iterator = book.getContacts().iterator();
	
		while (iterator.hasNext()) {
			Contact c = iterator.next();
			if (c.getFirstName().equalsIgnoreCase(firstName) &&
				c.getLastName().equalsIgnoreCase(lastName)) {
	
				removeFromDictionary(c);
				iterator.remove();   
				return true;
			}
		}
	
		return false;
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
