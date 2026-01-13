package oops.scenario.DigitalWalletSystem;

public class DigitalWalletSystem {

    public static void main(String[] args) {

        User u1 = new User(1, "amit");
        User u2 = new User(2, "rahul");

        TransferService walletTransfer = new WalletTransferService();
        TransferService bankTransfer = new BankTransferService();

        // add money from bank
        try {
            bankTransfer.transfer(null, u1, 1000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // wallet transfer
        try {
            walletTransfer.transfer(u1, u2, 300);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // insufficient balance case
        try {
            walletTransfer.transfer(u1, u2, 800);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("amit balance : " + u1.getWallet().getBalance());
        System.out.println("rahul balance : " + u2.getWallet().getBalance());
    }
}
