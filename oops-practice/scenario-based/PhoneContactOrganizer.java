import java.util.*;

// exception throw 
class InvalidPhoneNumberException extends Exception {
    InvalidPhoneNumberException(String message) {
        super(message);

    }
}

class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}

public class PhoneContactOrganizer {
    // create array list
    static ArrayList<Contact> contact = new ArrayList<>();

    // method to add contact
    public static void addContact(String name, String phoneNumber) throws InvalidPhoneNumberException {
        // check number length is 10 or not
        if (phoneNumber.length() != 10) {
            throw new InvalidPhoneNumberException("Number must be 10 digit ");
        }
        // check duplicate numbers
        for (Contact c : contact) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Duplicate phone number. Contact not added.");
                return;
            }
        }
        // add number
        contact.add(new Contact(name, phoneNumber));
        System.out.println("Contact Added");

    }

    // search contact
    public static void searchContact(String name) {
        boolean found = false;
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("Name: " + contact.get(i).getName());
                System.out.println("Phone: " + contact.get(i).getPhoneNumber());
                System.out.println("Contact Found");
                found = true;

            }
        }
        if (!found) {
            System.out.println("Contact not found");
        }

    }

    // remove contact
    public static void removeContact(String name) {
        boolean removed = false;
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getName().equalsIgnoreCase(name)) {
                contact.remove(i);
                System.out.println("Contact Deleted ");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Contact not found");
        }
    }

    public static void main(String[] args) {
        // handle exception
        try {
            addContact("Rahul", "7896541233");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Exception caught:" + e.getMessage());
        }

        searchContact("Rahul");
        removeContact("Rahul");

    }

}
