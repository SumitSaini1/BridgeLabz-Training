package oops.scenario.DigitalWalletSystem;

public class BankTransferService implements TransferService {

    @Override
    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        // assuming bank always has money
        to.getWallet().addMoney(amount);
        System.out.println("bank transfer successful");
    }
}
