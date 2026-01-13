package oops.scenario.DigitalWalletSystem;

public class WalletTransferService implements TransferService {

    @Override
    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {

        if (from.getWallet().getBalance() < amount) {
            throw new InsufficientBalanceException("insufficient wallet balance");
        }

        from.getWallet().withdrawMoney(amount);
        to.getWallet().addMoney(amount);

        System.out.println("wallet transfer successful");
    }
}
