import java.util.*;
// Exception
class InvalidInvoiceFormatException extends Exception {
    InvalidInvoiceFormatException(String message) {
        super(message);
    }
}

public class InvoiceGeneratorFreelancersWithException {

    public static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
        if (!input.contains("-") || !input.contains("INR")) {
            throw new InvalidInvoiceFormatException("Invalid invoice format");
        }
        return input.split(",");
    }

    public static int getTotalAmount(String[] tasks) throws InvalidInvoiceFormatException {
        int total = 0;

        for (String task : tasks) {
            String[] parts = task.split("-");

            if (parts.length != 2) {
                throw new InvalidInvoiceFormatException("Invalid task format");
            }

            String amountPart = parts[1].trim();

            if (!amountPart.endsWith("INR")) {
                throw new InvalidInvoiceFormatException("Amount missing currency");
            }

            amountPart = amountPart.replace("INR", "").trim();

            try {
                int amount = Integer.parseInt(amountPart);
                total += amount;
            } catch (NumberFormatException e) {
                throw new InvalidInvoiceFormatException("Invalid amount value");
            }
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter invoice description:");
        String invoiceInput = input.nextLine();

        try {
            String[] tasks = parseInvoice(invoiceInput);
            int totalAmount = getTotalAmount(tasks);

            System.out.println("\nInvoice Details:");
            for (String t : tasks) {
                System.out.println(t.trim());
            }
            System.out.println("Total Amount: " + totalAmount + " INR");

        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
