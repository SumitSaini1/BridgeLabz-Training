package presentation;

import java.util.Scanner;
import service.AddressBookService;

public class AddressBookManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AddressBookService service = new AddressBookService();
		String currentBook = null;
		System.out.println(
				"=======================================Welcome to Address Book Management System=========================");
		int task;
		do {
			System.out.println("What Would You want to do:");
			System.out.println("0. Exit Book Address ");
			System.out.println("1. Create Address Book"); 
			System.out.println("2. Select Address Book"); 
			System.out.println("3. Add New contact");
			System.out.println("4. Edit Contact ");
			System.out.println("5. Display Contacts ");
			System.out.println("6. Delete a Person ");
			System.out.println("7. Search Person by City");
			System.out.println("8. View Persons by City(Dictionary)");
			System.out.println("9. View Persons by State(Dictionary)");
			System.out.println("10. Count person By City Name");
			System.out.println("11. Count person By StateName");
			System.out.println("12. Sort Contact BookByName");
			System.out.println("13. Sort Contact By City");
			System.out.println("14. Sort Contact By State");
			System.out.println("15. Save Address Book to File");
			System.out.println("16. Load Address Book from File");
			System.out.println("17. Export Address Book to CSV");
			System.out.println("18. Import Address Book from CSV");

			String firstName;
			String lastName;

			boolean result;
			System.out.println("Enter a Task Number:");
			task = input.nextInt();
			input.nextLine();

			switch (task) {
				case 0:
					break;
				// create address book UC 6
				case 1:
					System.out.print("Enter Address Book Name: ");
					String bookName = input.nextLine();
					if (service.createAddressBook(bookName)) {
						System.out.println("Address Book Created");
					} else {
						System.out.println("Address Book Already Exists");
					}
					break;
				case 2:
					System.out.print("Enter Address Book Name to Select: ");
					currentBook = input.nextLine();
					if (currentBook.trim().isEmpty()) {
						System.out.println("Invalid Address Book name");
						currentBook = null;
						break;
					}
					System.out.println("Selected Address Book: " + currentBook);
					break;
				// Add a contact
				case 3:
					// UC 2
					if (currentBook == null) {
						System.out.println("Please select an Address Book first");
						break;
					}
					System.out.print("Enter First Name: ");
					firstName = input.nextLine();

					System.out.print("Enter Last Name: ");
					lastName = input.nextLine();

					System.out.print("Enter Address: ");
					String address = input.nextLine();

					System.out.print("Enter City: ");
					String city = input.nextLine();

					System.out.print("Enter State: ");
					String state = input.nextLine();

					System.out.print("Enter ZIP Code: ");
					String zip = input.nextLine();

					System.out.print("Enter Phone Number: ");
					String phoneNumber = input.nextLine();

					System.out.print("Enter Email: ");
					String email = input.nextLine();

					// add contact
					result = service.addContacts(currentBook, firstName,
							lastName,
							address,
							city,
							state,
							zip,
							phoneNumber,
							email);
					if (result) {
						System.out.println("---------Contact added Successfully-----------");
					}
					break;
				// Edit contact address
				case 4:
					if (currentBook == null) {
						System.out.println("Please select an Address Book first");
						break;
					}
					System.out.print("Enter First Name to Edit Contact: ");
					firstName = input.nextLine();

					System.out.print("Enter Last Name to Edit Contact: ");
					lastName = input.nextLine();

					int editChoice;
					do {
						System.out.println("------ What field do you want to edit? ------");
						System.out.println("1. First Name");
						System.out.println("2. Last Name");
						System.out.println("3. Address");
						System.out.println("4. City");
						System.out.println("5. State");
						System.out.println("6. ZIP Code");
						System.out.println("7. Phone Number");
						System.out.println("8. Email");
						System.out.println("0. Exit Edit Menu");

						editChoice = input.nextInt();
						input.nextLine(); // clear buffer

						String fieldToEdit = null;
						String newValue = null;
						// cosse field to edit
						switch (editChoice) {

							case 1:
								fieldToEdit = "firstName";
								System.out.print("Enter new First Name: ");
								newValue = input.nextLine();
								break;

							case 2:
								fieldToEdit = "lastName";
								System.out.print("Enter new Last Name: ");
								newValue = input.nextLine();
								break;

							case 3:
								fieldToEdit = "address";
								System.out.print("Enter new Address: ");
								newValue = input.nextLine();
								break;

							case 4:
								fieldToEdit = "city";
								System.out.print("Enter new City: ");
								newValue = input.nextLine();
								break;

							case 5:
								fieldToEdit = "state";
								System.out.print("Enter new State: ");
								newValue = input.nextLine();
								break;

							case 6:
								fieldToEdit = "zip";
								System.out.print("Enter new ZIP Code: ");
								newValue = input.nextLine();
								break;

							case 7:
								fieldToEdit = "phone";
								System.out.print("Enter new Phone Number: ");
								newValue = input.nextLine();
								break;

							case 8:
								fieldToEdit = "email";
								System.out.print("Enter new Email: ");
								newValue = input.nextLine();
								break;

							case 0:
								System.out.println("Exiting edit menu...");
								continue;

							default:
								System.out.println("Invalid choice");
								continue;
						}

						if (fieldToEdit != null) {
							boolean updated = service.editContactByName(currentBook,
									firstName,
									lastName,
									fieldToEdit,
									newValue);

							if (updated) {
								System.out.println("----Contact updated successfully---");
							} else {
								System.out.println("Update failed");
							}
						}

					} while (editChoice != 0);
					break;

				// Display all Contacts
				case 5:
					if (currentBook == null) {
						System.out.println("Please select an Address Book first");
						break;
					}
					service.displayContacts(currentBook);
					break;
				// Delete a Contact Number
				case 6:
					if (currentBook == null) {
						System.out.println("Please select an Address Book first");
						break;
					}
					System.out.println("Enter a Person First Name to delete Contact");
					firstName = input.nextLine();
					System.out.println("Enter a Person Last Name to delete Contact");
					lastName = input.nextLine();
					result = service.deletePersonContact(currentBook, firstName, lastName);
					if (result) {
						System.out.println("Contact Deleted");
					} else {
						System.out.println("Contact Not Found");
					}
					break;
				// UC 8
				case 7:
					System.out.print("Enter City Name: ");
					city = input.nextLine();
					service.searchPersonByCity(city);
					break;
				// UC -9
				case 8:
					System.out.println("Enter city name:");
					city = input.nextLine();
					service.viewPersonByCity(city);
					break;
				// UC-9
				case 9:
					System.out.println("Enter city State:");
					state = input.nextLine();
					service.viewPersonByState(state);
					;
					break;
				// UC 10
				case 10:
					System.out.println("Enter city name to count:");
					city = input.nextLine();
					service.countPersonByCity(city);

					break;
				// UC 10:
				case 11:
					System.out.println("Enter city State:");
					state = input.nextLine();
					service.countPersonByState(state);
					;
					break;
				// UC 11:
				case 12:
					System.out.println("Enter Book name:");
					String book = input.nextLine();
					service.sortContactBookByNameUsingStream(book);
					break;
				// UC 12:
				case 13:
					System.out.println("Enter Book Name to sort by city:");
					bookName = input.nextLine();
					service.sortContactsByCity(bookName);
					break;
				// UC 12:
				case 14:
					System.out.println("Enter Book Name to sort by State:");
					bookName = input.nextLine();
					service.sortContactsByState(bookName);
					break;
				case 15:
					if (currentBook == null) {
						System.out.println("Please select an Address Book first");
						break;
					}
					service.writeAddressBookToFile(currentBook);
					break;

				case 16:
					if (currentBook == null) {
						System.out.println("Please select an Address Book first");
						break;
					}
					service.readAddressBookFromFile(currentBook);
					break;

				case 17:
					if (currentBook == null) {
						System.out.println("Please select an Address Book first");
						break;
					}
					service.writeAddressBookToCSV(currentBook);
					break;

				case 18:
					if (currentBook == null) {
						System.out.println("Please select an Address Book first");
						break;
					}
					service.readAddressBookFromCSV(currentBook);
					break;

			}

		} while (task != 0);
		System.out.println("-------------Thanks! For Using Address System----------------");
		input.close();

	}

}
