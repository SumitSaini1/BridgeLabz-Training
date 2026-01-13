package oops.ECommerceOrderManagementSystem;

interface Payment {
    public void card();

    public void upi();

    public void wallet();

}



public class CardPayment implements Payment {
    private double accountBalance;
    private double walletBalance;
    private String paymentMethod;
    private double billamount;
    private boolean paymentstatus = false;

    public CardPayment(double accountBalance, double walletBalance, String paymentMethod, double totalBill) {
        this.accountBalance = accountBalance;
        this.walletBalance = walletBalance;
        this.paymentMethod = paymentMethod;
        this.billamount = totalBill;

    }

    public void donePayment() throws PaymentFailedException {
        if (paymentMethod.toLowerCase().equals("card")) {

            card();

        } else if (paymentMethod.toLowerCase().equals("upi")) {
            upi();
        } else if (paymentMethod.toLowerCase().equals("wallet")) {
            wallet();

        } else {
            throw new PaymentFailedException("Invalid payment method");
        }
        if (!paymentstatus) {
            throw new PaymentFailedException("Payment failed");
        }

    }

    public void card() {
        if (accountBalance >= billamount) {
            paymentstatus = true;
            accountBalance = accountBalance - billamount;

        } else {
            paymentstatus = false;

        }

    }

    public void upi() {
        if (accountBalance >= billamount) {
            paymentstatus = true;
            accountBalance = accountBalance - billamount;

        } else {
            paymentstatus = false;

        }

    }

    public void wallet() {
        paymentstatus = true;
        if (walletBalance >= billamount) {
            paymentstatus = true;
            walletBalance = walletBalance - billamount;

        } else {
            paymentstatus = false;

        }

    }

    public boolean getPaymentStatus() {
        return paymentstatus;
    }

    public void displayPaymentDetails() {
        System.out.println("----- Payment Details -----");
        System.out.println("Payment Method : " + paymentMethod);
        System.out.println("Bill Amount    : " + billamount);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Wallet Balance : " + walletBalance);

        if (paymentstatus) {
            System.out.println("Payment Status : SUCCESS");
        } else {
            System.out.println("Payment Status : FAILED");
        }
    }

}