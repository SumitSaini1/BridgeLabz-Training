package oops.ECommerceOrderManagementSystem;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String address;

    public Customer(int customerId, String customerName, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;

    }

    public void displayCustomerDetails() {
        System.out.println("Customer Id:" + customerId);
        System.out.println("Customer Name:" + customerName);
        System.out.println("Address:" + address);
    }

    public void display() {
        displayCustomerDetails();

    }

}

